package javaAssignmentOops;


import java.util.ArrayList;

class Manager extends Assignment2Q2 {    
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary + incentive;
    }
}

class Labour extends Assignment2Q2 {
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary) {
        return salary;
    }

    public int totalEmployeesSalary(ArrayList<Assignment2Q2> employees) {
        int total = 0;
        for (Assignment2Q2 employee : employees) {
            total += employee.getSalary(salary);
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Assignment2Q2> employees = new ArrayList<>();
        employees.add(new Manager());
        employees.add(new Labour());

        Assignment2Q2 org = new Assignment2Q2();
        int total = org.totalEmployeesSalary(employees);
        System.out.println("Total salary of all employees: " + total);
    }
}


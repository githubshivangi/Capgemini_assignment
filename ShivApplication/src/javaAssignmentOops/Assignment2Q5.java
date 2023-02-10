package javaAssignmentOops;

abstract class Shape5 {
    abstract public String draw();
}

class Line5 extends Shape5 {
    @Override
    public String draw() {
        return "Drawing a Line";
    }
}

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return "Drawing a Rectangle";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return "Drawing a Cube";
    }
}

public class Assignment2Q5 {
    public static void main(String[] args) {
        Shape5 line = new Line5();
        Shape5 rectangle = new Rectangle5();
        Shape5 cube = new Cube5();

        System.out.println(line.draw());
        System.out.println(rectangle.draw());
        System.out.println(cube.draw());
    }
}


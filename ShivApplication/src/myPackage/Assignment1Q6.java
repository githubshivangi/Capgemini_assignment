package myPackage;

import java.util.Scanner;
class Login {
    private final String userId = "Ajay";
    private final String password = "password";

    public String loginUser(String user, String pass) {
        if (userId.equals(user) && password.equals(pass)) {
            return "Welcome " + user;
        } else {
            return "You have entered wrong credentials ,please enter the right credentials";
        }
    }
}

public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter User ID: ");
            String user = sc.nextLine();
            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            String result = login.loginUser(user, pass);
            System.out.println(result);

            if (result.startsWith("Welcome")) {
                break;
            }
            attempts++;
        }
        if (attempts == 3) {
            System.out.println("Contact Admin");
        }
    }
}


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-----CREATE YOUR ACCOUNT-----");

        System.out.println("PLEASE INSERT YOUR NAME:");
        String name = scanner.nextLine();

        System.out.println("PLEASE INSERT YOUR EMAIL:");
        String email = scanner.nextLine();

        if (email.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
            createAccount(name, email);
        } else {
            System.out.println("email should be like this EXAMPLE@GMAIL.COM");
            System.out.println("please insert your email");
            String conemail = scanner.nextLine();

            if (conemail.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
                createAccount(name, conemail);
            } else {
                System.out.println("confirm your email and try again later");
            }
        }
    }

    static void createAccount(String name, String email) {
        System.out.println("PLEASE INSERT YOUR AGE:");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        String password;
        String confirmPassword;

        while (true) {
            System.out.println("PLEASE INSERT YOUR PASSWORD:");
            password = scanner.nextLine();

            System.out.println("PLEASE CONFIRM YOUR PASSWORD:");
            confirmPassword = scanner.nextLine();

            if (password.equals(confirmPassword)) {
                System.out.println("Account created! Welcome, " + name);
                break; // exit the loop, we're done
            } else {
                System.out.println("Passwords do not match. Please try again.");
                // loop repeats automatically
            }
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
static HashMap<String,String> users=new HashMap<>();
    public static void main(String[] args) {
        System.out.println("--------WELCOME TO SKIDOS--------");
        options();
    }

    static void options() {
        System.out.println("1:CREATE ACCOUNT\n2:SIGN IN");
        int num = scanner.nextInt();
        scanner.nextLine(); // clear leftover newline before using nextLine()

        if (num == 1) {
            createaccount();
        } else if (num == 2) {
            signininputs();
        } else {
            System.out.println("INVALID CHOICE");
            options();
        }
    }

    static void signininputs() {
        System.out.println("INPUT YOUR DETAILS:");

       String email=emailchecker();
        System.out.println("PASSWORD:");
        String password = scanner.nextLine();
if(users.containsKey(email) && users.get(email).equals(password)){
            System.out.println("WELCOME TO SKIDOS " + email);
        }
       else{
           System.out.println("invalid email or password. plase try again");
           signininputs();
        }
    }

    static void createaccount() {
        System.out.println("INPUT YOUR DETAILS");
        System.out.println("NAME:");
        String name = scanner.nextLine();
        String email=emailchecker();
        String password = passwordcheck();
        users.put(email,password);
        System.out.println("WELCOME TO SKIDOS " + name);
    }
static String emailchecker(){
        while(true) {
            System.out.println("EMAIL:");
            String email = scanner.nextLine();
            if (email.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
                return email;
            }
            else {
                System.out.println("EMAIL MUST BE IN THIS FORM : EXAMPLE@GMAIL.COM");
            }
        }
}
    // Keeps asking until password and confirmation match, then returns the password
    static String passwordcheck() {
        while (true) {
            System.out.println("PASSWORD:");
            String password = scanner.nextLine();
            System.out.println("CONFIRM PASSWORD:");
            String confirmpassword = scanner.nextLine();

            if (password.equals(confirmpassword)) {
                return password;
            } else {
                System.out.println("PASSWORD MISMATCH, TRY AGAIN");
            }
        }
    }
}

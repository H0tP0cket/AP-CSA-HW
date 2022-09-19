import java.util.Scanner;

//Siddharth Srinivasan
//Period 6
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        int num1;
        int num2;
        String again;
        boolean play = true;
        while (play) {
            System.out.println("welcome to my calculator");
            System.out.print("Which operation would you like to perform? Please choose a number\n" +
                    "1. addition\n" +
                    "2. subtraction\n" +
                    "3. multiplcation\n" +
                    "4. division >> ");
            op = in.nextInt();

            System.out.print("Enter first number >> ");
            num1 = in.nextInt();
            System.out.print("Enter second number >> ");
            num2 = in.nextInt();
            if (op == 1) {
                System.out.println("addition time");

                System.out.println(num1 + num2);

            } else if (op == 2) {
                System.out.println("subtraction time");
                System.out.println(num1 - num2);
            } else if (op == 3) {
                System.out.println("multiplication time");
                System.out.println(num1 * num2);
            } else if (op == 4) {
                System.out.println("division time");
                System.out.print("do you want your answer as 1. with a decimal, or 2. with a remainder? >> ");
                int answer = in.nextInt();
                if (answer == 1) {
                    System.out.println(num1 / num2);
                } else if (answer == 2) {
                    System.out.println(num1 % num2);
                }
            }
            System.out.print("Would you like to do any more math?(yes/no) >> ");
            again = in.nextLine();
            again = in.nextLine();
            if (again.equals("yes")) {
                play = true;
            } else if (again.equals("no")) {
                play = false;
                System.out.print("bye");
            }

        }
        in.close();

    }
}
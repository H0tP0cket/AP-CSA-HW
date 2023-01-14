import java.util.Scanner;

public class classowrk {
    public static void main(String[] args) {
        String again;
        int bal = 1000;
        Scanner in = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.print("Would you like to withdraw or add money(w/a) >> ");
            String with = in.nextLine();
            if (with.equals("a")) {
                System.out.print("How much would you like to add>> ");
                int add = in.nextInt();
                bal += add;
            } else if (with.equals("w")) {
                System.out.print("How much would you like to withdraw >> ");
                int depo = in.nextInt();
                bal -= depo;
            }
            System.out.println("your balance now is >> " + bal + "$");
            System.out.print("Would you like to do deposit/withdraw again(yes/no) >> ");
            again = in.nextLine();
            again = in.nextLine();
            if (again.equals("yes")) {
                run = true;
            } else if (again.equals("no")) {
                run = false;
                System.out.print("bye, your final balance is " + bal + " $");
            }
        }
    }
}

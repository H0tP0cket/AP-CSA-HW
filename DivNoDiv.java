import java.util.*;
//SIDDHARTH SRINIVASAN
//PERIOD 6

public class DivNoDiv {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers below");

        // take numbers to divide
        System.out.print("Dividend >> ");
        int base = in.nextInt();
        in.nextLine();
        System.out.print("Divisor >> ");
        int div = in.nextInt();
        in.nextLine();

        int q, i;
        q = 0;
        i = 0;
        boolean play = true;

        // whole number quotient
        while (base >= i + div && play) {
            i += div;
            q++;
        }

        // end program if no remainder
        if (base == i) {
            play = false;
            System.out.print(q);

        }
        System.out.print(q + ".");

        // 10 remainders
        int remainder;
        while (base - i != 0) {
            int q2 = 0;
            int dec = 0;
            remainder = base - i;
            remainder = remainder + remainder + remainder + remainder + remainder + remainder +
                    remainder + remainder + remainder + remainder;
            while (remainder >= dec + div) {
                dec += div;
                q2++;
                if (dec == remainder) {
                    System.out.print(q2);
                    System.exit(404);
                }
            }
            // set remainder as the dividend and then count as the decimal
            System.out.print(q2);
            base = remainder;
            i = dec;
        }
    }
}
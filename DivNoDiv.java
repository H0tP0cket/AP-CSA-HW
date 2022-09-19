
import java.util.Scanner;

public class DivNoDiv {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number >>  ");
        int a = in.nextInt();
        System.out.print("Enter another one >> ");
        int b = in.nextInt();
        int c = 0;
        while (a >= b) {
            a -= b;
            c++;
        }
        System.out.println("=" + c);
    }
}
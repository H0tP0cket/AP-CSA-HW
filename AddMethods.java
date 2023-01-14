import java.util.Scanner;

//siddharth srinivasan
public class AddMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number(base if you choose exponent) >> ");
        int n = in.nextInt();
        System.out.print("enter another one >> ");
        int n2 = in.nextInt();
        in.nextLine();
        System.out.print("Would you like to add, multiply, or power >> ");
        String thing = in.nextLine();
        if (thing.equals("add")) {
            System.out.println(add(n, n2));
        } else if (thing.equals("multiply")) {
            System.out.println(multiply(n, n2));
        } else if (thing.equals("power")) {
            System.out.println(power(n, n2));
        }

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        int res = 0;
        for (int i = 1; i <= add(a - a, b); i++) {
            res += a;
        }
        return res;
    }

    public static int power(int a, int b) {
        int res = 1;
        while (b != 0) {
            res = multiply(res, a);
            b--;
        }
        return res;
    }

}

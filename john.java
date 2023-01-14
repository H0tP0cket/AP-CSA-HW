import java.util.Scanner;

public class john {
    private static void Zpattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 1; j <= n - (i + 1); j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void LCM() {

        int n1 = 100, n2 = 900;

        for (int i = 1; i <= n1 * n2; i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("lcm is " + i);
                break;
            }

        }

    }

    public static void LCM2() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        boolean answer = false;
        int a = x;
        int b = y;
        while (!answer) {
            if (a < b) {
                a += x;
            }
            if (b < a) {
                b += y;
            }
            if (a == b) {
                int lcm = a;
                answer = true;
                System.out.println(lcm);
            }
        }
    }

    public static void lit() {

        int a = 20;
        int b = 30;
        int c = 10;
        int tmp;
        for (int i = 0; i <= 3; i++) {
            if (a > b) {
                tmp = a;
                a = b;
                b = tmp;
            }
            if (b > c) {
                tmp = b;
                b = c;
                c = tmp;
            }
        }
        if ((b - a) == (c - b)) {
            System.out.println("hella lit");
        }

    }

    public static void triangles() {
        int count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static String decimalToBinary(int value) {

        // String binaryOut = "";
        // int counter = 0;
        int remainder = 0;
        String binaryNum = "";
        while (value != 0) {
            remainder = value % 2;
            value /= 2;
            binaryNum = remainder + binaryNum;
        }
        return binaryNum;
    }

    public static int replacesix(int n) {
        int result = 0;
        int mult = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem != 6) {
                result += rem * mult;
                mult *= 10;
            }
            n /= 10;

        }
        return result;
    }

    public static void repeat() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Zpattern(5);
        // LCM();
        // lit();
        // triangles();
        // repeat();
        // System.out.println(replacesix(462));
        sum();

    }

    public static void sum() {
        int x = 2;
        int y = 7;
        int z = x += (y /= 2);
        System.out.println(z);

    }
}

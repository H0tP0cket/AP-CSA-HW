import java.util.Scanner;

//siddharth srinivasan period 6
public class ArrayFrac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a numerator for first fraction >> ");
        int n1 = in.nextInt();
        System.out.print("Enter a denominator for first fraction >> ");
        int d1 = in.nextInt();
        System.out.print("Enter a numerator for second fraction >> ");
        int n2 = in.nextInt();
        System.out.print("Enter a denominator for second fraction >> ");
        int d2 = in.nextInt();
        int[] frac1 = { n1, d1 };
        int[] frac2 = { n2, d2 };

        System.out.println("Select the corresponding number for the desired operation: ");
        System.out.println(" 1.  Addition \n 2.  Subtraction \n 3. Multiply \n 4.  Divison \n 5. Simplify");
        int sel = in.nextInt();
        if (sel == 1) {
            System.out.print("sum :");
            Add(frac1, frac2);
        }
        if (sel == 2) {
            System.out.print("difference :");
            Sub(frac1, frac2);
        }
        if (sel == 3) {
            System.out.print("product :");
            Mult(frac1, frac2);
        }
        if (sel == 4) {
            System.out.print("quotient :");
            Div(frac1, frac2);
        }
        if (sel == 5) {
            System.out.print("fraction 1 simplified, fraction 2 simplified: ");
            Simplify(frac1);
            Simplify(frac2);
            System.out.println(frac1[0] + "/" + frac1[1] + ", ");
            System.out.print(frac2[0] + "/" + frac2[1]);
        }

    }

    static int gcd(int[] a) {
        {

            int n1 = a[0], n2 = a[1];

            int gcd = 1;

            for (int i = 1; i <= n1 && i <= n2; i++) {

                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
            return gcd;
        }
    }

    static int[] Simplify(int[] a) {
        int gcd = gcd(a);
        a[0] = a[0] / gcd;
        a[1] = a[1] / gcd;
        // System.out.println(a[0] / gcd + "/" + a[1] / gcd);
        return a;
    }

    public static void Add(int[] a, int[] b) {

        int n1 = a[0];

        int d1 = a[1];

        int n2 = b[0];

        int d2 = b[1];

        int nAdd = n1 * d2 + n2 * d1;

        int dAdd = d1 * d2;
        int[] sum = new int[] { nAdd, dAdd };

        Simplify(sum);
        System.out.println(sum[0] + "/" + sum[1]);

    }

    public static void Sub(int[] a, int[] b) {

        int n1 = a[0];

        int d1 = a[1];

        int n2 = b[0];

        int d2 = b[1];

        int nAdd = n1 * d2 - n2 * d1;

        int dAdd = d1 * d2;
        int[] sum = new int[] { nAdd, dAdd };

        Simplify(sum);
        System.out.println(sum[0] + "/" + sum[1]);

    }

    public static void Mult(int[] a, int[] b) {

        int n1 = a[0];

        int d1 = a[1];

        int n2 = b[0];

        int d2 = b[1];

        int nAdd = n1 * n2;

        int dAdd = d1 * d2;
        int[] sum = new int[] { nAdd, dAdd };

        Simplify(sum);
        System.out.println(sum[0] + "/" + sum[1]);

    }

    public static void Div(int[] a, int[] b) {
        int[] sum;
        int n1 = a[0];

        int d1 = a[1];

        int n2 = b[0];

        int d2 = b[1];

        int nAdd = n1 / n2;

        int dAdd = d1 / d2;

        if (d1 == d2) {
            sum = new int[] { n1, n2 };
        } else {
            sum = new int[] { nAdd, dAdd };
        }

        Simplify(sum);
        System.out.println(sum[0] + "/" + sum[1]);

    }
}

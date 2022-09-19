import java.util.Scanner;

//Siddharth Srinivasan
//Period 6
public class WhileWS {
    public static void main(String[] args) {
        // #1 print 1-10
        // int x = 1;
        // while (x <= 10) {
        // System.out.println(x);
        // x++;
        // }

        // #2 sum 1-10
        // int x = 10;
        // int count = 0;
        // for (int i = 1; i <= x; i++) {
        // count += i;
        // }
        // System.out.println("sum is: " + count);

        // #3 multiplication table
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter number you want: ");
        // int num = in.nextInt();

        // for (int i = 1; i <= num; i++) {

        // for (int j = 1; j <= num; j++) {
        // System.out.format("%4d", i * j);
        // }
        // System.out.println();
        // }

        // #4 factorial
        // Scanner in = new Scanner(System.in);
        // System.out.print("enter a number and it will return factorial: ");
        // int x = in.nextInt();
        // int count = 1;
        // for (int i = 1; i <= x; i++) {
        // count = count * i;
        // }
        // System.out.println(count);

        // #5 powers
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter the base: ");
        // int base = in.nextInt();
        // System.out.print("Enter the exponent: ");
        // int exponent = in.nextInt();
        // int stored = exponent;
        // int power = 1;
        // while (exponent != 0) {
        // power = power * base;
        // --exponent;
        // }
        // System.out.println(base + "^" + stored + " is: " + power);

        // #6 Digits reversed
        // Scanner in = new Scanner(System.in);
        // System.out.print("enter an integer >> ");
        // int value = in.nextInt();
        // int stored = value;
        // int count = 0;
        // int mult = 10;
        // int sub = 1;

        // while (stored > mult / 10) {
        // while (value % mult != 0) {
        // value = value - sub;
        // count++;

        // }
        // if (value % mult == 0) {
        // System.out.print(count);
        // mult = mult * 10;
        // sub = sub * 10;
        // count = 0;
        // }
        // }

        // #7 pos integer to sum of negative integers
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter a positive integer >> ");
        // int input = in.nextInt();
        // int x = 1;
        // int total = 0;
        // while (x <= input) {
        // total = total + x;
        // x = x + 2;
        // }
        // System.out.println(total);
        // }

        // #8 input a positive int then output if it is prime or not
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter an integer >> ");
        // int num = in.nextInt();
        // int i = 2;
        // boolean check = true;
        // while (i <= num / 2) {
        // // condition for nonprime number
        // if (num % i == 0) {
        // check = false;
        // break;
        // }

        // ++i;
        // }

        // if (check) {
        // System.out.println(num + " is prime");
        // } else {
        // System.out.println(num + " is not prime");
        // }
    }
}

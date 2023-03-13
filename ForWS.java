import java.util.Scanner;

//Siddharth Srinivasan
//Period 6
public class ForWS {

  public static void main(String[] args) {
    // #1 print 1-10(DID WHILE LOOPS LAST TIME FOR LOOPS THIS TIME)

    // for (int x = 1; x <= 10; x++) {
    // System.out.println(x);

    // }

    // #2 sum 1-10 did with for loops last time while loop this time
    // int x = 10;
    // int count = 0;
    // int i = 1;
    // while (i <= x) {
    // i++;
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

    // #4 factorial done with for loop originally now doing with while loop
    // Scanner in = new Scanner(System.in);
    // System.out.print("enter a number and it will return factorial: ");
    // int x = in.nextInt();
    // int count = 1;
    // int i = 1;
    // while (i <= x) {
    // count = count * i;
    // i++;
    // }
    // System.out.println(count);

    // #5 powers did with while loop initally now doing with for loop
    // Scanner in = new Scanner(System.in);
    // System.out.print("Enter the base: ");
    // int base = in.nextInt();
    // System.out.print("Enter the exponent: ");
    // int exponent = in.nextInt();
    // int stored = exponent;
    // int power = 1;
    // for (;exponent != 0;exponent--) {
    // power = power * base;
    //
    // }
    // System.out.println(base + "^" + stored + " is: " + power);

    // #6 Digits reversed originally with while loop now with for loop
    // Scanner in = new Scanner(System.in);
    // System.out.println("enter a number >> ");
    // int num = in.nextInt();

    // int reverse = 0;
    // // we have not mentioned the initialization part of the for loop
    // for (; num != 0; num = num / 10) {
    // int remainder = num % 10;
    // reverse = reverse * 10 + remainder;
    // }
    // System.out.println("The reverse of the given number is: " + reverse);

    // #7 pos integer to sum of negative integers originally with while loop now
    // with for loop
    // with for loop
    // Scanner in = new Scanner(System.in);
    // System.out.print("Enter a positive integer >> ");
    // int input = in.nextInt();
    //
    // int total = 0;
    // while (int x =1;x <= input; x=x+2) {
    // total = total + x;
    //
    // }
    // System.out.println(total);
    // }

    // #8 input a positive int then output if it is prime or not originally done
    // with while loop now with for loop
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer >> ");
    int num = in.nextInt();

    boolean check = true;
    for (int i = 2; i <= num / 2; i++) {
      // condition for nonprime number
      if (num % i == 0) {
        check = false;
        break;
      }
    }

    if (check) {
      System.out.println(num + " is prime");
    } else {
      System.out.println(num + " is not prime");
    }
  }
}

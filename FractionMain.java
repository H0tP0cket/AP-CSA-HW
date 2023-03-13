import java.util.Scanner;

public class FractionMain {

  //siddharth srinivasan period 6
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print(
      "Do you want to input a regular or mixed fraction(r/m)? >> "
    );
    String answer = in.nextLine();
    if (answer.equals("r")) 
    {
      
      System.out.print("Enter the numerator of the first fraction >> ");
      int n1 = in.nextInt();
      System.out.print("Enter the denominator of the first fraction >> ");
      int d1 = in.nextInt();
      System.out.print("Enter the numerator of the second fraction >> ");
      int n2 = in.nextInt();
      System.out.print("Enter the denominator of the second fraction >> ");
      int d2 = in.nextInt();
      Fraction frac1 = new Fraction(n1, d1);
      Fraction frac2 = new Fraction(n2, d2);
      System.out.println(
        "Select the corresponding number for the desired operation: "
      );
      System.out.println(
        " 1.  Addition \n 2.  Subtraction \n 3. Multiply \n 4.  Divison \n 5. Simplify"
      );
      int sel = in.nextInt();
      in.nextLine();
      if (sel == 1) {
        System.out.print("sum :");
        System.out.println(Add(frac1, frac2).toString());
      }
      if (sel == 2) {
        System.out.print("difference :");
        System.out.println(Sub(frac1, frac2).toString());
      }
      if (sel == 3) {
        System.out.print("product :");
        System.out.println(Mult(frac1, frac2).toString());
      }
      if (sel == 4) {
        System.out.print("quotient :");
        System.out.println(Div(frac1, frac2).toString());
      }
      in.nextLine();
      if (sel == 5) {
        System.out.print("fraction 1 simplified, fraction 2 simplified: ");
        Fraction.Simplify(frac1);
        Fraction.Simplify(frac2);
        System.out.println(frac1.toString());
        System.out.print(frac2.toString());
      }
    } else if (answer.equals("m")) {
      System.out.print("Enter the whole number of the first fraction >> ");
      int w1 = in.nextInt();
      System.out.print("Enter the numerator of the first fraction >> ");
      int n1 = in.nextInt();
      System.out.print("Enter the denominator of the first fraction >> ");
      int d1 = in.nextInt();
      System.out.print("Enter the whole number of the second fraction >> ");
      int w2 = in.nextInt();
      System.out.print("Enter the numerator of the second fraction >> ");
      int n2 = in.nextInt();
      System.out.print("Enter the denominator of the second fraction >> ");
      int d2 = in.nextInt();

      FractionMixed Fract1 = new FractionMixed(w1, n1, d1);
      FractionMixed Fract2 = new FractionMixed(w2, n2, d2);
      Fraction mFrac1 = Fract1.convert(Fract1);
      Fraction mFrac2 = Fract2.convert(Fract2);
      System.out.println(mFrac1.toString());
      System.out.println(mFrac2.toString());

      System.out.println(
        "Select the corresponding number for the desired operation: "
      );
      System.out.println(
        " 1.  Addition \n 2.  Subtraction \n 3. Multiply \n 4.  Divison \n 5. Simplify"
      );

      int sel = in.nextInt();
      in.nextLine();
      if (sel == 1) {
        System.out.println(
          "would you like your answer as a mixed fraction or a regular fraction(m/r)?"
        );
        String ans = in.nextLine();

        if (ans.equals("m")) {
          System.out.print("sum :");
          Fraction real = Add(mFrac1, mFrac2);

          FractionMixed mixed = Fract1.convertBack(real);
          System.out.println(mixed.toString());
        } else if (ans.equals("r")) {
          System.out.print("sum :");
          System.out.println(Add(mFrac1, mFrac2).toString());
        }
      }
      if (sel == 2) {
        System.out.println(
          "would you like your answer as a mixed fraction or a regular fraction(m/r)?"
        );
        String ans = in.nextLine();

        if (ans.equals("m")) {
          System.out.print("sum :");
          Fraction real = Sub(mFrac1, mFrac2);

          FractionMixed mixed = Fract1.convertBack(real);
          System.out.println(mixed.toString());
        } else if (ans.equals("r")) {
          System.out.print("difference :");
          System.out.println(Sub(mFrac1, mFrac2).toString());
        }
      }
      if (sel == 3) {
        System.out.println(
          "would you like your answer as a mixed fraction or a regular fraction(m/r)?"
        );
        String ans = in.nextLine();

        if (ans.equals("m")) {
          System.out.print("sum :");
          Fraction real = Mult(mFrac1, mFrac2);

          FractionMixed mixed = Fract1.convertBack(real);
          System.out.println(mixed.toString());
        } else if (ans.equals("r")) {
          System.out.print("product :");
          System.out.println(Mult(mFrac1, mFrac2).toString());
        }
      }
      if (sel == 4) {
        System.out.println(
          "would you like your answer as a mixed fraction or a regular fraction(m/r)?"
        );
        String ans = in.nextLine();

        if (ans.equals("m")) {
          System.out.print("sum :");
          Fraction real = Div(mFrac1, mFrac2);

          FractionMixed mixed = Fract1.convertBack(real);
          System.out.println(mixed.toString());
        } else if (ans.equals("r")) {
          System.out.print("quotient:");
          System.out.println(Div(mFrac1, mFrac2).toString());
        }
      }
      in.nextLine();
      if (sel == 5) {
        System.out.print("fraction 1 simplified, fraction 2 simplified: ");
        Fraction.Simplify(mFrac1);
        Fraction.Simplify(mFrac2);
        System.out.println(mFrac1.toString());
        System.out.print(mFrac2.toString());
      }
    }
  }

  public static Fraction Sub(Fraction a, Fraction b) {
    int n1 = a.getNum();

    int d1 = a.getDenom();

    int n2 = b.getNum();

    int d2 = b.getDenom();

    int nAdd = n1 * d2 - n2 * d1;

    int dAdd = d1 * d2;
    Fraction sum = new Fraction(nAdd, dAdd);

    Fraction.Simplify(sum);

    return sum;
  }

  public static Fraction Add(Fraction a, Fraction b) {
    int n1 = a.getNum();

    int d1 = a.getDenom();

    int n2 = b.getNum();

    int d2 = b.getDenom();

    int nAdd = n1 * d2 + n2 * d1;

    int dAdd = d1 * d2;
    Fraction sum = new Fraction(nAdd, dAdd);

    Fraction.Simplify(sum);
    return sum;
  }

  public static Fraction Mult(Fraction a, Fraction b) {
    int n1 = a.getNum();

    int d1 = a.getDenom();

    int n2 = b.getNum();

    int d2 = b.getDenom();

    int nAdd = n1 * n2;

    int dAdd = d1 * d2;
    Fraction sum = new Fraction(nAdd, dAdd);

    Fraction.Simplify(sum);
    return sum;
  }

  public static Fraction Div(Fraction a, Fraction b) {
    int n1 = a.getNum();

    int d1 = a.getDenom();

    int n2 = b.getNum();

    int d2 = b.getDenom();

    int nAdd = n1 / n2;

    int dAdd = d1 / d2;
    Fraction sum = new Fraction(nAdd, dAdd);

    Fraction.Simplify(sum);
    return sum;
  }
}

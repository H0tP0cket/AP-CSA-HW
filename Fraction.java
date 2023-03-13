//siddharth srinivasan period 6

public class Fraction {

  private int num;
  private int denom;

  //made a fraction object
  public Fraction(int a, int b) {
    num = a;
    denom = b;
  }

  public int getNum() {
    return num;
  }

  public int getDenom() {
    return denom;
  }

  public void setNum(int a) {
    num = a;
  }

  public void setDenom(int a) {
    denom = a;
  }

  static int gcd(Fraction a) {
    {
      int n1 = a.num, n2 = a.denom;

      int gcd = 1;

      for (int i = 1; i <= n1 && i <= n2; i++) {
        if (n1 % i == 0 && n2 % i == 0) {
          gcd = i;
        }
      }
      return gcd;
    }
  }

  static Fraction Simplify(Fraction a) {
    int gcd = gcd(a);
    a.num = a.num / gcd;
    a.denom = a.denom / gcd;

    return a;
  }

  public String toString() {
    return num + "/" + denom;
  }
}

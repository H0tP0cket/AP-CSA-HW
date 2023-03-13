import java.util.Scanner;

public class FractionMixed extends Fraction {

  private int wholeNumber;

  public FractionMixed(int whole, int num, int denom) {
    super(num, denom);
    wholeNumber = whole;
  }

  public int getWhole() {
    return wholeNumber;
  }

  public void setWhole(int wholeNumber) {
    this.wholeNumber = wholeNumber;
  }

  public Fraction convert(FractionMixed a) {
    int newNum = wholeNumber * a.getDenom() + getNum();
    Fraction b = new Fraction(newNum, a.getDenom());
    return b;
  }

  public FractionMixed convertBack(Fraction a) {
    FractionMixed b = new FractionMixed(
      a.getNum() / a.getDenom(),
      a.getNum() % a.getDenom(),
      a.getDenom()
    );
    return b;
  }

  public String toString() {
    return wholeNumber + " and " + getNum() + "/" + getDenom();
  }
}

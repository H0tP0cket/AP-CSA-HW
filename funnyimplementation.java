import java.util.ArrayList;

public class funnyimplementation extends funnyclass {

  private int number3;

  public funnyimplementation(int number, int number2, int number3) {
    super(number, number2);
    this.number3 = number3;
  }

  public double getAttribute3() {
    return number3;
  }

  public void setattribute3(int number3) {
    this.number3 = number3;
  }

  public void myAdditionalMethod() {}

  public void callMyAdditionalMethod() {
    super.myAdditionalMethod();
  }

  public void anotherMethod() {}

  public void thing(int a) {}

  public ArrayList<Integer> thing2(int a, int b) {
    return null;
  }
}

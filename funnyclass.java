public abstract class funnyclass implements funny {

  private int number;
  private int number2;

  public funnyclass(int number, int number2) {
    this.number = number;
    this.number2 = number2;
  }

  public int getNumber() {
    return number;
  }

  public int getNumber2() {
    return number2;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setNumber2(int number2) {
    this.number2 = number2;
  }

  public void methodOne(int variable) {}

  public void myAdditionalMethod() {}
}

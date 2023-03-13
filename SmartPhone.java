public class SmartPhone extends Computer {

  private double screenSize;

  public SmartPhone(
    String brand,
    String model,
    double price,
    double screenSize
  ) {
    super(brand, model, price);
    this.screenSize = screenSize;
  }

  public void call() {
    System.out.println("Smartphone is making a call...");
  }

  public void hangUp() {
    System.out.println("Smartphone is hanging up...");
  }

  public double getScreenSize() {
    return screenSize;
  }

  public int getId() {
    return super.getId();
  }
}

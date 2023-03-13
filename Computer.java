public class Computer extends Abstraction {

  private String brand;
  private String model;
  private double price;

  public Computer(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
  }

  public void turnOn() {
    System.out.println("Computer is turning on...");
  }

  public void turnOff() {
    System.out.println("Computer is turning off...");
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public double getPrice() {
    return price;
  }

  public int getId() {
    return super.getId();
  }
}

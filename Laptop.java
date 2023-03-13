public class Laptop extends Computer {

  private double weight;

  public Laptop(String brand, String model, double price, double weight) {
    super(brand, model, price);
    this.weight = weight;
  }

  public void fold() {
    System.out.println("Laptop is folding...");
  }

  public void unfold() {
    System.out.println("Laptop is unfolding...");
  }

  public double getWeight() {
    return weight;
  }

  public int getId() {
    return super.getId();
  }
}

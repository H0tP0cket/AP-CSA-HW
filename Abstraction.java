import java.util.Random;

public class Abstraction {

  private int id;
  private static final Random rand = new Random();

  public Abstraction() {
    this.id = rand.nextInt() % 100000000;
  }

  public int getId() {
    return id;
  }
}

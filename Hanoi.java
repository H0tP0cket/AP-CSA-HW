public class Hanoi {

  public static void main(String[] args) {
    Hanoi(1, 2, 3, 3);
  }

  public static void Hanoi(int a, int b, int c, int disks) {
    if (disks == 1) {
      System.out.println("Move disk from " + a + " to " + c);
    } else {
      Hanoi(a, c, b, disks - 1);
      System.out.println("Move disk" + disks + " from " + a + " to " + c);
      Hanoi(b, a, c, disks - 1);
    }
  }
}

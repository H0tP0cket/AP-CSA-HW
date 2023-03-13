public class Sorting {

  public static void main(String[] args) {
    towerOfHanoi(3, 1, 2, 3);
  }

  public static int[] selectionSort(int[] a) {
    return null;
  }

  public static int[] insertionSort(int[] a) {
    return null;
  }

  static void towerOfHanoi(int n, int rod1, int rod2, int rod3) {
    if (n == 0) {
      return;
    }
    towerOfHanoi(n - 1, rod1, rod2, rod3);
    System.out.println(
      "Move disk " + n + " from rod " + rod1 + " to rod " + rod3
    );
    towerOfHanoi(n - 1, rod2, rod3, rod1);
  }
}

import java.util.ArrayList;

public class SuperAdder {

  public static void halal() {
    ArrayList<Integer> sum = new ArrayList<Integer>();
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(2);
    x.add(2);
    x.add(4);

    int len = x.size();
    ArrayList<Integer> y = new ArrayList<Integer>();
    y.add(1);
    y.add(1);
    int len2 = y.size();

    for (int i = 0; i < len || i < len2; i++) {
      int summation = (x.get(len - i - 1) + y.get(len2 - i - 1));
      // if (summation >= 10) {}
      sum.add(summation);
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    halal();
  }

  public static ArrayList<Integer> doubling(ArrayList<Integer> a) {
    ArrayList<Integer> clone = new ArrayList<Integer>();

    for (Integer i : a) {
      i *= 2;
      clone.add(i);
    }

    return clone;
  }

  public static ArrayList<Integer> release(int[] a) {
    ArrayList<Integer> clone = new ArrayList<Integer>();

    for (int i : a) {
      clone.add(i);
    }

    return clone;
  }

  public static int[] releaser(ArrayList<Integer> a) {
    int[] x = new int[a.size()];
    for (Integer i : a) {
      for (int j = 0; j < a.size(); j++) {
        x[j] = i;
      }
    }
    return x;
  }

  public static boolean either24(ArrayList<Integer> a) {
    boolean twofour = false;

    for (int i = 0; i < a.size() - 1; i++) {
      int f = a.get(i);
      int g = a.get(i + 1);
      if (f == g && (g == 2 || g == 4)) {
        twofour = true;
      }
      if (f == g && (g == 2 && g == 4)) {
        twofour = false;
      }
    }
    System.out.println(a);
    return twofour;
  }
}

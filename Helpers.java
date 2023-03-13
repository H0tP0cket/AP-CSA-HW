//siddharth srinivasan period 6
public class Helpers {

  public static void main(String[] args) {
    int[] x = { 1, 2, 3, 4 };
  }

  public static int[] remove(int[] a, int loc) {
    int[] newA = new int[a.length - 1];
    for (int i = 0, j = 0; i < a.length; i++) {
      if (i != loc) {
        newA[j] = a[i];
        j++;
      }
    }
    return newA;
  }

  public static int[] add(int a[], int b, int loc) {
    int newarr[] = new int[a.length + 1];

    for (int i = 0; i < a.length; i++) {
      if (i < loc - 1) newarr[i] = a[i]; else if (i == loc - 1) newarr[i] =
        b; else newarr[i] = a[i - 1];
    }
    return newarr;
  }

  public static int[] remove(int[] a) {
    int[] newA = new int[a.length - 1];
    int loc = a.length - 1;
    for (int i = 0, j = 0; i < a.length; i++) {
      if (i != loc) {
        newA[j] = a[i];
        j++;
      }
    }
    return newA;
  }

  public static int[] add(int[] a, int b) {
    int[] result = a;
    result[result.length] = result[result.length - 1];
    return result;
  }

  public static void display(int[] a) {
    for (int number : a) {
      System.out.print(number + " ");
    }
  }

  public static int[] replace(int[] a, int b, int loc) {
    a[loc] = b;
    return a;
  }

  public static void reverseArray(int[] a) {
    int[] result = new int[a.length];

    for (int i = 0, j = a.length; i < a.length; i++) {
      result[j - 1] = a[i];
      j = j - 1;
    }
    display(result);
  }

  public static boolean check(int[] a, int e) {
    boolean test = false;
    for (int element : a) {
      if (element == e) {
        test = true;
        return test;
      }
    }
    return test;
  }

  public static int numberOf(int[] a, int b) {
    int num = 0;

    for (int i = 0; i < a.length; i++) {
      if (b == a[i]) {
        num++;
      }
    }
    return num;
  }
}

//Siddharth Srinivasan + Krishna Chunduri + Krishna Jamakhandi + Aaryan Suri
//Period 6

public class ArrayStringWS {
    public static void main(String[] args) {

        // int[] x = { 2, 10, 3, 4, 20, 5 };
        // System.out.println(balance("aaxbb"));
        // System.out.println(oneTwo("tcagdo"));
        // System.out.println(xyzThere(".xyz.abcxyz"));
        // System.out.println(modThree(x));
        // shiftLeft(x);
        // tenRun(x);

    }

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static boolean balance(String n) {
        boolean x = false;
        for (int i = 0; i < n.length(); i++) {
            if (n.substring(i, i + 1).equals("y")) {
                x = true;
            }
            if (n.substring(i, i + 1).equals("x") && !(n.substring(i, i + 1).equals("y"))) {
                return x;
            }
        }
        return x;
    }

    public static String oneTwo(String n) {
        String newString = "";
        for (int i = 0; i < n.length() - 2; i += 3) {
            newString = newString + n.substring(i + 1, i + 3) + n.substring(i, i + 1);
        }

        return newString;
    }

    public static boolean xyzThere(String n) {
        for (int i = 0; i < n.length() - 3; i++) {
            if (n.substring(i, i + 4).equals(".xyz")) {
                return false;
            }
        }
        return true;
    }

    public static boolean modThree(int[] a) {
        boolean result = false;
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] % 2 == a[i + 1] % 2 && a[i] % 2 == a[i + 2] % 2) {
                result = true;
            }
        }
        return result;
    }

    public static int[] shiftLeft(int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = a[0];
        return a;
    }

    public static int[] tenRun(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                temp = a[i];

            } else if (a[i] % 10 != 0) {
                a[i] = temp;
            }
        }
        return a;
    }

}

public class RandomWS {
    public static void main(String[] args) {
        // num1();
        // num2();
        // num3();
        // num4();
        // num5();
        // System.out.println(stringReverse("halal"));
        System.out.println(removeDoubles("haalal"));

    }

    public static void num1() {
        System.out.println((int) (Math.random() * 10) + 1);
    }

    public static void num2() {
        System.out.println((int) (Math.random() * 11));
    }

    public static void num3() {
        System.out.println((int) (Math.random() * 100) + 1);
    }

    public static void num4() {
        System.out.println((int) (Math.random() * 946) + 55);
    }

    public static void num5() {
        System.out.println((int) (Math.random() * 35) + 1);
    }

    public static String stringReverse(String n) {
        String newString = "";
        for (int i = 0; i < n.length(); i++) {
            String rev = n.substring(i, i + 1);
            newString = rev + newString;

        }
        return newString;
    }

    public static String removeDoubles(String n) {
        String x = "";
        String y = "";
        String newString = "";
        for (int i = 0; i < n.length(); i++) {
            x = n.substring(i, i + 1);
            y = n.substring(i + 1, i + 2);
            if (x.equals(y)) {
                i = n.length();
                newString = n.substring(0, n.indexOf(x))
                        + n.substring(n.indexOf(x) + 1);
            }

        }
        return newString;
    }

}

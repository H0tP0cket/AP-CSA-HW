public class notes {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        stuff(x);
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i] + " ");
        }

    }

    public static void stuff(int[] a) {
        a[1] = 10;
    }
}

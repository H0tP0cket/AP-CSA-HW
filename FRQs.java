public class FRQs {
    public static void main(String[] args) {
        int num;
        int i = -2;

        for (num = 1; num > 0; i++) {
            if (num % 10 == 2 || num % 10 == 7 || num % 10 == 7) {
                i++;
            }
            num = num / 10;

        }
        if (i == 1 || i == 2) {
            System.out.println("true");
        }
        if (i >= 3) {
            System.out.println("super true");
        }
        System.out.println(i);
    }
}

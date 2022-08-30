// Siddharth Srinivasan
// Period 6

public class Rocket {
    int n = 5;

    public static void rocket() {
        for (int i = 1; i <= 4; i++) {
            System.out.print(" ");
            for (int space = 1; space <= 4 - i; space++) {
                System.out.print(" ");
            }
            for (int side1 = 1; side1 <= i; side1++) {
                System.out.print("/");
            }

            for (int side2 = 1; side2 <= i; side2++) {
                System.out.print("\\");
            }
            System.out.println("  ");
        }
    }

    public static void body() {
        for (int i = 0; i < 3; i++) {
            System.out.println("|       |");
        }
    }

    public static void main(String[] args) {
        rocket();
        body();
        System.out.println("| \"hi\"  |");
        body();
        //this is the concatenation
        System.out.println("|___" + "____|");
        rocket();
    }
}

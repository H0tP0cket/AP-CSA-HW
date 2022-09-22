//siddharth srinivasan 
//period 6

public class NestedForWs {
    private static void number1() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= 0; i++) {
                System.out.println("");
            }
        }
    }

    private static void number2() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void number3() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    private static void number4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }

            System.out.println(i);
        }
    }

    private static void number5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void number6() {
        for (int i = 1; i <= 10; i += 2) {
            for (int j = 11 - i; j > 1; j -= 2) {
                System.out.print("-");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            for (int j = 11 - i; j > 1; j -= 2) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number1();
        number2();
        number3();
        number4();
        number5();
        number6();

    }

}
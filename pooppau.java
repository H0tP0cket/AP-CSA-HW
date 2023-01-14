import java.util.*;

public class pooppau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int num7;
        System.out.println("Please enter the first number: ");
        num1 = sc.nextInt();
        int max = num1;
        int min = num1;

        System.out.println("Please enter the second number: ");
        num2 = sc.nextInt();
        if (num2 > max) {
            max = num2;
        }
        if (num2 < min) {
            min = num2;
        }

        System.out.println("Please enter the third number: ");
        num3 = sc.nextInt();
        if (num3 > max) {
            max = num3;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.println("Please enter the fourth number: ");
        num4 = sc.nextInt();
        if (num4 > max) {
            max = num4;
        }
        if (num4 < min) {
            min = num4;
        }

        System.out.println("Please enter the fifth number: ");
        num5 = sc.nextInt();
        if (num5 > max) {
            max = num5;
        }
        if (num5 < min) {
            min = num5;
        }

        System.out.println("Please enter the sixth number: ");
        num6 = sc.nextInt();
        if (num6 > max) {
            max = num6;
        }
        if (num6 < min) {
            min = num6;
        }

        System.out.println("Please enter the seventh number: ");
        num7 = sc.nextInt();
        if (num7 > max) {
            max = num7;
        }
        if (num7 < min) {
            min = num7;
        }
        median(num1, num2, num3, num4, num5, num6, num7, min);
        mean(num1, num2, num3, num4, num5, num6, num7);
        mode(num1, num2, num3, num4, num5, num6, num7, min, max);
    }

    public static void median(int a, int b, int c, int d, int e, int f, int g, int mini) {
        int counter = 0;
        int ret = 0;
        for (int i = mini; counter < 4; i++) {
            if (i == a) {
                counter++; // adds counter for each number reached
            }
            if (i == b) {
                counter++;
            }
            if (i == c) {
                counter++;
            }
            if (i == d) {
                counter++;
            }
            if (i == e) {
                counter++;
            }
            if (i == f) {
                counter++;
            }
            if (i == g) {
                counter++;
            }
            if (counter >= 4) {
                ret = i;
            }
        }
        System.out.println(ret);
    }

    public static void mean(int a, int b, int c, int d, int e, int f, int g) {
        int sum = a + b + c + d + e + f + g;
        double preMean = (sum / 1.0) / 7.0; // converts to double.
        System.out.println(preMean);
    }

    public static void mode(int a, int b, int c, int d, int e, int f, int g, int mini, int maxi) {
        int mode1 = 0; // declaring variables
        int mode2 = 0;
        int mode3 = 0;
        int mode4 = 0;
        int mode5 = 0;
        int mode6 = 0;
        int mode7 = 0;
        int modenum1 = 0;
        int modenum2 = 0;
        int modenum3 = 0;
        int modenum4 = 0;
        int modenum5 = 0;
        int modenum6 = 0;
        int modenum7 = 0;
        int tempmode = 0;
        for (int i = mini; i <= maxi; i++) {
            tempmode = 0;
            if (i == a) {
                tempmode++;
            }
            if (i == b) {
                tempmode++;
            }
            if (i == c) {
                tempmode++;
            }
            if (i == d) {
                tempmode++;
            }
            if (i == e) {
                tempmode++;
            }
            if (i == f) {
                tempmode++;
            }
            if (i == g) {
                tempmode++;
            }
            if (tempmode > mode1) { // if the tempmode is greater than the previous mode,
                mode1 = tempmode; // set mode1 to the tempmode
                modenum1 = i; // set the number printed to i
                mode2 = 0; // set all other modes to 0 so they do not get printed
                mode3 = 0;
                mode4 = 0;
                mode5 = 0;
                mode6 = 0;
                mode7 = 0;
            } else if (tempmode == mode1) { // if the tempmode is equal to the previous mode,
                if (mode2 == 0) { // if mode2 is empty,
                    mode2 = tempmode; // set mode2 to tempmode, so modenum2 will be printed
                    modenum2 = i; // set modenum2 to be printed.
                } else if (mode3 == 0) { // if the tempmode is equal to 1 and 2, moves on to 3
                    mode3 = tempmode;
                    modenum3 = i;
                } else if (mode4 == 0) { // etc
                    mode4 = tempmode;
                    modenum4 = i;
                } else if (mode5 == 0) {
                    mode5 = tempmode;
                    modenum5 = i;
                } else if (mode6 == 0) {
                    mode6 = tempmode;
                    modenum6 = i;
                } else if (mode7 == 0) {
                    mode7 = tempmode;
                    modenum7 = i;
                }
            }
        }
        if (mode1 != 0) {
            System.out.print(modenum1 + " "); // print out the numbers that were mentioned previously
        }
        if (mode2 != 0) {
            System.out.print(modenum2 + " ");
        }
        if (mode3 != 0) {
            System.out.print(modenum3 + " ");
        }
        if (mode4 != 0) {
            System.out.print(modenum4 + " ");
        }
        if (mode5 != 0) {
            System.out.print(modenum5 + " ");
        }
        if (mode6 != 0) {
            System.out.print(modenum6 + " ");
        }
        if (mode7 != 0) {
            System.out.print(modenum7 + " ");
        }
    }
}


//siddharth srinivasan period 6
import java.util.Scanner;

public class LiuLau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1;
        int x2;
        int x3;
        int x4;
        int x5;
        int x6;
        int x7;
        System.out.println("enter number >> ");
        x1 = in.nextInt();
        int max = x1;
        int min = x1;

        System.out.println("enter number >> ");
        x2 = in.nextInt();
        if (x2 < min) {
            min = x2;
        }
        if (x2 > max) {
            max = x2;
        }

        System.out.println("enter number >> ");
        x3 = in.nextInt();
        if (x3 < min) {
            min = x3;
        }
        if (x3 > max) {
            max = x3;
        }

        System.out.println("enter number >> ");
        x4 = in.nextInt();
        if (x4 < min) {
            min = x4;
        }
        if (x4 > max) {
            max = x4;
        }

        System.out.println("enter number >> ");
        x5 = in.nextInt();
        if (x5 < min) {
            min = x5;
        }
        if (x5 > max) {
            max = x5;
        }

        System.out.println("enter number >> ");
        x6 = in.nextInt();
        if (x6 < min) {
            min = x6;
        }
        if (x6 > max) {
            max = x6;
        }

        System.out.println("enter number >> ");
        x7 = in.nextInt();
        if (x7 < min) {
            min = x7;
        }
        if (x7 > max) {
            max = x7;
        }

        System.out.println("the mean, median, mode of your data set are as follows >> ");
        System.out.println("mean : " + mean(x1, x2, x3, x4, x5, x6, x7));
        System.out.println("median : " + median(x1, x2, x3, x4, x5, x6, x7));
        System.out.print("mode : ");
        mode(x1, x2, x3, x4, x5, x6, x7, min, max);
        in.close();
    }

    private static double mean(int a, int b, int c, int d, int e, int f, int g) {
        return (a + b + c + d + e + f + g) / 7;

    }

    private static double median(int a, int b, int c, int d, int e, int f, int g) {
        int tmp;
        for (int i = 0; i <= 7; i++) {
            if (a > b) {
                tmp = a;
                a = b;
                b = tmp;
            }
            if (b > c) {
                tmp = b;
                b = c;
                c = tmp;
            }
            if (c > d) {
                tmp = c;
                c = d;
                d = tmp;
            }
            if (d > e) {
                tmp = d;
                d = e;
                e = tmp;
            }
            if (e > f) {
                tmp = e;
                e = f;
                f = tmp;
            }
            if (f > g) {
                tmp = f;
                f = g;
                g = tmp;
            }
        }
        return d;
    }

    public static void mode(int a, int b, int c, int d, int e, int f, int g, int min, int max) {

        int check1 = 0;
        int check2 = 0;
        int check3 = 0;
        int check4 = 0;
        int check5 = 0;
        int check6 = 0;
        int check7 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int tmp = 0;
        for (int i = min; i <= max; i++) {
            tmp = 0;
            if (i == a) {
                tmp++;
            }
            if (i == b) {
                tmp++;
            }
            if (i == c) {
                tmp++;
            }
            if (i == d) {
                tmp++;
            }
            if (i == e) {
                tmp++;
            }
            if (i == f) {
                tmp++;
            }
            if (i == g) {
                tmp++;
            }
            if (tmp == count1) {
                if (count2 == 0) {
                    count2 = tmp;
                    check2 = i;
                } else if (count3 == 0) {
                    count3 = tmp;
                    check3 = i;
                } else if (count4 == 0) {
                    count4 = tmp;
                    check4 = i;
                } else if (count5 == 0) {
                    count5 = tmp;
                    check5 = i;
                } else if (count6 == 0) {
                    count6 = tmp;
                    check6 = i;
                } else if (count7 == 0) {
                    count7 = tmp;
                    check7 = i;
                }
            } else if (tmp > count1) {
                count1 = tmp;
                check1 = i;
                count2 = 0;
                count3 = 0;
                count4 = 0;
                count5 = 0;
                count6 = 0;
                count7 = 0;
            }

        }
        if (count1 != 0) {
            System.out.print(check1 + " "); // print out the numbers that were mentioned previously
        }
        if (count2 != 0) {
            System.out.print(check2 + " ");
        }
        if (count3 != 0) {
            System.out.print(check3 + " ");
        }
        if (count4 != 0) {
            System.out.print(check4 + " ");
        }
        if (count5 != 0) {
            System.out.print(check5 + " ");
        }
        if (count6 != 0) {
            System.out.print(check6 + " ");
        }
        if (count7 != 0) {
            System.out.print(check7 + " ");
        }

    }

}

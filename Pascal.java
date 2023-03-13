import java.util.*;

//siddharth srinivasan period 6
public class Pascal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What row of pascal's triangle do you want to print >> ");
        int rows = in.nextInt();
        int a[] = new int[rows];
        for (int i = 0; i < rows; i++) {
            a[i] = 1;
            for (int j = 0; j <= i; j++) {
                if (i == (rows - 1)) {
                    System.out.print(a[i] + " ");
                }
                a[i] = a[i] * (i - j) / (j + 1);
            }
        }
        in.close();
    }
}
import java.util.Scanner;

//siddharth srinivasan period 6
public class ArraySorter {
    public static void main(String[] args) {
        sorting();
    }

    public static void sorting() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter how many numbers you want to input >> ");
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Please enter number >> ");
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = 0;
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.print(nums[i] + " ");
        }
        in.close();
    }
}
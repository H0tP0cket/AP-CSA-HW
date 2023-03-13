// import java.util.ArrayList;

// public class notes extends Helpers {

//   public static void main(String[] cock) {
//     int[][] x = { { 1, 2, 3 }, { 9, 9, 9 }, { 1, 2, 3 } };
//     System.out.println(isDiverse(x));
//   }

//   public static String[] fun(String a) {
//     String[] fun = new String[a.length()];
//     String consonants = "";
//     String vowels = "";
//     for (int i = 0; i < a.length(); i++) {
//       if (
//         !(
//           a.substring(i, i + 1).equals("a") ||
//           a.substring(i, i + 1).equals("e") ||
//           a.substring(i, i + 1).equals("i") ||
//           a.substring(i, i + 1).equals("o") ||
//           a.substring(i, i + 1).equals("u")
//         )
//       ) {
//         consonants += a.substring(i, i + 1);
//       }
//       if (
//         (
//           a.substring(i, i + 1).equals("a") ||
//           a.substring(i, i + 1).equals("e") ||
//           a.substring(i, i + 1).equals("i") ||
//           a.substring(i, i + 1).equals("o") ||
//           a.substring(i, i + 1).equals("u")
//         )
//       ) {
//         vowels += a.substring(i, i + 1);
//       }
//     }

//     for (int i = 0; i < a.length() - 1; i++) {
//       fun[i] = consonants.substring(i, i + 1);
//     }
//     for (int i = consonants.length(), j = 0; i < a.length(); i++) {
//       fun[i] = vowels.substring(j, j + 1);
//       j++;
//     }
//     return fun;
//   }

//   public static ArrayList<String> funner(String a) {
//     String[] fun = fun(a);
//     ArrayList<String> ret = new ArrayList<String>();
//     for (String b : fun) {
//       ret.add(b);
//     }
//     return ret;
//   }

//   public static int[] apples(ArrayList<Integer> a) {
//     int[] output = new int[a.size()];
//     return output;
//   }

//   public static int[] rowSum(int[][] b) {
//     int[] x = new int[b.length];

//     for (int i = 0; i < b.length; i++) {
//       x[i] = arraySum(b[i]);
//     }
//     return x;
//   }

//   public static int arraySum(int[] a) {
//     int sum = 0;
//     for (int x : a) {
//       sum += x;
//     }
//     return sum;
//   }

//   public static boolean isDiverse(int[][] b) {
//     boolean check = true;
//     int[] x = rowSum(b);
//     int y = arraySum(b[i]);
//     for (int i = 0; i < x.length - 1; i++) {
//       if (x[i] == y) {
//         check = false;
//       }
//     }
//     return check;
//   }

//   public int[] notAlone(int[] nums, int val) {

//     for(int i = 0; i<nums.length; i++){
//       if (nums[i] == val){
//         if(i == 0){
//           nums[i] = nums[i+1];
//         } else {
//           nums[i] = Math.max(nums[i-1],nums[i+1]);
//         }
//       }
//     }
//     return nums;
//   }

// }

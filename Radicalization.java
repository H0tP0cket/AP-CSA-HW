// import java.util.ArrayList;

// public class Radicalization {

//   public static void main(String args[]) {
//     int number;
//     number = 108;
//     int temp3 = 10;
//     ArrayList<Integer> list = new ArrayList<Integer>();
//     for (int i = 2; i < number; i++) {
//       while (number % i == 0) {
//         list.add(i);
//         number = number / i;

//         if (isPrime(number)) {
//           list.add(number);
//         }
//       }
//     }
//     System.out.println(list);
//     int temp = 1;
//     int temp2 = 1;
//     for (int i = 0; i < list.size() - 1; i += 2) {
//       if (list.get(i) == list.get(i + 1)) {
//         temp = list.get(i) * temp;
//       } else {
//         temp2 = list.get(i) * temp2;
//       }
//     }
//     System.out.println(temp + " root " + temp2);
//     System.out.println("root" + temp3);
//   }

//   public static boolean isPrime(int num) {
//     if (num <= 1) {
//       return false;
//     }
//     for (int i = 2; i <= num / 2; i++) {
//       if ((num % i) == 0) return false;
//     }
//     return true;
//   }
// }
//             if (list.get(i) == list.get(i + 1)) {
//                 temp = list.get(i) * temp;
//             } else {
//                 temp2 = list.get(i) * temp2;
//             }
//         }
//         System.out.println(temp + " root " + temp2);
//         System.out.println("root" + temp3);

//     }

//     public static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= num / 2; i++) {
//             if ((num % i) == 0)
//                 return false;
//         }
//         return true;
//     }
// }

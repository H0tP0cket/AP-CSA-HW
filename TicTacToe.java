// import java.util.*;

// //Siddharth Srinivasan
// //Period 6

// public class TicTacToe {

//   public static void main(String[] args) {
//     char num1 = '1', num2 = '2', num3 = '3', num4 = '4', num5 = '5', num6 =
//       '6', num7 = '7', num8 = '8', num9 = '9';
//     // intializer variables
//     boolean player1 = false, player2 = false;
//     int move1, move2;
//     int i = 0;
//     boolean play = true;
//     // while loop to play a game with multiple turns
//     while ((!player1 && !player2) || i < 9 && play) {
//       Scanner in = new Scanner(System.in);
//       // print grid
//       System.out.println(num1 + " | " + num2 + " | " + num3);
//       System.out.println(num4 + " | " + num5 + " | " + num6);
//       System.out.println(num7 + " | " + num8 + " | " + num9);
//       // input shouldn't be taken if there is more than 9 moves
//       if (i != 9) {
//         System.out.print("Player 1 move:");
//         move1 = in.nextInt();
//         i++;
//       } else {
//         move1 = in.nextInt();
//         play = false;
//       }
//       if (i != 9) {
//         System.out.print("Player 2 move:");
//         move2 = in.nextInt();
//         i++;
//       } else {
//         move2 = in.nextInt();
//         play = false;
//       }
//       // player 1 moves
//       if (move1 == 1) {
//         num1 = 'x';
//       } else if (move1 == 2) {
//         num2 = 'x';
//       } else if (move1 == 3) {
//         num3 = 'x';
//       } else if (move1 == 4) {
//         num4 = 'x';
//       } else if (move1 == 5) {
//         num5 = 'x';
//       } else if (move1 == 6) {
//         num6 = 'x';
//       } else if (move1 == 7) {
//         num7 = 'x';
//       } else if (move1 == 8) {
//         num8 = 'x';
//       } else if (move1 == 9) {
//         num9 = 'x';
//       }
//       // player 2 moves
//       if (move2 == 1) {
//         num1 = 'o';
//       } else if (move2 == 2) {
//         num2 = 'o';
//       } else if (move2 == 3) {
//         num3 = 'o';
//       } else if (move2 == 4) {
//         num4 = 'o';
//       } else if (move2 == 5) {
//         num5 = 'o';
//       } else if (move2 == 6) {
//         num6 = 'o';
//       } else if (move2 == 7) {
//         num7 = 'o';
//       } else if (move2 == 8) {
//         num8 = 'o';
//       } else if (move2 == 9) {
//         num9 = 'o';
//       }
//       // win cases
//       if (
//         (num1 == 'x' && num5 == 'x' && num9 == 'x') ||
//         (num3 == 'x' && num5 == 'x' && num7 == 'x') ||
//         (num1 == 'x' && num2 == 'x' && num3 == 'x') ||
//         (num4 == 'x' && num5 == 'x' && num6 == 'x') ||
//         (num7 == 'x' && num8 == 'x' && num9 == 'x') ||
//         (num1 == 'x' && num4 == 'x' && num7 == 'x') ||
//         (num2 == 'x' && num5 == 'x' && num8 == 'x') ||
//         (num3 == 'x' && num6 == 'x' && num9 == 'x')
//       ) {
//         player1 = true;
//         System.out.println("Player 1 wins");
//         play = false;
//       } else if (
//         (
//           (num1 == 'o' && num5 == 'o' && num9 == 'o') ||
//           (num3 == 'o' && num5 == 'o' && num7 == 'o') ||
//           (num1 == 'o' && num2 == 'o' && num3 == 'o') ||
//           (num4 == 'o' && num5 == 'o' && num6 == 'o') ||
//           (num7 == 'o' && num8 == 'o' && num9 == 'o') ||
//           (num1 == 'o' && num4 == 'o' && num7 == 'o') ||
//           (num2 == 'o' && num5 == 'o' && num8 == 'o') ||
//           (num3 == 'o' && num6 == 'o' && num9 == 'o')
//         ) &&
//         !(
//           (num1 == 'x' && num5 == 'x' && num9 == 'x') ||
//           (num3 == 'x' && num5 == 'x' && num7 == 'x') ||
//           (num1 == 'x' && num2 == 'x' && num3 == 'x') ||
//           (num4 == 'x' && num5 == 'x' && num6 == 'x') ||
//           (num7 == 'x' && num8 == 'x' && num9 == 'x') ||
//           (num1 == 'x' && num4 == 'x' && num7 == 'x') ||
//           (num2 == 'x' && num5 == 'x' && num8 == 'x') ||
//           (num3 == 'x' && num6 == 'x' && num9 == 'x')
//         )
//       ) {
//         player2 = true;
//         System.out.println("Player 2 wins");
//         play = false;
//       }
//     }
//     // final game board
//     System.out.println(num1 + " | " + num2 + " | " + num3);
//     System.out.println(num4 + " | " + num5 + " | " + num6);
//     System.out.println(num7 + " | " + num8 + " | " + num9);
//     // draw case
//     if (!player1 && !player2) {
//       System.out.println("Draw");
//     }
//   }
// }

// import java.math.*;
// import java.util.*;

// class Main {

//   public static int bank = 1000;
//   static Helpers help = new Helpers();

//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);

//     int[] cards = {
//       1,
//       1,
//       1,
//       1,
//       2,
//       2,
//       2,
//       2,
//       3,
//       3,
//       3,
//       3,
//       4,
//       4,
//       4,
//       4,
//       5,
//       5,
//       5,
//       5,
//       6,
//       6,
//       6,
//       6,
//       7,
//       7,
//       7,
//       7,
//       8,
//       8,
//       8,
//       8,
//       9,
//       9,
//       9,
//       9,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//     };

//     boolean play = true;
//     String answer = "hit";
//     String again = "y";
//     while (again.equals("y") && bank > 0) {
//       int playerScore = 0;
//       int dealerScore = 0;
//       int showPlayer = 2;
//       int showDealer = 0;
//       System.out.println("How much would you like to bet? >> ");
//       int bet = in.nextInt();
//       int[] player = dealHand(cards);

//       int[] dealer = dealHand(cards);
//       while (answer.equals("hit") && scoring(player, showPlayer) < 21) {
//         System.out.print("your cards are >>  ");
//         printHand(player, showPlayer);
//         System.out.println("Your Score is >> " + scoring(player, showPlayer));
//         System.out.print("Dealer hand is >>");
//         printHand(dealer, 1);
//         System.out.print("Would you like to hit or stand? >> ");
//         answer = in.nextLine();
//         in.nextLine();
//         if (answer.equals("hit")) {
//           showPlayer += 1;
//         }
//       }
//       while (scoring(dealer, showDealer) < 17) {
//         showDealer++;
//       }

//       System.out.println("dealer score is " + scoring(dealer, showDealer));

//       printHand(dealer, showDealer);

//       System.out.println("your score is " + scoring(player, showPlayer));

//       printHand(player, showPlayer);

//       finishDealersPlay(dealer, player, showPlayer, showDealer, bet);

//       System.out.println("want to play again? (y) >> ");
//       again = in.next();
//       in.nextLine();

//       if (bank <= 0) {
//         System.out.println("sry you have no money");
//       }
//     }
//   }

//   public static int randomize(int[] a) {
//     int rand = (int) (Math.random() * 52);
//     return a[rand];
//   }

//   public static int[] dealHand(int[] a) {
//     int[] arrayHand = new int[10];

//     for (int i = 0; i < 10; i++) {
//       arrayHand[i] = randomize(a);
//       Helpers.remove(a, arrayHand[i]);
//     }
//     return arrayHand;
//   }

//   public static void printHand(int[] a, int reveal) {
//     for (int i = 0; i < reveal; i++) {
//       System.out.print(a[i] + ",");
//     }
//   }

//   public static int scoring(int[] hand, int reveal) {
//     boolean hasAce = false;
//     int score = 0;

//     for (int i = 0; i < reveal; i++) {
//       if (hand[i] == 1) {
//         hasAce = true;
//         score += 11;
//       } else if (hand[i] == 2) {
//         score += 2;
//       } else if (hand[i] == 3) {
//         score += 3;
//       } else if (hand[i] == 4) {
//         score += 4;
//       } else if (hand[i] == 5) {
//         score += 5;
//       } else if (hand[i] == 6) {
//         score += 6;
//       } else if (hand[i] == 7) {
//         score += 7;
//       } else if (hand[i] == 8) {
//         score += 8;
//       } else if (hand[i] == 9) {
//         score += 9;
//       } else if (hand[i] == 10) {
//         score += 10;
//       }
//     }

//     if (score > 21 && hasAce == true) {
//       score -= 10;
//     }
//     return score;
//   }

//   public static int finishDealersPlay(
//     int[] dealer,
//     int[] player,
//     int showPlayer,
//     int showDealer,
//     int bet
//   ) {
//     int score = -1;

//     int dealerScore = scoring(dealer, showDealer);
//     int playerScore = scoring(player, showPlayer);

//     if (scoring(player, showPlayer) == scoring(dealer, showDealer)) {
//       score = 0;
//       System.out.println("draw");
//       bank -= (score * bet);
//     }

//     if ((scoring(player, 2) == 21) && (scoring(dealer, 2) != 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if ((playerScore > dealerScore) && (playerScore <= 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if ((playerScore <= 21) && (dealerScore > 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if (score == -1) {
//       System.out.println("you lose");
//       bank += (score * bet);
//     }
//     return score;
//   }
// }

//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);

//     int[] cards = {
//       1,
//       1,
//       1,
//       1,
//       2,
//       2,
//       2,
//       2,
//       3,
//       3,
//       3,
//       3,
//       4,
//       4,
//       4,
//       4,
//       5,
//       5,
//       5,
//       5,
//       6,
//       6,
//       6,
//       6,
//       7,
//       7,
//       7,
//       7,
//       8,
//       8,
//       8,
//       8,
//       9,
//       9,
//       9,
//       9,
//       10,
//       10,
//       10,
//       10,
//       10,
//        10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//     };

//     boolean play = true;
//     String answer = "hit";
//     String again = "y";
//     while (again.equals("y") && bank > 0) {
//       int playerScore = 0;
//       int dealerScore = 0;
//       int showPlayer = 2;
//       int showDealer = 0;
//       System.out.println("How much would you like to bet? >> ");
//       int bet = in.nextInt();
//       int[] player = dealHand(cards);

//       int[] dealer = dealHand(cards);
//       while (answer.equals("hit") && scoring(player, showPlayer) < 21) {
//         System.out.print("your cards are >>  ");
//         printHand(player, showPlayer);
//         System.out.println("Your Score is >> " + scoring(player, showPlayer));
//         System.out.print("Dealer hand is >>");
//         printHand(dealer, 1);
//         System.out.print("Would you like to hit or stand? >> ");
//         answer = in.nextLine();
//         in.nextLine();
//         if (answer.equals("hit")) {
//           showPlayer += 1;
//         }
//       }
//       while (scoring(dealer, showDealer) < 17) {
//         showDealer++;
//       }

//       System.out.println("dealer score is " + scoring(dealer, showDealer));

//       printHand(dealer, showDealer);

//       System.out.println("your score is " + scoring(player, showPlayer));

//       printHand(player, showPlayer);

//       finishDealersPlay(dealer, player, showPlayer, showDealer, bet);

//       System.out.println("want to play again? (y) >> ");
//       again = in.next();
//       in.nextLine();

//       if (bank <= 0) {
//         System.out.println("sry you have no money");
//       }
//     }
//   }

//   public static int randomize(int[] a) {
//     int rand = (int) (Math.random() * 52);
//     return a[rand];
//   }

//   public static int[] dealHand(int[] a) {
//     int[] arrayHand = new int[10];

//     for (int i = 0; i < 10; i++) {
//       arrayHand[i] = randomize(a);
//       Helpers.remove(a, arrayHand[i]);
//     }
//     return arrayHand;
//   }

//   public static void printHand(int[] a, int reveal) {
//     for (int i = 0; i < reveal; i++) {
//       System.out.print(a[i] + ",");
//     }
//   }

//   public static int scoring(int[] hand, int reveal) {
//     boolean hasAce = false;
//     int score = 0;

//     for (int i = 0; i < reveal; i++) {
//       if (hand[i] == 1) {
//         hasAce = true;
//         score += 11;
//       } else if (hand[i] == 2) {
//         score += 2;
//       } else if (hand[i] == 3) {
//         score += 3;
//       } else if (hand[i] == 4) {
//         score += 4;
//       } else if (hand[i] == 5) {
//         score += 5;
//       } else if (hand[i] == 6) {
//         score += 6;
//       } else if (hand[i] == 7) {
//         score += 7;
//       } else if (hand[i] == 8) {
//         score += 8;
//       } else if (hand[i] == 9) {
//         score += 9;
//       } else if (hand[i] == 10) {
//         score += 10;
//       }
//     }

//     if (score > 21 && hasAce == true) {
//       score -= 10;
//     }
//     return score;
//   }

//   public static int finishDealersPlay(
//     int[] dealer,
//     int[] player,
//     int showPlayer,
//     int showDealer,
//     int bet
//   ) {
//     int score = -1;

//     int dealerScore = scoring(dealer, showDealer);
//     int playerScore = scoring(player, showPlayer);

//     if (scoring(player, showPlayer) == scoring(dealer, showDealer)) {
//       score = 0;
//       System.out.println("draw");
//       bank -= (score * bet);
//     }

//     if ((scoring(player, 2) == 21) && (scoring(dealer, 2) != 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if ((playerScore > dealerScore) && (playerScore <= 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if ((playerScore <= 21) && (dealerScore > 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if (score == -1) {
//       System.out.println("you lose");
//       bank += (score * bet);
//     }
//     return score;
//   }
// }
//       2,
//       3,
//       3,
//       3,
//       3,
//       4,
//       4,
//       4,
//       4,
//       5,
//       5,
//       5,
//       5,
//       6,
//       6,
//       6,
//       6,
//       7,
//       7,
//       7,
//       7,
//       8,
//       8,
//       8,
//       8,
//       9,
//       9,
//       9,
//       9,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//     };

//     boolean play = true;
//     String answer = "hit";
//     String again = "y";
//     while (again.equals("y") && bank > 0) {
//       int playerScore = 0;
//       int dealerScore = 0;
//       int showPlayer = 2;
//       int showDealer = 0;
//       System.out.println("How much would you like to bet? >> ");
//       int bet = in.nextInt();
//       int[] player = dealHand(cards);

//       int[] dealer = dealHand(cards);
//       while (answer.equals("hit") && scoring(player, showPlayer) < 21) {
//         System.out.print("your cards are >>  ");
//         printHand(player, showPlayer);
//         System.out.println("Your Score is >> " + scoring(player, showPlayer));
//         System.out.print("Dealer hand is >>");
//         printHand(dealer, 1);
//         System.out.print("Would you like to hit or stand? >> ");
//         answer = in.nextLine();
//         in.nextLine();
//         if (answer.equals("hit")) {
//           showPlayer += 1;
//         }
//       }
//       while (scoring(dealer, showDealer) < 17) {
//         showDealer++;
//       }

//       System.out.println("dealer score is " + scoring(dealer, showDealer));

//       printHand(dealer, showDealer);

//       System.out.println("your score is " + scoring(player, showPlayer));

//       printHand(player, showPlayer);

//       finishDealersPlay(dealer, player, showPlayer, showDealer, bet);

//       System.out.println("want to play again? (y) >> ");
//       again = in.next();
//       in.nextLine();

//       if (bank <= 0) {
//         System.out.println("sry you have no money");
//       }
//     }
//   }

//   public static int randomize(int[] a) {
//     int rand = (int) (Math.random() * 52);
//     return a[rand];
//   }

//   public static int[] dealHand(int[] a) {
//     int[] arrayHand = new int[10];

//     for (int i = 0; i < 10; i++) {
//       arrayHand[i] = randomize(a);
//       Helpers.remove(a, arrayHand[i]);
//     }
//     return arrayHand;
//   }

//   public static void printHand(int[] a, int reveal) {
//     for (int i = 0; i < reveal; i++) {
//       System.out.print(a[i] + ",");
//     }
//   }

//   public static int scoring(int[] hand, int reveal) {
//     boolean hasAce = false;
//     int score = 0;

//     for (int i = 0; i < reveal; i++) {
//       if (hand[i] == 1) {
//         hasAce = true;
//         score += 11;
//       } else if (hand[i] == 2) {
//         score += 2;
//       } else if (hand[i] == 3) {
//         score += 3;
//       } else if (hand[i] == 4) {
//         score += 4;
//       } else if (hand[i] == 5) {
//         score += 5;
//       } else if (hand[i] == 6) {
//         score += 6;
//       } else if (hand[i] == 7) {
//         score += 7;
//       } else if (hand[i] == 8) {
//         score += 8;
//       } else if (hand[i] == 9) {
//         score += 9;
//       } else if (hand[i] == 10) {
//         score += 10;
//       }
//     }

//     if (score > 21 && hasAce == true) {
//       score -= 10;
//     }
//     return score;
//   }

//   public static int finishDealersPlay(
//     int[] dealer,
//     int[] player,
//     int showPlayer,
//     int showDealer,
//     int bet
//   ) {
//     int score = -1;

//     int dealerScore = scoring(dealer, showDealer);
//     int playerScore = scoring(player, showPlayer);

//     if (scoring(player, showPlayer) == scoring(dealer, showDealer)) {
//       score = 0;
//       System.out.println("draw");
//       bank -= (score * bet);
//     }

//     if ((scoring(player, 2) == 21) && (scoring(dealer, 2) != 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if ((playerScore > dealerScore) && (playerScore <= 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if ((playerScore <= 21) && (dealerScore > 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if (score == -1) {
//       System.out.println("you lose");
//       bank += (score * bet);
//     }
//     return score;
//   }
// }

//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);

//     int[] cards = {
//       1,
//       1,
//       1,
//       1,
//       2,
//       2,
//       2,
//       2,
//       3,
//       3,
//       3,
//       3,
//       4,
//       4,
//       4,
//       4,
//       5,
//       5,
//       5,
//       5,
//       6,
//       6,
//       6,
//       6,
//       7,
//       7,
//       7,
//       7,
//       8,
//       8,
//       8,
//       8,
//       9,
//       9,
//       9,
//       9,
//       10,
//       10,
//       10,
//       10,
//       10,
//        10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//       10,
//     };

//     boolean play = true;
//     String answer = "hit";
//     String again = "y";
//     while (again.equals("y") && bank > 0) {
//       int playerScore = 0;
//       int dealerScore = 0;
//       int showPlayer = 2;
//       int showDealer = 0;
//       System.out.println("How much would you like to bet? >> ");
//       int bet = in.nextInt();
//       int[] player = dealHand(cards);

//       int[] dealer = dealHand(cards);
//       while (answer.equals("hit") && scoring(player, showPlayer) < 21) {
//         System.out.print("your cards are >>  ");
//         printHand(player, showPlayer);
//         System.out.println("Your Score is >> " + scoring(player, showPlayer));
//         System.out.print("Dealer hand is >>");
//         printHand(dealer, 1);
//         System.out.print("Would you like to hit or stand? >> ");
//         answer = in.nextLine();
//         in.nextLine();
//         if (answer.equals("hit")) {
//           showPlayer += 1;
//         }
//       }
//       while (scoring(dealer, showDealer) < 17) {
//         showDealer++;
//       }

//       System.out.println("dealer score is " + scoring(dealer, showDealer));

//       printHand(dealer, showDealer);

//       System.out.println("your score is " + scoring(player, showPlayer));

//       printHand(player, showPlayer);

//       finishDealersPlay(dealer, player, showPlayer, showDealer, bet);

//       System.out.println("want to play again? (y) >> ");
//       again = in.next();
//       in.nextLine();

//       if (bank <= 0) {
//         System.out.println("sry you have no money");
//       }
//     }
//   }

//   public static int randomize(int[] a) {
//     int rand = (int) (Math.random() * 52);
//     return a[rand];
//   }

//   public static int[] dealHand(int[] a) {
//     int[] arrayHand = new int[10];

//     for (int i = 0; i < 10; i++) {
//       arrayHand[i] = randomize(a);
//       Helpers.remove(a, arrayHand[i]);
//     }
//     return arrayHand;
//   }

//   public static void printHand(int[] a, int reveal) {
//     for (int i = 0; i < reveal; i++) {
//       System.out.print(a[i] + ",");
//     }
//   }

//   public static int scoring(int[] hand, int reveal) {
//     boolean hasAce = false;
//     int score = 0;

//     for (int i = 0; i < reveal; i++) {
//       if (hand[i] == 1) {
//         hasAce = true;
//         score += 11;
//       } else if (hand[i] == 2) {
//         score += 2;
//       } else if (hand[i] == 3) {
//         score += 3;
//       } else if (hand[i] == 4) {
//         score += 4;
//       } else if (hand[i] == 5) {
//         score += 5;
//       } else if (hand[i] == 6) {
//         score += 6;
//       } else if (hand[i] == 7) {
//         score += 7;
//       } else if (hand[i] == 8) {
//         score += 8;
//       } else if (hand[i] == 9) {
//         score += 9;
//       } else if (hand[i] == 10) {
//         score += 10;
//       }
//     }

//     if (score > 21 && hasAce == true) {
//       score -= 10;
//     }
//     return score;
//   }

//   public static int finishDealersPlay(
//     int[] dealer,
//     int[] player,
//     int showPlayer,
//     int showDealer,
//     int bet
//   ) {
//     int score = -1;

//     int dealerScore = scoring(dealer, showDealer);
//     int playerScore = scoring(player, showPlayer);

//     if (scoring(player, showPlayer) == scoring(dealer, showDealer)) {
//       score = 0;
//       System.out.println("draw");
//       bank -= (score * bet);
//     }

//     if ((scoring(player, 2) == 21) && (scoring(dealer, 2) != 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if ((playerScore > dealerScore) && (playerScore <= 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if ((playerScore <= 21) && (dealerScore > 21)) {
//       score = 1;
//       System.out.println("you win");
//       bank += (score * bet);
//     }

//     if (score == -1) {
//       System.out.println("you lose");
//       bank += (score * bet);
//     }
//     return score;
//   }
// }


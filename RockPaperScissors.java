import java.util.Scanner;

public class RockPaperScissors {

  public static void main(String[] args) { //15+18
    int[][] x = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    System.out.println(diagonal(x));
  }

  public static int diagonal(int[][] x) {
    int sum = 0;

    for (int i = 0; i < x.length; i++) {
      sum += x[i][i];
    }
    for (int i = 0; i < x.length; i++) {
      sum += x[i][x.length - i - 1];
    }
    return sum;
  }

  public static void RPS() {
    Scanner in = new Scanner(System.in);
    int p2 = (int) (Math.random() * 3) + 1;
    int win = 0;
    int loss = 0;
    int tie = 0;
    boolean play = true;
    while (play) {
      System.out.print("Rock paper or scissors?(R,P,S)");
      String user = in.nextLine();
      if (p2 == 1) {
        System.out.println("p2 has rock");
      }
      if (p2 == 2) {
        System.out.println("p2 has paper");
      }
      if (p2 == 3) {
        System.out.println("p2 has scissors");
      }
      if (
        (user.equals("R") && p2 == 1) ||
        (user.equals("P") && p2 == 2) ||
        (user.equals("S") && p2 == 3)
      ) {
        System.out.println("tie");

        tie++;
        System.out.println(
          "There have been" +
          win +
          "wins," +
          loss +
          "losses" +
          " and " +
          tie +
          "ties"
        );
      }
      if (
        (user.equals("R") && (p2 == 3)) ||
        (user.equals("P") && p2 == 1) ||
        (user.equals("S") && p2 == 2)
      ) {
        System.out.println("win");
        win++;
        System.out.println(
          "There have been" +
          win +
          "wins," +
          loss +
          "losses" +
          " and " +
          tie +
          "ties"
        );
      }
      if (
        (user.equals("R") && p2 == 2) ||
        (user.equals("P") && p2 == 3) ||
        (user.equals("S") && p2 == 1)
      ) {
        System.out.println("loss");
        loss++;
        System.out.println(
          "There have been" +
          win +
          "wins," +
          loss +
          "losses" +
          " and " +
          tie +
          "ties"
        );
      }
      System.out.println("would you like to play again(y/n)");
      String again = in.nextLine();
      if (again.equals("y")) {
        play = true;
      }
      if (again.equals("n")) {
        play = false;
      }
    }
  }
}

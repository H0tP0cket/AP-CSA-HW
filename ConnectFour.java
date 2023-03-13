import java.util.Scanner;

//siddharth srinivasan period 6
public class ConnectFour {

  //runs main methods that hold game
  public static void main(String[] args) {
    char board[][] = new char[6][7];
    display(board);
    game(board);
  }

  //the whole game basically
  public static void game(char[][] board) {
    Scanner in = new Scanner(System.in);
    boolean win = false;
    boolean turn = true;
    char piece;
    int pos = 0;
    //while game isnt over(not won)
    while (!win) {
      //deciding which players turn it is
      if (turn) {
        System.out.print("Drop a piece in a y (0 - 6)");
        piece = 'X';
      } else {
        System.out.print("Drop a piece in a y (0 - 6)");
        piece = 'O';
      }
      //taking y position as a value
      pos = in.nextInt();
      //case if they put a number greater or less than 0-6
      while (pos < 0 || pos > 6) {
        System.out.println("col pos must be between 0 and 6");
        pos = in.nextInt();
      }
      //swap turns
      turn = !turn;
      //checks if a piece has been dropped(the method is explained below but basically just keeps track of populated slots in each y to drop into write spot)
      if (drop(board, piece, pos)) {
        turn = !turn;
      } else {
        display(board);
        //end while loop when game is won
        if (gameWin(board, piece, pos)) {
          win = true;
          System.out.print(piece + " wins");
        }
      }
    }
  }

  public static boolean drop(char[][] board, char piece, int y) {
    for (int i = board.length - 1; i >= 0; i--) {
      if (board[i][y] == 0) {
        board[i][y] = piece;
        return false;
      }
    }

    System.out.println("that y is already full");
    return true;
  }

  //checks all win conditions to see if any has been satisfied and then returns true and ends game
  public static boolean gameWin(char[][] board, char piece, int y) {
    int x = 0;

    for (int i = 0; i < board.length; i++) {
      if (board[i][y] != 0) {
        x = i;
        break;
      }
    }

    if (yCheck(board, piece, y, x)) {
      return true;
    }

    if (xCheck(board, piece, y, x)) {
      return true;
    }

    if (diaCheck(board, piece, y, x)) {
      return true;
    }

    if (diaCheck2(board, piece, y, x)) {
      return true;
    }

    return false;
  }

  //checks for diagonal win conditions by comparing indexes in the 2d array using a for loop
  public static boolean diaCheck(char[][] board, char piece, int y, int x) {
    int count = 1;

    for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
      if (piece == board[i][j]) {
        count++;
      } else {
        break;
      }
    }

    if (count >= 4) {
      return true;
    }

    for (
      int i = x + 1, j = y + 1;
      i < board.length && j < board[0].length;
      i++, j++
    ) {
      if (piece == board[i][j]) {
        count++;
      } else {
        break;
      }
    }

    if (count >= 4) {
      return true;
    }

    return false;
  }

  //same as above but checks diagaonals that appear in the opposite direction
  public static boolean diaCheck2(char[][] board, char piece, int y, int x) {
    int count = 1;

    for (int i = x + 1, j = y - 1; i < board.length && j >= 0; i++, j--) {
      if (piece == board[i][j]) {
        count++;
      } else {
        break;
      }
    }

    if (count >= 4) {
      return true;
    }

    for (int i = x - 1, j = y + 1; i >= 0 && j < board[0].length; i--, j++) {
      if (piece == board[i][j]) {
        count++;
      } else {
        break;
      }
    }

    if (count >= 4) {
      return true;
    }

    return false;
  }

  //checks if 4 elements in a x of the 2d array game baord are equal
  public static boolean xCheck(char[][] board, char piece, int y, int x) {
    int count = 1;

    for (int i = y - 1; i >= 0; i--) {
      if (piece == board[x][i]) {
        count++;
      } else {
        break;
      }
    }

    if (count >= 4) {
      return true;
    }

    for (int i = y + 1; i < board[0].length; i++) {
      if (piece == board[x][i]) {
        count++;
      } else {
        break;
      }
    }

    if (count >= 4) {
      return true;
    }

    return false;
  }

  //checks if 4 elements in a x vertically are equal by comparing indexes
  public static boolean yCheck(char[][] board, char piece, int y, int x) {
    int count = 1;

    if ((x + 4) <= 6) {
      for (int i = (x + 1); i <= (x + 3); i++) {
        if (piece == board[i][y]) {
          count++;
        } else {
          break;
        }

        if (count == 4) {
          return true;
        }
      }
    }

    return false;
  }

  //makes sure the character when chosen y doesnt override any previously dropped pieces

  //display game board
  public static void display(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(" | " + board[i][j]);
      }

      System.out.println(" | ");
    }

    System.out.print("------------------------");

    System.out.println();
  }
}

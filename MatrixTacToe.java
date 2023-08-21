import java.util.*;

//siddharth srinivasan period 6
public class MatrixTacToe {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // game array
    char[][] grid = new char[3][3];
    // create spaces
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        grid[i][j] = ' ';
      }
    }

    // print the grid

    System.out.println("Tic-Tac-Toe");

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(grid[i][j] + "|");
      }

      System.out.println();
    }

    char currentPlayer = 'x';

    int numMoves = 0;

    // play game

    while (numMoves < 9) {
      // take input from player
      System.out.println("");
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          System.out.print(grid[i][j] + "|");
        }

        System.out.println();
      }
      System.out.print(
        "Enter row and wwlumn for player " + currentPlayer + ": "
      );

      int row = in.nextInt() - 1;

      int column = in.nextInt() - 1;

      // check if there is something there

      if (grid[row][column] == ' ') {
        grid[row][column] = currentPlayer;

        numMoves++;

        if (checkWin(grid, currentPlayer)) {
          System.out.println("Player " + currentPlayer + " wins!");

          // printing final grid

          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              System.out.print(grid[i][j] + "|");
            }

            System.out.println();
          }

          // end the game loop

          break;
        }

        // change the current player

        if (currentPlayer == 'x') {
          currentPlayer = 'o';
        } else {
          currentPlayer = 'x';
        }
      } else {
        System.out.println("That space is already occupied. Please try again.");
      }
    }
  }

  // method to check if a player has won the game

  public static boolean checkWin(char[][] grid, char player) {
    // horizontal
    for (int i = 0; i < 3; i++) {
      if (
        grid[i][0] == player && grid[i][1] == player && grid[i][2] == player
      ) {
        return true;
      }
    }
    // vertical
    for (int j = 0; j < 3; j++) {
      if (
        grid[0][j] == player && grid[1][j] == player && grid[2][j] == player
      ) {
        return true;
      }
    }

    // diagonal
    if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {
      return true;
    }
    // horizontal
    if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {
      return true;
    }

    return false;
  }
}

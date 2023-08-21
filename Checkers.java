import java.util.Scanner;

public class Checkers {

  private static pieces[][] board;

  private static int playerTurn;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    board = new pieces[8][8];

    for (int row = 0; row < 8; row++) {
      for (int col = 0; col < 8; col++) {
        if ((row + col) % 2 == 1 && row < 3) {
          board[row][col] = new pieces(row, col, false);
        } else if ((row + col) % 2 == 1 && row > 4) {
          board[row][col] = new pieces(row, col, false);
        } else {
          board[row][col] = null;
        }
      }
    }

    playerTurn = 1;

    boolean gameWon = false;
    while (!gameWon) {
      System.out.println("Current board:");
      printBoard();

      System.out.println("Player " + playerTurn + "'s turn.");
      System.out.print(
        "Enter the row and column of the piece you want to move: "
      );
      int pieceRow = input.nextInt();
      int pieceCol = input.nextInt();
      System.out.print(
        "Enter the row and column of the space you want to move to: "
      );
      int moveRow = input.nextInt();
      int moveCol = input.nextInt();

      if (isValidMove(pieceRow, pieceCol, moveRow, moveCol)) {
        board[moveRow][moveCol] = board[pieceRow][pieceCol];
        board[pieceRow][pieceCol] = null;

        if (moveRow == 0 || moveRow == 7) {
          board[moveRow][moveCol].makeKing(true);
        }

        gameWon = isGameWon();

        playerTurn = playerTurn == 1 ? 2 : 1;
      } else {
        System.out.println("Invalid move. Please try again.");
      }
    }

    System.out.println("Final board:");
    printBoard();
    System.out.println("Player " + playerTurn + " wins!");
  }

  private static boolean isValidMove(
    int pieceRow,
    int pieceCol,
    int moveRow,
    int moveCol
  ) {
    if (moveRow < 0 || moveRow >= 8 || moveCol < 0 || moveCol >= 8) {
      return false;
    }

    if (board[moveRow][moveCol] != null) {
      return false;
    }

    pieces piece = board[pieceRow][pieceCol];

    if (piece.kingStatus()) {
      if (
        Math.abs(moveRow - pieceRow) == 1 && Math.abs(moveCol - pieceCol) == 1
      ) {
        return true;
      } else {
        int rowDiff = moveRow - pieceRow;
        int colDiff = moveCol - pieceCol;
        if (Math.abs(rowDiff) == 2 && Math.abs(colDiff) == 2) {
          int jumpRow = pieceRow + rowDiff / 2;
          int jumpCol = pieceCol + colDiff / 2;
          pieces jumpedPiece = board[jumpRow][jumpCol];
          if (
            jumpedPiece != null &&
            jumpedPiece.kingStatus() != piece.kingStatus()
          ) {
            return true;
          }
        }
      }
    } else {
      int rowDiff = moveRow - pieceRow;
      if (playerTurn == 1 ? rowDiff != 1 : rowDiff != -1) {
        return false;
      }

      int colDiff = moveCol - pieceCol;
      if (Math.abs(colDiff) != 1) {
        return false;
      }

      if (Math.abs(rowDiff) == 1) {
        if (board[moveRow][moveCol] == null) {
          return true;
        }
      } else {
        int jumpRow = pieceRow + rowDiff / 2;
        int jumpCol = pieceCol + colDiff / 2;
        pieces jumpedPiece = board[jumpRow][jumpCol];
        if (
          jumpedPiece != null && jumpedPiece.kingStatus() != piece.kingStatus()
        ) {
          return true;
        }
      }
    }

    return false;
  }

  private static boolean isGameWon() {
    boolean player1HasPieces = false;
    boolean player2HasPieces = false;
    for (int row = 0; row < 8; row++) {
      for (int col = 0; col < 8; col++) {
        pieces piece = board[row][col];
        if (piece != null) {
          if (
            piece.kingStatus() || (row - piece.getX()) * (playerTurn - 1) < 0
          ) {
            if (playerTurn == 1) {
              player1HasPieces = true;
            } else {
              player2HasPieces = true;
            }
          } else {
            if (playerTurn == 1) {
              player2HasPieces = true;
            } else {
              player1HasPieces = true;
            }
          }
        }
      }
    }
    return !player1HasPieces || !player2HasPieces;
  }

  private static void printBoard() {
    for (int row = 0; row < 8; row++) {
      for (int col = 0; col < 8; col++) {
        pieces piece = board[row][col];
        if (piece == null) {
          System.out.print("- ");
        } else {
          System.out.print(
            (piece.kingStatus() ? "K" : "P") +
            (piece.getX() == row && piece.getY() == col ? playerTurn : 0) +
            " "
          );
        }
      }
      System.out.println();
    }
  }
}

public class Piece {

  private int x;
  private int y;
  private boolean isKing;

  public Piece(int x, int y, boolean isKing) {
    this.x = x;
    this.y = y;
    this.isKing = isKing;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean isKing) {
    this.isKing = isKing;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void makeKing(boolean isKing) {
    this.isKing = isKing;
  }
}

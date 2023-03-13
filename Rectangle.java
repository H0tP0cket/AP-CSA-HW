public class Rectangle {
    int length;
    int width;

    // default case
    public Rectangle() {
        length = 1;
        width = 2;
    }

    // custom case
    public Rectangle(int a, int b) {
        length = a;
        width = b;

    }

    // getters and setters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int a) {
        width = a;
    }

    public void setLength(int a) {
        length = a;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "length and width are " + length + "and" + width;
    }
}
public class Shoe {
    // attributes
    private String color;
    private int size;

    // constructors >>
    // default constructor
    public Shoe() {
        size = 7;
        color = "white";
    }

    // custom constructor
    public Shoe(int a, String b) {
        size = a;
        color = b;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setSize(int x) {
        size = x;
    }

    public void setColor(String y) {
        color = y;
    }

}

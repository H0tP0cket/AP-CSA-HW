import java.util.Scanner;

// Siddharth Srinivasan 
// Period 6
public class MathUser {
    public static void main(String[] args) {
        System.out.println(
                "this is a program in which you will input 4 values(2 (x,y) pairs) and upon submitting the data\n you will receive the distance between the 2 points, the midpoint of the two points,\n and the equation of the line those two points create.");
        Scanner in = new Scanner(System.in);
        System.out.print("enter x1:");
        double x1 = in.nextDouble();
        Scanner in2 = new Scanner(System.in);
        System.out.print("enter y1:");
        double y1 = in2.nextDouble();
        Scanner in3 = new Scanner(System.in);
        System.out.print("enter x2:");
        double x2 = in3.nextDouble();
        Scanner in4 = new Scanner(System.in);
        System.out.print("enter y2:");
        double y2 = in4.nextDouble();

        double distance = Math.hypot(x1 - x2, y1 - y2);
        double midpoint1 = (x1 + x2) / 2;
        double midpoint2 = (y1 + y2) / 2;
        double slope = (y2 - y1) / (x2 - x1);
        double slope1 = (y2 - y1);
        double slope2 = (x2 - x1);
        double yint = (y2 - slope * x2);
        System.out.println("The distance between your two points is: " + distance);
        System.out.println("The midpoint of your two points is: (" + midpoint1 + "," + midpoint2 + ")");
        System.out.println("The equation of your line is: y= " + slope1 + "/" + slope2 + "x + " + yint);

    }
}

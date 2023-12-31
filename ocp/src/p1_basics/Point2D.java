package p1_basics;

public class Point2D {             // Class name
    // Class Member Declarations
    // Static variable:
    private static final String info = "A 2D point represented by (x,y)-coordinates.";

    // Instance variables:
    private int x;
    private int y;

    // Constructor:
    public Point2D(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }

    // Static methods:
    public static double distance(Point2D p1, Point2D p2) {
        int xDiff = p1.x - p2.x;
        int yDiff = p1.y - p2.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void showInfo() {
        System.out.println(info);
    }

    // Instance methods:
    public int getX() {
        return x;
    }

    public void setX(int xCoord) {
        x = xCoord;
    }

    public int getY() {
        return y;
    }

    public void setY(int yCoord) {
        y = yCoord;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    } // Format: (x,y)
}

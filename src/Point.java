public class Point {
    private double x;
    private double y;

    // public static final Point ORIGIN = new Point(0, 0);

    // Sets this Point's coordinates to the given x and y values.
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}

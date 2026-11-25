/**
 * Represents a point in two-dimensional space.
 */
public class Point {

    /** Horizontal coordinate. */
    private int x;

    /** Vertical coordinate. */
    private int y;

    /** Creates a point with the given coordinates. */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /** Returns the x coordinate. */
    public int getX() {
        return x;
    }

    /** Returns the y coordinate. */
    public int getY() {
        return y;
    }

    /** Updates the x coordinate. */
    public void setX(int x) {
        this.x = x;
    }

    /** Updates the y coordinate. */
    public void setY(int y) {
        this.y = y;
    }

    /** Calculates the distance from the origin (0,0). */
    public double distanceFromOrigin() {
        return Math.sqrt((double) x * x + (double) y * y);
    }

    /** Moves the point by dx and dy units. */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /** Returns the coordinates in [x;y] format. */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }

    /** Calculates the distance between two points. */
    public double distance(Point p) {
        double dx = (double) x - p.x;
        double dy = (double) y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /** Updates both coordinates of the point. */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
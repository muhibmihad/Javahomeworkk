/** Represents a line between two points. */
public class Line {

    /** Starting point of the line. */
    private Point p1;

    /** Ending point of the line. */
    private Point p2;

    /** Default constructor. */
    public Line() {
        p1 = new Point(0, 0);
        p2 = new Point(0, 0);
    }

    /** Parameterized constructor. */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    /** Returns the starting point. */
    public Point getP1() {
        return p1;
    }

    /** Returns the ending point. */
    public Point getP2() {
        return p2;
    }

    /** Updates the starting point. */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /** Updates the ending point. */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /** Displays the starting and ending points. */
    @Override
    public String toString() {
        return p1 + " -> " + p2;
    }

    /** Calculates the length of the line. */
    public double length() {
        return p1.distance(p2);
    }
}
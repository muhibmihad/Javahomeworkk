public class Main {
    public static void main(String[] args) {

        Point p = new Point(3, 4);

        System.out.println("Point: " + p);
        System.out.println("X: " + p.getX());
        System.out.println("Y: " + p.getY());
        System.out.println("Distance from origin: " + p.distanceFromOrigin());

        p.setX(5);
        p.setY(3);
        System.out.println("After setters: " + p);

        p.translate(2, 1);
        System.out.println("After translation: " + p);

        Point p2 = new Point(4, 8);
        System.out.println("Distance between points: " + p.distance(p2));

        p.setLocation(10, 20);
        System.out.println("New location: " + p);
        // Task 2: Testing Line class
        System.out.println("\n--- Task 2 ---");

        Line line = new Line(new Point(0, 0), new Point(3, 4));

        System.out.println("Line: " + line);
        System.out.println("Starting point: " + line.getP1());
        System.out.println("Ending point: " + line.getP2());
        System.out.println("Length: " + line.length());

        Line defaultLine = new Line();
        System.out.println("Default line: " + defaultLine);

        defaultLine.setP1(new Point(1, 1));
        defaultLine.setP2(new Point(4, 5));

        System.out.println("Updated line: " + defaultLine);
        System.out.println("Updated length: " + defaultLine.length());
    }
}
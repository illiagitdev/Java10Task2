package lessons.lesson5_1.hometasks;

public class Point {
    public static Point startPoint = new Point(0, 0);

    private double x;
    private double y;

    private String path = "files/lesson5_3/lessons_fractal/log.txt";

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        if (x >= 0) {
            this.x = x;
        } else {
            System.out.println("not allowed value for x: " + x);
        }
    }

    public void setY(double y) {
        if (y >= 0) {
            this.y = y;
        } else {
            System.out.println("not allowed value for н: " + y);
        }
    }

    /**
     * Calculate length between two points
     *
     * @param otherPoint - point to which we seek the distance
     * @return distanse
     */
    public double calcLength(Point otherPoint) {
        return Math.sqrt(Math.pow(otherPoint.x - x, 2) + Math.pow(otherPoint.y - y, 2));
    }

    /**
     * Calculate length to basis (0. 0)
     *
     * @return distance
     */
    public double calcLength() {
        return calcLength(startPoint);
    }

    ;

    /**
     * Normalize vector to current Point
     *
     * @return - normalized vector of the point
     */
    public Point normalize() {
        Point nomalizedPoint = new Point();
        double normalizer = this.calcLength();
        nomalizedPoint.x = x / normalizer;
        nomalizedPoint.y = y / normalizer;
        return nomalizedPoint;
    }
}

package lessons.lesson6.hometasks;

public class Point {
    public static Point startPoint = new Point(0, 0);

    private double x;
    private double y;

    public Point(){this(0,0);};

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcLength(Point otherPoint){
        double res = Math.sqrt(Math.pow(otherPoint.x - x, 2) + Math.pow(otherPoint.y - y, 2));
        return res;
    }

    public double calcLength(){
        return calcLength(startPoint);
    };

    public Point normalize(){
        double normalizer = calcLength(startPoint);
        x = x / nonormalizer;
        return new Point();
    }
}

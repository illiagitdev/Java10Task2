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

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    /**
     * Calculate length between two points
     * @param otherPoint - point to which we seek the distance
     * @return distanse
     */
    public double calcLength(Point otherPoint){
        double res = Math.sqrt(Math.pow(otherPoint.x - x, 2) + Math.pow(otherPoint.y - y, 2));
        return res;
    }

    /**
     * Calculate length to basis (0. 0)
     * @return distance
     */
    public double calcLength(){
        return calcLength(startPoint);
    };

    /**
     * Normalize vector to current Point
     * @return - normalized vector of the point
     */
    public Point normalize(){
        Point nomalizedPoint = new Point();
        double normalizer = this.calcLength();
        nomalizedPoint.x = x / normalizer;
        nomalizedPoint.y = y / normalizer;
        // checking normalized
//        System.out.print("normalize: ");
//        nomalizedPoint.show();
//        double checkNormalize = Math.pow(nomalizedPoint.x, 2) + Math.pow(nomalizedPoint.y, 2);
//        System.out.println("checkNormalize " +checkNormalize);
        return nomalizedPoint;
    }

    /**
     * Show point - for our convenience
     */
    public void show(){
        String str = "x: " + x + " y: " + y;
        System.out.println(str);
    }

    /*public static void main(String[] args) {
        Point test = new Point(5, 9);
        test.show();

        double z = test.calcLength();
        System.out.println(z);
        test.normalize();
    }*/
}

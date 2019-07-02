package lessons.lesson5_1.hometasks;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;

public class Line {
    private Point p1 = new Point();
    private Point p2 = new Point();
    private javafx.scene.shape.Line lineFx = new javafx.scene.shape.Line();

    public Line() {
        lineFx.setStartX(0);
        lineFx.setStartY(0);
        lineFx.setEndX(1);
        lineFx.setEndY(1);
    }

    public Line(Point p) {
        this();
        lineFx.setEndX((int) (p.getX()));
        lineFx.setEndY((int) (p.getY()));
    }

    public Line(Point p1, Point p2) {
        lineFx.setStartX((int) (p1.getX()));
        lineFx.setStartY((int) (p1.getY()));
        lineFx.setEndX((int) (p2.getX()));
        lineFx.setEndY((int) (p2.getY()));
    }


    public Point getP1() {
        return new Point(lineFx.getStartX(), lineFx.getStartY());
    }

    public Point getP2() {
        return new Point(lineFx.getEndX(), lineFx.getEndY());
    }

    /**
     * Return length of the line
     *
     * @return length
     */
    public double calcLength() {
        return getP1().calcLength(getP2());
    }

    /*
     * line AB
     * B = A + n * l or D = A + n * l * k
     * n - normalized vector of AB line
     * |AB| - module or length of line AB
     * k - [0, 1] for Point on line
     * */
    public Point getPointOnLine(float percent) {
        if (percent >= 0.0f && percent <= 1.0f) {
            // normal vector for line
            Point lineVector = (new Point(lineFx.getEndX() - lineFx.getStartX(), lineFx.getEndY() - lineFx.getStartY()).normalize());

            double newXOnLine = lineFx.getStartX() + percent * calcLength() * lineVector.getX();
            double newYOnLine = lineFx.getStartY() + percent * calcLength() * lineVector.getY();
            Point pointOnLine = new Point(newXOnLine, newYOnLine);

            return pointOnLine;
        }
        System.out.println("Point not on the line!!!");
        return new Point(0, 0);
    }

    /**
     * draw a line in Pane
     *
     * @param root
     */
    public void draw(Pane root) {
        lineFx.setOpacity(3);
        lineFx.setStroke(Paint.valueOf("#000000"));
        root.getChildren().addAll(lineFx);
        log();
    }

    /**
     * clear Pane from lines
     *
     * @param root
     */
    public void clear(Pane root) {
        root.getChildren().clear();
    }

    public void showLineData() {
        String line = "Start: " + lineFx.getStartX() + " " + lineFx.getStartY() +
                ";\nEnd: " + lineFx.getEndX() + " " + lineFx.getEndY();
        System.out.println(line);
    }

    public Line subLine(float i, float i1) {
        Point newP1 = pointOnLine(i);
        Point newP2 = pointOnLine(i);
        return new Line(newP1, newP2);
    }

    public Point pointOnLine(float i) {
        if (i <= 1 && i >= 0) {
            int x = (int)(lineFx.getStartX() + Math.abs(lineFx.getEndX() - lineFx.getStartX())* i);
            //(int)(lineFx.getStartX() + i * (lineFx.getEndX()-lineFx.getStartX()));
            int y = (int)(lineFx.getStartY() + Math.abs(lineFx.getEndY() - lineFx.getStartY())* i);
            //(int)(25+lineFx.getStartY() + i * (lineFx.getEndY()-lineFx.getStartY()));
            return new Point(x, y);
        }
        return null;
    }

    public Line subLine(float i) {
        return subLine(0, i);
    }

    public void log() {
        String line = (" x: " + x + ", y: " + y);
        Logging logPoint = new Logging();
        logPoint.writeLog(point);
    }
}

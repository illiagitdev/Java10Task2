package lessons.lesson6.hometasks;

import javafx.scene.layout.Pane;

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


    public Point getP1() { return new Point(lineFx.getStartX(), lineFx.getStartY()); }

    public Point getP2() { return new Point(lineFx.getEndX(), lineFx.getEndY());  }

    /**
     * Return length of the line
     *
     * @return length
     */
    public double calcLength() { return getP1().calcLength(getP2()); }

    public Point getPointOnLine(float percent) {
        if (percent >= 0.0f && percent <= 1.0f){

            return new Point();
        }
        System.out.println("Point not on the line!!!");
        return new Point(0, 0);
    }

    public void draw(Pane root) {
        root.getChildren().addAll(lineFx);
    }

    public void clear(Pane root) {
        root.getChildren().clear();
    }

    public void showLineData() {
        String line = "Start: " + lineFx.getStartX() + " " + lineFx.getStartY() +
                ";\nEnd: " + lineFx.getEndX() + " " + lineFx.getEndY();
        System.out.println(line);
    }

    public static void main(String[] args) {
        Line line1 = new Line();
        Line line2 = new Line(new Point(5, 10));
        Line line3 = new Line(new Point(2, 3), new Point(10, 11));

//        line1.showLineData();
//        line2.showLineData();
//        line3.showLineData();
        System.out.println("Length " + line1.calcLength());
        System.out.println("Length " + line2.calcLength());
        System.out.println("Length " + line3.calcLength());

    }
}

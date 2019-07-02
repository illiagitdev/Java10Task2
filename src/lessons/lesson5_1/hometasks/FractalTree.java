package lessons.lesson5_1.hometasks;

import javafx.scene.layout.Pane;

public class FractalTree {
    private int lenth = 30;
    private double angle = Math.toRadians(5);  //  кут між вітками 2*a = 10
    private int depth = 20;
    private Line line;

    public FractalTree() {
        //line = new Line(new Point(475, 50), new Point(475, 50 + lenth));
    }

    public FractalTree(Line line, int lenth, double angle, int depth) {
        this.line = line;
        this.angle = angle;
        this.lenth = lenth;
        this.depth = depth;
    }

    public FractalTree(Line line, int depth) {
        this();
        this.line = line;
        this.depth = depth;
    }

    // todo: фігня якась
    //  тест без кута зі зміщенням в одній координаті x
    public void draw(Pane root, Line line, double angel, int depth) {
        log();
        while (depth > 0) {
            depth -= 4;
            line.draw(root);
            //Line lineA = new Line(line.getP2(), new Point(line.getP2().getX() +Math.cos(angle)*lenth*depth, line.getP2().getY()+Math.sin(angle)*lenth*depth));
            Line lineB = new Line(line.getP2(), new Point(line.getP2().getX() + Math.cos(angle) * lenth * depth, line.getP2().getY() + Math.sin(angle) * lenth * depth));
            //draw(root, lineA,angel+5,depth);
            draw(root, lineB, angel - 5, depth);
        }
    }

    public void draw(Pane root) {
        draw(root, line, angle, depth);
    }

    public void clear(Pane root) {
        line.clear(root);
    }

    //adding notes which fractal adding
    private void log(){
        String text = "fractal tree";
        Logging newLog = new Logging();
        newLog.writeLog(text);
    }
}

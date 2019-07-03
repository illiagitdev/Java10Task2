package lessons.lesson5_1.hometasks;

import javafx.scene.layout.Pane;

public class FractalLines {
    Line line, l2, l3;
    int depth = 3, step = 25; //   count of recursion depth & base step for good display

    public FractalLines(Line line, int depth) {
        this.line = line;
        this.depth = depth;
    }

    public FractalLines() {
        this.line = new Line(new Point(50, 150), new Point(750, 150));
    }

    public FractalLines(Line l1) {
        this.line = l1;
    }

    public void splitDraw(Pane root){
        l2= this.line.subLine(1/3);
        l3= this.line.subLine(2/3,1);
        l2.draw(root);
        l3.draw(root);
    }

    //draw base line and start recursion
    public  void draw(Pane root){
        log();
        line.draw(root); //draw base line in scene
        drawSet(root, line);
    }

    private void drawSet(Pane root, Line line){
        Line newLine1, newLine2;
        int z = depth--;
        while(z>1){
            z--;
            Point p1=line.pointOnLine(0.3f);
            Point p2=line.pointOnLine(0.7f);
            newLine1=new Line(new Point(line.getP1().getX(),line.getP1().getY()+depth*step),new Point(p1.getX(), p1.getY()+depth*step));

            newLine2=new Line(new Point(p2.getX(),p2.getY()+depth*step),new Point(line.getP2().getX(),line.getP1().getY()+depth*step));

            newLine1.draw(root);
            drawSet(root, newLine1);
            newLine2.draw(root);
            drawSet(root, newLine2);
        }
    }

    public void clear(Pane root){
        line.clear(root);
    }

    //adding notes which fractal adding
    private void log(){
        String text = "fractal lines";
        Logging newLog = new Logging();
        newLog.writeLog(text);
    }
}
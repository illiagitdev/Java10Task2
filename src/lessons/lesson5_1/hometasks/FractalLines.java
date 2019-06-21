package lessons.lesson5_1.hometasks;

import javafx.scene.layout.Pane;

public class FractalLines {
    Line line, l2, l3;
    int depth = 5;

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

    public void draw(Pane root){
        while (depth>0){
            depth--;
            line.draw(root);
        }
    }

    //todo: how to??
    public void clear(Pane root){
        line.clear(root);
    }
}
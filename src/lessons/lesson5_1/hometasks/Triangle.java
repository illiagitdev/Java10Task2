package lessons.lesson5_1.hometasks;

import javafx.scene.layout.Pane;

public class Triangle {
    Line l1, l2, l3;

    public Triangle(Point p1, Point p2, Point p3, int i, float v){
        l1 = new Line(p1, p2);
        l2 = new Line(p2, p3);
        l3 = new Line(p3, p1);
    }

    public void draw(Pane root){
        l1.draw(root);
        l2.draw(root);
        l3.draw(root);
    }
    public void clear(Pane root){
        l1.clear(root);
    }
}

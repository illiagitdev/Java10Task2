package lessons.lesson5_1.hometasks;

import javafx.scene.layout.Pane;

public class FractalTree {
    private int lenth = 30;
    private double angle = Math.toRadians(5);  //  кут між вітками 2*a = 10
    private int depth = 5;
    private Line line;

    public void draw(Pane root, int depth){

    }

    public void clear(Pane root){
        line.clear(root);
    }
}

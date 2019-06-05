package lessons.lesson6.hometasks;

import javafx.scene.layout.Pane;

public class Fractal {
    private int depth = 25;
    private float percentOffset = 0.1f;
    private Triangle triangle = new Triangle(new Point(100, 100), new Point(220, 130), new Point(180, 300));

    public Fractal(){}

    //todo: draw() без root, як це реалізувати???
    //todo:отрисовывает весь фрактал
    public void draw(int currentDepth, Triangle triangle){

    }
    //todo: draw() без root, як це реалізувати???
    //todo:     отрисовывает одну итерацию фрактала и вызывает себя рекурсивно до тех пор пока не нарисует все итерации
    public void draw(Pane root){
        while (depth>0) {
            triangle.draw(root);
            depth--;
            triangle = new Triangle(triangle.l1.getPointOnLine(percentOffset), triangle.l2.getPointOnLine(percentOffset),
            triangle.l3.getPointOnLine(percentOffset));
            draw(root);
        }

    }

    // очищает с экрана данный фрактал
    //Необходимо(!) использовать
    //*	функцию clear() из класса Triangle
    public void clear(Pane root){
        triangle.clear(root);
    }
}

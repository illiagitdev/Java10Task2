package lessons.lesson6.hometasks;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Task extends Application {
    public final int WIDTH = 550;
    public final int HEIGHT = 500;
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();

        //todo: додати кнопки для генерації та очистки вікна для діній, трикутників, фракталу
        windowsSetUp(stage);

        uiSetUp(root);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void uiSetUp(Pane root) {
//        Point p11 = new Point(150, 150);
//        Point p22 = new Point(250, 350);
//
//        Line myLine1 = new Line(p11, p22);
//        Line myLine2 = new Line(new Point(150, 350), new Point(250, 150));
//
//        myLine1.draw(root);
////        myLine1.clear(root);
//
//        myLine2.draw(root);
//
//        Point p1 = new Point(100, 100);
//        Point p2 = new Point(250, 125);
//        Point p3 = new Point(170, 270);
//        Triangle triangleTest = new Triangle(p1, p2, p3);
//
//        triangleTest.draw(root);
//        triangleTest.clear(root);

        Fractal fractalTriangle = new Fractal();
        fractalTriangle.draw(root);
    }

    private void windowsSetUp(Stage stage) {
        stage.setMaxWidth(WIDTH);
        stage.setMaxHeight(HEIGHT);

        stage.setMinWidth(WIDTH);
        stage.setMinHeight(HEIGHT);

        //todo: setHeght - додати елемент - іноді викидає не той розмір вікна
    }
}

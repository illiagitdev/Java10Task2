package lessons.lesson6.hometasks;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Task extends Application {
    public final int WIDTH = 950;
    public final int HEIGHT = 800;
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Pane fractalPane = new Pane();
        root.getChildren().addAll(fractalPane);
        //todo: додати кнопки для генерації та очистки вікна для діній, трикутників, фракталу
        windowsSetUp(stage);

        uiSetUp(root, fractalPane);


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void uiSetUp(Pane root, Pane fractalPane) {
        //todo: додав кнопку і все заглохло(((
        Button button = new Button("Regenerate");
//        button.setTranslateX(25);
//        button.setTranslateY(25);
//        drawFractal.setOnAction((event) -> {
//            fractalPane.getChildren().clear();
//            draw(fractalPane);
//        });
        root.getChildren().add(button);

    }

    private void draw(Pane fractalPane) {
        Fractal fractalTriangle = new Fractal();
//        Fractal test = new Fractal(new Point(300,300), new Point(680,275), new Point(595,675), 9, 0.22f);
        fractalTriangle.draw(fractalPane);
//        test.draw(fractalPane);
    }

    private void windowsSetUp(Stage stage) {
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);

        stage.setMaxWidth(WIDTH);
        stage.setMaxHeight(HEIGHT);

        stage.setMinWidth(WIDTH);
        stage.setMinHeight(HEIGHT);
    }
}

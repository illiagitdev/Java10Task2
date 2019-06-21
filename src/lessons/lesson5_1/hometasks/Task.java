package lessons.lesson5_1.hometasks;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Random;

public class Task extends Application {
    public final int WIDTH = 950;
    public final int HEIGHT = 800;
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Pane fractalPane = new Pane();
        root.getChildren().addAll(fractalPane);
        //todo: додати кнопки для генерації дерева, і власне дерево
        windowsSetUp(stage);

        uiSetUp(root, fractalPane);


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void uiSetUp(Pane root, Pane fractalPane) {
        //todo: додав кнопку і змінив шлях
        //  --module-path c:\javafx-sdk-12.0.1\lib\ --add-modules javafx.controls,javafx.fxml --add-modules javafx.base,javafx.graphics
        Button buttonTriangle = new Button("Regenerate");
        buttonTriangle.setTranslateX(25);
        buttonTriangle.setTranslateY(25);
        buttonTriangle.setOnAction((event) -> {
            fractalPane.getChildren().clear();
            draw(fractalPane);
        });

        Button buttonTriangleClear = new Button("Clear Scene");
        buttonTriangleClear.setTranslateX(25);
        buttonTriangleClear.setTranslateY(75);
        buttonTriangleClear.setOnAction((event) -> {
            fractalPane.getChildren().clear();
        });

        Button buttonTree = new Button("Paint Tree");
        buttonTree.setTranslateX(325);
        buttonTree.setTranslateY(25);
        buttonTree.setOnAction((event)->{
            fractalPane.getChildren().clear();
            drawTree(fractalPane);
        });

        Button buttonLines = new Button("Lines");
        buttonLines.setTranslateX(525);
        buttonLines.setTranslateY(25);
        buttonLines.setOnAction((event)->{
            fractalPane.getChildren().clear();
            drawLines(fractalPane);
        });

        root.getChildren().addAll(buttonTriangle,buttonTriangleClear, buttonTree, buttonLines);

    }

    private void drawLines(Pane fractalPane) {

    }

    //todo: doesn't work yet
    private void drawTree(Pane fractalPane) {
        int depth = 20;
        Line line = new Line(new Point(475, 50), new Point(475, 80));
        FractalTree newTree = new FractalTree(line, depth);
        newTree.draw(fractalPane);
    }

    private void draw(Pane fractalPane) {
        Random offset = new Random();
        float shift = offset.nextFloat();
//        Fractal fractalTriangle = new Fractal();
        Fractal test = new Fractal(new Point(300,300), new Point(680,275), new Point(595,675), 12, shift);
//        fractalTriangle.draw(fractalPane);
        test.draw(fractalPane);
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

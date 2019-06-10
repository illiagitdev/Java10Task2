package lessons.lesson6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;

public class PaintFX extends Application {
    private Random r = new Random();
    private static final int WINDOW_WIDTH = 700;
    private static final int WINDOW_HEIGHT = 700;
    private static final int RGB_SYMBOLS_COUNT = 6;
    private static final int COUNT_OF_CIRCLES = 100;

    void windowsSetup(Stage stage) {
        stage.setWidth(WINDOW_WIDTH);
        stage.setHeight(WINDOW_HEIGHT);

        stage.setMinWidth(WINDOW_WIDTH);
        stage.setMinHeight(WINDOW_HEIGHT);

        stage.setMaxWidth(WINDOW_WIDTH);
        stage.setMaxHeight(WINDOW_HEIGHT);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        windowsSetup(stage);

        Pane root = new Pane();
        Pane circlesRoot = new Pane();
        root.getChildren().addAll(circlesRoot);

        //малюємо геометрію
        drawUI(root, circlesRoot);
        draw(circlesRoot);

        stage.setScene(new Scene(root));
        stage.show();
    }

    void drawUI(Pane root, Pane circlesRoot) {
        Button button = new Button("Regenerate");
        button.setTranslateX(10);
        button.setTranslateY(10);
        button.setOnAction((event) -> {
            circlesRoot.getChildren().clear();
            draw(circlesRoot);
        });
        root.getChildren().addAll(button);
    }

    private Paint generateRandColor() {
        String rgb = "#";
        for (int i = 0; i < RGB_SYMBOLS_COUNT; i++) {
            rgb += (char)('0' + r.nextInt(8));
        }
        System.out.println(rgb);

        return Paint.valueOf(rgb);
    }

    private Circle generateCircle(int maxRadius, int maxStroke) {
        Circle c = new Circle(r.nextDouble() * WINDOW_HEIGHT, r.nextDouble() * WINDOW_WIDTH,
                r.nextDouble() * maxRadius);
        c.setStrokeWidth(r.nextDouble() * maxStroke);
        c.setStroke(generateRandColor());
        c.setFill(Paint.valueOf("#00000000"));
        return c;
    }

    private void draw(Pane root) {
        for (int i = 0; i < COUNT_OF_CIRCLES; i++){
             Circle circle = generateCircle(200,25);
            root.getChildren().addAll(circle);
        }
    }
}

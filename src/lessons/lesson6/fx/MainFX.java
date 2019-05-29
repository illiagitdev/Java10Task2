package lessons.lesson6.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MainFX extends Application {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public static void main(String[] args) { launch(args); }

    void windowsSetup(Stage stage){
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);

        stage.setMinWidth(WIDTH);
        stage.setMinHeight(HEIGHT);

        stage.setMaxWidth(WIDTH);
        stage.setMaxHeight(HEIGHT);
    }

    @Override
    public void start(Stage stage) throws Exception {
        windowsSetup(stage);
        Pane root = new Pane();
        stage.show();

        //UI - user interface
        Text text = new Text("Hello World!");
        text.setTranslateX(10);
        text.setTranslateY(10);

        text.setText(text.getText() + "\nnew line");

        root.getChildren().addAll(text);

        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
}

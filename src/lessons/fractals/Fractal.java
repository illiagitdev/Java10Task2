package lessons.fractals;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Fractal extends Application {

    public static void main(String[] args) {launch(args);    }

    // todo: write three fractals
    @Override
    public void start(Stage stage) throws Exception {
        windowUI(stage);
        Pane root = new Pane();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //  window size
    private void windowUI(Stage stage) {

    }

}

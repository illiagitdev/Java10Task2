package lessons.lesson6.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//      todo: Config VM with this path to run
//      --module-path c:\javafx-sdk-12.0.1\lib\ --add-modules javafx.controls,javafx.fxml
public class MainFX extends Application {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public static void main(String[] args) throws Exception { launch(args); }

    void windowsSetup(Stage stage){
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);

        stage.setMinWidth(WIDTH);
        stage.setMinHeight(HEIGHT);

        stage.setMaxWidth(WIDTH);
        stage.setMaxHeight(HEIGHT);
    }

    void uiSetup(Pane root){
        /* --Text ----------------------------------*/
        //--------------------------------------------
//        //UI - user interface
        Text text = new Text("Hello World!");
        text.setTranslateX(10);
        text.setTranslateY(10);
        Font font = new Font(24);
        text.setFont(font);

        text.setText(text.getText() + "\nnew line");

        //--Text Field-----------------------------
        //----------------------------------------
        TextField textField = new TextField("100");
        textField.setTranslateX(210);
        textField.setTranslateY(10);

        /* --Button -------------------------------*/
        //------------------------------------------
        Button button = new Button("Add number");
        button.setTranslateX(100);
        button.setTranslateY(10);

        // lambda - підписуємось на подію
        // todo: add scroll so we click many times and can scroll to the end of the line
        button.setOnMouseClicked((event) -> {
            String number = textField.getText();
            String oldText = text.getText();
            text.setText(oldText + "\n" + number);
        });

        root.getChildren().addAll(text, button, textField);
    }
    @Override
    public void start(Stage stage) throws Exception {
        windowsSetup(stage);

        Pane root = new Pane();
        uiSetup(root);


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

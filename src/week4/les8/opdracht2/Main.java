package week4.les8.opdracht2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button("Say, 'Hello World'");
        Button btn2 = new Button("EXTRAAA");
        //FlowPane flow = new FlowPane();
        //flow.setPadding(new Insets(5, 0, 5, 0));

        //HBox hBox = new HBox(10);
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(5, 0, 5, 0));
        StackPane root = new StackPane();
        Label l = new Label("Tekst");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                l.setText("TEKST A");
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                l.setText("TEKST B");
            }
        });
        btn.setPrefWidth(300);
        btn2.setPrefWidth(300);
        l.setPrefWidth(300);
        vbox.getChildren().add(btn);
        vbox.getChildren().add(btn2);
        vbox.getChildren().add(l);
        primaryStage.setScene(new Scene(vbox, 300, 250));
        primaryStage.show();
    }
}

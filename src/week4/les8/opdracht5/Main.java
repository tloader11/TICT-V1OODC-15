 package week4.les8.opdracht5;
    //Imports are listed in full to show what's being used
    //could just import javafx.*
    import javafx.application.Application;
    import javafx.collections.FXCollections;
    import javafx.event.ActionEvent;
    import javafx.event.EventHandler;
    import javafx.geometry.Insets;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.ChoiceBox;
    import javafx.scene.control.Label;
    import javafx.scene.control.ListView;
    import javafx.scene.layout.BorderPane;
    import javafx.scene.layout.FlowPane;
    import javafx.stage.Stage;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Date;
    import java.util.List;

    public class Main extends Application {


        public static void main(String[] args) {
            launch(args);
        }
        //starting point for the application
//this is where we put the code for the user interface
        @Override
        public void start(Stage primaryStage) {
            Loper m1 = new Loper("ZijnNaam1","89235765","stucador", true);
            Loper m2 = new Loper("ZijnNaam2","89235765","loodgieter", true);
            //The primaryStage is the top-level container
            primaryStage.setTitle("builder");
            //The BorderPane has the same areas laid out as the
            //BorderLayout layout manager
            BorderPane componentLayout = new BorderPane();
            componentLayout.setPadding(new Insets(20,0,20,20));
            //The FlowPane is a conatiner that uses a flow layout
            final FlowPane choicePane = new FlowPane();
            choicePane.setHgap(100);
            Label choiceLbl = new Label("Werkers");
            //The choicebox is populated from an observableArrayList
            ChoiceBox lopers = new ChoiceBox(FXCollections.observableArrayList(m1.getNaam(), m2.getNaam()));
            //Add the label and choicebox to the flowpane
            choicePane.getChildren().add(choiceLbl);
            choicePane.getChildren().add(lopers);
            //put the flowpane in the top area of the BorderPane
            componentLayout.setTop(choicePane);
            final FlowPane listPane = new FlowPane();
            listPane.setHgap(100);
            Label listLbl = new Label("Chores");
            ListView beroepen = new ListView(FXCollections.observableArrayList("Loodgieter","stucador", "grasmaaier"));
            listPane.getChildren().add(listLbl);
            listPane.getChildren().add(beroepen);
            listPane.setVisible(false);
            componentLayout.setCenter(listPane);
            //The button uses an inner class to handle the button click event
            Button assign = new Button("Assign");
            Button unassign = new Button("Unassign");
            unassign.setTranslateX(250);
            assign.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Assign to chore");
                    choicePane.getChildren().get(1);
                    //new Klus(1,"Nieuwe klus", new List<Activiteit>(Arrays.asList()), m1);
                }

            });
            componentLayout.setBottom(assign);
            componentLayout.setBottom(unassign);
            //Add the BorderPane to the Scene
            Scene appScene = new Scene(componentLayout,500,500);
            //Add the Scene to the Stage
            primaryStage.setScene(appScene);
            primaryStage.show();
        }
}

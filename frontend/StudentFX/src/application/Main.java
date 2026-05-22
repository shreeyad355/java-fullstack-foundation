package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label nameLabel = new Label("Name");

        TextField nameField = new TextField();

        Label ageLabel = new Label("Age");

        TextField ageField = new TextField();

        Button addButton = new Button("Add Student");

        VBox root = new VBox(10);

        root.setPadding(new Insets(20));

        root.getChildren().addAll(
                nameLabel,
                nameField,
                ageLabel,
                ageField,
                addButton
        );

        Scene scene = new Scene(root, 300, 250);

        stage.setScene(scene);

        stage.setTitle("Student Form");

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
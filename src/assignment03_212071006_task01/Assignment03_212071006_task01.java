/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package assignment03_212071006_task01;

import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author samiul
 */
public class Assignment03_212071006_task01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Assignment03 Task-1");

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-padding: 20;");

        Label titleLabel = new Label("Sample Form");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER_LEFT);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label usernameLabel = new Label("Username:");
        Label passwordLabel = new Label("Password:");

        TextField idField = new TextField();

        PasswordField passwordField = new PasswordField();

        Label sampleQuestionLabel = new Label("Sample Question");

        ToggleGroup genderGroup = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("Male");
        maleRadio.setToggleGroup(genderGroup);
        RadioButton femaleRadio = new RadioButton("Female");
        femaleRadio.setToggleGroup(genderGroup);
        RadioButton otherRadio = new RadioButton("Other");
        otherRadio.setToggleGroup(genderGroup);

        VBox radioBox = new VBox(5);
        radioBox.getChildren().addAll(sampleQuestionLabel, maleRadio, femaleRadio, otherRadio);

        Button submitButton = new Button("Submit");

        submitButton.setOnAction(e -> {
            String userId = idField.getText();
            String password = passwordField.getText();
            RadioButton selectedRadio = (RadioButton) genderGroup.getSelectedToggle();
            String gender = selectedRadio.getText();

            System.out.println("User ID: " + userId);
            System.out.println("Password: " + password);
            System.out.println("Gender: " + gender);
        });
        
        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(idField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);

        gridPane.add(radioBox, 0, 2, 2, 1);
        gridPane.add(submitButton, 0, 3, 2, 1);

        vbox.getChildren().addAll(titleLabel, gridPane);

        Scene scene = new Scene(vbox, 300, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}

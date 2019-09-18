package com.company;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    // reference: https://www.youtube.com/watch?v=FLkOX4Eez6o

    Button button;

    public static void main(String[] args) {

        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Central Dogma of Biology+Other f(n)"); //main stage or window
        this.button = new Button(); // this is a button
        button.setText("Click Me");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

    }


    }




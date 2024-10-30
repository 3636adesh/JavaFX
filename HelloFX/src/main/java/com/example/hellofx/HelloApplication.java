package com.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.net.URL;



public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    private Image getIcons() throws FileNotFoundException {
        URL iconURL = getClass().getResource("/asset/media/icons/icon.png");

        if (iconURL == null) {
            throw new FileNotFoundException("Icon not found in /asset/media/icons/icon.png");
        }
        return new Image(iconURL.toString());

    }

    @Override
    public void start(Stage stage) throws Exception {


        var root = new Group();
        Scene scene = new Scene(root, Color.GRAY);
        stage.setTitle("Hello FX");
        stage.getIcons().add(getIcons());

        stage.setWidth(420.0);
        stage.setHeight(420.0);
        stage.setResizable(false);
        stage.setX(50);
        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("q"));

        stage.setScene(scene);
        stage.show();
    }
}
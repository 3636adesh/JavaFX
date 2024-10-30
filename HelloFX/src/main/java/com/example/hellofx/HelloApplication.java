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
import java.util.Objects;


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
        Scene scene = new Scene(root,Color.GRAY);
        stage.setTitle("Hello FX");
        stage.getIcons().add(getIcons());
        stage.setScene(scene);
        stage.show();

        //Stage stage = new Stage();
//        Group root = new Group();
//        Scene scene = new Scene(root,Color.BLACK);

//        Image icon = new Image("icon.png");
//        stage.getIcons().add(icon);
//        stage.setTitle("Stage Demo Program w00t w00t");
//        stage.setWidth(420);
//        stage.setHeight(420);
//        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
//
//        stage.setScene(scene);
//        stage.show();
    }
}
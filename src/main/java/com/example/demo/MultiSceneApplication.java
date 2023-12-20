package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;

public class MultiSceneApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private static Stage stageReference;
    public static Scene scene;
    private static double x = 0;
    private static double y = 0;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stageReference = primaryStage;
        scene = new Scene(loadFXML("Login"));
        primaryStage.setTitle("Multi-Scene Application!");
        primaryStage.setScene(scene);
        setRootAsDraggable();
        primaryStage.show();
    }
    public static Stage getStageReference(){
        return stageReference;
    }

    public static Scene getScene(){ return scene;}
    public static double getX(){return x;}
    public static double getY(){return y;}

    static void setRoot(String fxml) throws IOException {
        MultiSceneApplication.scene.setRoot(loadFXML(fxml));
        MultiSceneApplication.scene.getWindow().sizeToScene();
        MultiSceneApplication.scene.getWindow().centerOnScreen();
        setRootAsDraggable();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MultiSceneApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void setRootAsDraggable(){

        Parent root = stageReference.getScene().getRoot();
        root.setOnMousePressed((MouseEvent event) ->{
            x = event.getX();
            y = event.getY();
        });

        root.setOnMouseDragged((MouseEvent event) ->{
            MultiSceneApplication.stageReference.setX(event.getScreenX() - x);
            MultiSceneApplication.stageReference.setY(event.getScreenY() - y);


        });


    }
     static class GetData {
        public static String username="Esma";
        public static String password="JavaFx123";
    }





}

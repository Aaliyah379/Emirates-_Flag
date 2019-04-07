import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.StrokeType;

import java.awt.Shape;
import java.awt.geom.Path2D;

import java.awt.*;

public class Flag extends Application {

    public static void main(String[] args) {
        launch(args);

    }


    @Override
    public void start(Stage primaryStage) {
        Group root = new Group(); // create a root node


        Rectangle rectangle1 = new Rectangle(50, 50, 435, 300);
        Rectangle rectangle11 = new Rectangle( 435, 100, Color.WHITE);
        Rectangle rectangle12 = new Rectangle( 435, 100, Color.GREEN);
        Rectangle rectangle13 = new Rectangle( 435, 100, Color.BLACK);
        Rectangle rectanglel4 = new Rectangle(100,300,Color.RED);
        rectangle11.setTranslateX(50);
        rectangle11.setTranslateY(150);
        rectangle12.setTranslateX(50);
        rectangle12.setTranslateY(50);
        rectangle13.setTranslateX(50);
        rectangle13.setTranslateY(250);
        rectanglel4.setTranslateY(50);
        rectanglel4.setTranslateX(40);

        root.getChildren().add(rectangle1);  // place the rectangle onto the scene
        root.getChildren().add(rectangle12);  // place the rectangle onto the scene
        root.getChildren().add(rectangle13);  // place the rectangle onto the scene
        root.getChildren().add(rectangle11);  // place the rectangle onto the scene
        root.getChildren().add(rectanglel4);  // place the rectangle onto the scene





        Scene scene1 = new Scene(root, 535, 535, Color.SNOW);  // create the scene
        primaryStage.setTitle("Flag Of Emirates");  // set a title for the stage
        primaryStage.setScene(scene1);  // place the scene onto the stage
        primaryStage.show();  // display the stage



    }
}

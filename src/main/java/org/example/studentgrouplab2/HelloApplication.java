package org.example.studentgrouplab2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/studentgrouplab2/hello-view.fxml"));
            Parent root = loader.load();
            primaryStage.setTitle("Student Management System");
            primaryStage.setScene(new Scene(root, 800, 400));
            primaryStage.setResizable(false
            );
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

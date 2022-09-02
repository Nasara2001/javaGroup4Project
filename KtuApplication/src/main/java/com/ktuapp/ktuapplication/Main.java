package com.ktuapp.ktuapplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class Main extends Application {

    @Override
    public void start(Stage primarystage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        primarystage.setScene(new Scene(root,600,400));
        primarystage.setTitle("KTU App");
        primarystage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
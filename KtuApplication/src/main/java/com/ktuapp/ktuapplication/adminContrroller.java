package com.ktuapp.ktuapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class adminContrroller {

    @FXML
    private Button btnadminBack;

    public void adminback() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        Stage window = (Stage) btnadminBack.getScene().getWindow();
        window.setTitle("KTU App");
        window.setScene(new Scene(root, 600, 400));
    }
}

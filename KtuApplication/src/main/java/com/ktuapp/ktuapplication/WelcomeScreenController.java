package com.ktuapp.ktuapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;
import java.sql.*;
import java.util.Objects;

public class WelcomeScreenController {




    @FXML
    private Button studentPortalButton;
    @FXML
    private Button vleAssistanceButton;

    @FXML
    private Button connectToWifiButton;

    @FXML
    private Button btnAdmin;


    @FXML
    private Button requestButton;

    @FXML
    private Button btnadminBack;




    public void adminback() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        Stage window = (Stage) btnadminBack.getScene().getWindow();
        window.setTitle("KTU App");
        window.setScene(new Scene(root, 600, 400));
    }





    public void request() throws IOException {
        Stage stage = (Stage) requestButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("review.fxml")));
        primaryStage.setTitle("Help!");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public void adminPanel() throws IOException {
        Stage stage = (Stage) btnAdmin.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Admin.fxml")));
        primaryStage.setTitle("Admin!");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }








    public void portal() throws IOException {
        Stage stage = (Stage) studentPortalButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("studentPortal.fxml")));
        primaryStage.setTitle("Student Portal");
        primaryStage.setScene(new Scene(root, 600, 503));
        primaryStage.show();
    }

    public void vle() throws IOException {
        Stage stage = (Stage) vleAssistanceButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("VleAssist.fxml"));
        primaryStage.setTitle("VLE ASSIST");
        primaryStage.setScene(new Scene(root, 600, 562));
        primaryStage.show();


    }

    public void wifi() throws IOException {
        Stage stage = (Stage) connectToWifiButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("connectWifi.fxml"));
        primaryStage.setTitle("WIFI");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();


    }






}
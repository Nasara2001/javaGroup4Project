package com.ktuapp.ktuapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class VleAssistController implements Initializable {

    @FXML
    private Button vleBackButton;
    @FXML
    private Label txtStep1;

    @FXML
    private Label txtStep2;

    @FXML
    private Label txtStep3;

    @FXML
    private Label txtStep4;

    @FXML
    private Label txtStep5;

    @FXML
    private Label txtreset1;

    @FXML
    private Label txtreset2;

    @FXML
    private Label txtreset3;

    @FXML
    private Label txtreset4;

    @FXML
    private Label txtreset5;

    @FXML
    private Label txtreset6;

    @FXML
    private Label txtreset7;

    @FXML
    private Label txtreset8;

    @FXML
    private Label txtreset9;



    public void login(){
        DatabaseConnect connectNow=new DatabaseConnect();
        Connection connectDB= connectNow.getConnection();

        String checkconnect= "SELECT * FROM vle where Step_id = 2;";


        try {

            Statement statement=connectDB.createStatement();
            ResultSet queryResults=statement.executeQuery(checkconnect);
            if (queryResults.next()) {
                txtStep1.setText(queryResults.getString(2));
                txtStep2.setText(queryResults.getString(3));
                txtStep3.setText(queryResults.getString(4));
                txtStep4.setText(queryResults.getString(5));
                txtStep5.setText(queryResults.getString(6));

            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    public void reset(){
        DatabaseConnect connectNow=new DatabaseConnect();
        Connection connectDB= connectNow.getConnection();

        String checkconnect= "SELECT * FROM vle where Step_id = 4;";


        try {

            Statement statement=connectDB.createStatement();
            ResultSet queryResults=statement.executeQuery(checkconnect);
            if (queryResults.next()) {
                txtreset1.setText(queryResults.getString(2));
                txtreset2.setText(queryResults.getString(3));
                txtreset3.setText(queryResults.getString(4));
                txtreset4.setText(queryResults.getString(5));
                txtreset5.setText(queryResults.getString(6));
                txtreset6.setText(queryResults.getString(7));
                txtreset7.setText(queryResults.getString(8));
                txtreset8.setText(queryResults.getString(9));
                txtreset9.setText(queryResults.getString(10));


            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }





    public void vleBack() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        Stage window = (Stage) vleBackButton.getScene().getWindow();
        window.setTitle("KTU App");
        window.setScene(new Scene(root, 600, 400));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login();
        reset();

    }
}




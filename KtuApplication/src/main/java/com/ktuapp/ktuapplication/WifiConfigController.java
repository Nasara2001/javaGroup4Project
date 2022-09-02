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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class WifiConfigController implements Initializable {

    @FXML
    private Label txtwifi1;


    @FXML
    private Label txtwifi2;

    @FXML
    private Label txtwifi3;

    @FXML
    private Button wifiBackButton;

    @FXML
    private Label lblPawword1;

    @FXML
    private Label lblPawword2;



    public void wificonn(){
        DatabaseConnect connectNow=new DatabaseConnect();
        Connection connectDB= connectNow.getConnection();

        String checkconnect= "SELECT * FROM wifi where wifi_step_id = 1;";


        try {

            Statement statement=connectDB.createStatement();
            ResultSet queryResults=statement.executeQuery(checkconnect);
            if (queryResults.next()) {
                txtwifi1.setText(queryResults.getString(2));
                txtwifi2.setText(queryResults.getString(3));
                txtwifi3.setText(queryResults.getString(4));

            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    public void passwords(){
        DatabaseConnect connectNow=new DatabaseConnect();
        Connection connectDB= connectNow.getConnection();

        String checkconnect= "SELECT * FROM wifi_passwords where passwords_id = 1";

        try {
            Statement statement=connectDB.createStatement();
            ResultSet queryResults=statement.executeQuery(checkconnect);
            if (queryResults.next()){
                lblPawword1.setText(queryResults.getString(2));
                lblPawword2.setText(queryResults.getString(3));
            }

        }catch (SQLException e){
            e.printStackTrace();
            e.getCause();
        }

    }

    public void wifiBack() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        Stage window = (Stage) wifiBackButton.getScene().getWindow();
        window.setTitle("KTU App");
        window.setScene(new Scene(root, 600, 400));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        wificonn();
        passwords();


    }
}

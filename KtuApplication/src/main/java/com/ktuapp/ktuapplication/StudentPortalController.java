package com.ktuapp.ktuapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;


public class StudentPortalController implements Initializable {


    @FXML
    private Label lblcourse1;

    @FXML
    private Label lblcourse2;

    @FXML
    private Label lblcourse3;

    @FXML
    private Label lblcourse4;

    @FXML
    private Label lblcourse5;

    @FXML
    private Label lblcourse6;

    @FXML
    private Button portalBackButton;

    @FXML
    private Label lblresult1;

    @FXML
    private Label lblresult2;

    @FXML
    private Label lblresult3;

    @FXML
    private Label lblresult4;

    @FXML
    private Label lblresult5;


    public void register() {
        DatabaseConnect connectNow=new DatabaseConnect();
        Connection connectDB= connectNow.getConnection();

        String checkconnect= "SELECT * FROM portal where enquire_id = 5;";

        try {
            Statement statement=connectDB.createStatement();
            ResultSet queryResults=statement.executeQuery(checkconnect);
            if (queryResults.next()) {
                lblcourse1.setText(queryResults.getString(2));
                lblcourse2.setText(queryResults.getString(3));
                lblcourse3.setText(queryResults.getString(4));
                lblcourse4.setText(queryResults.getString(5));
                lblcourse5.setText(queryResults.getString(6));
                lblcourse6.setText(queryResults.getString(7));



            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

    }

    public void portalBack() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        Stage window = (Stage) portalBackButton.getScene().getWindow();
        window.setTitle("KTU App");
        window.setScene(new Scene(root, 600, 400));
    }

    public void results() {
        DatabaseConnect connectNow=new DatabaseConnect();
        Connection connectDB= connectNow.getConnection();

        String checkconnect= "SELECT * FROM portal where enquire_id = 6;";

        try {
            Statement statement=connectDB.createStatement();
            ResultSet queryResults=statement.executeQuery(checkconnect);
            if (queryResults.next()) {

               lblresult1.setText(queryResults.getString(2));
               lblresult2.setText(queryResults.getString(3));
               lblresult3.setText(queryResults.getString(4));
               lblresult4.setText(queryResults.getString(5));



            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        register();
        results();

    }
}


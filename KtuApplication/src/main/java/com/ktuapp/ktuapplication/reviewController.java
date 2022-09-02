package com.ktuapp.ktuapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.AccessibleAction;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class reviewController implements Initializable {


    @FXML
    private TextArea questionTA;

    @FXML
    private Button btnSubmit;






    public void quustion() throws Exception{
    DatabaseConnect connectNow=new DatabaseConnect();
    Connection connectDB= connectNow.getConnection();
    String insert="INSERT INTO questions(question)" + "VALUES(?)";
    String requestUsername="INSERT INTO questions(Username)" +"VALUES(?)";
        try {
            PreparedStatement preparedStatement= connectDB.prepareStatement(insert);
            preparedStatement.setString(1, questionTA.getText());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




        Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        Stage window = (Stage) btnSubmit.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}



package com.ktuapp.ktuapplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.sql.DriverManager;

import java.sql.*;

public class DatabaseConnect {

    public Connection databaselink;

    public Connection getConnection(){


        String databaseName="ktuapp";
        String databaseUser="root";
        String databasePassword="root";
        String url="jdbc:mysql://localhost:3306/"+databaseName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink=DriverManager.getConnection(url,databaseUser,databasePassword);
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

        return databaselink;

    }





}

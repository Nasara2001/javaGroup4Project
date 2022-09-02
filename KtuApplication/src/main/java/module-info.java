module com.ktuapp.ktuapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.ktuapp.ktuapplication to javafx.fxml;
    exports com.ktuapp.ktuapplication;
}
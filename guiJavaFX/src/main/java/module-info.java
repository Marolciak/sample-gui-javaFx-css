module com.example.guijavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guijavafx to javafx.fxml;
    exports com.example.guijavafx;
}
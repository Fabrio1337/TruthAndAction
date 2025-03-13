module org.example.truthandaction {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.truthandaction to javafx.fxml;
    exports org.example.truthandaction;
}
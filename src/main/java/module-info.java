module org.example.truthandaction {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.aspectj.weaver;
    requires spring.context;


    opens org.example.truthandaction to javafx.fxml;
    exports org.example.truthandaction;
    exports org.example.truthandaction.Aspects;
    opens org.example.truthandaction.Aspects to javafx.fxml;
}
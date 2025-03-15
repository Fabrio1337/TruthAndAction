module org.example.truthandaction {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.aspectj.weaver;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.aop;

    opens org.example.truthandaction to javafx.fxml, spring.core, spring.beans, spring.context;


    exports org.example.truthandaction;
    exports org.example.truthandaction.Aspects;
    opens org.example.truthandaction.Aspects to javafx.fxml, spring.core, spring.beans, spring.context, spring.aop;
}
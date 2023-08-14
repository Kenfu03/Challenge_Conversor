module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires unirest.java;

    opens org.example to javafx.fxml;
    exports org.example;
}

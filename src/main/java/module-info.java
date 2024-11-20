module org.example.demo12345 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demo12345 to javafx.fxml;
    exports org.example.demo12345;
}
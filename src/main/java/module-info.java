module com.example.calculator_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator_java to javafx.fxml;
    exports com.example.calculator_java;
}
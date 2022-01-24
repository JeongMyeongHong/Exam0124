module com.bitcamp.exam0124 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bitcamp.exam0124 to javafx.fxml;
    exports com.bitcamp.exam0124;
}
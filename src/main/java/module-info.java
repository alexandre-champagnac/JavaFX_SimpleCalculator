module com.sio.tp_calculatrice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sio.tp_calculatrice to javafx.fxml;
    exports com.sio.tp_calculatrice;
}
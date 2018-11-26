package sample;


import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

public class Controller {

    public static TextField imeField;
    private SimpleStringProperty ime;

    public Controller() { ime=new SimpleStringProperty("");
    imeField= new TextField();
    }



}

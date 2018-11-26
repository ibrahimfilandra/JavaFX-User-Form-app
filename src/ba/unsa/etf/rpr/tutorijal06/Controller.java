package ba.unsa.etf.rpr.tutorijal06;


import com.sun.deploy.panel.TextFieldProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

import java.awt.*;
import javafx.scene.control.TextField;

public class Controller {

    public TextField imeField;
    public SimpleStringProperty ime;
    public ComboBox mjestorodjenja;
    ObservableList<String> mjesta= FXCollections.observableArrayList("Sarajevo","Zenica","Tuzla","Mostar","Banja Luka");

    public Controller() { ime=new SimpleStringProperty("");
    imeField= new TextField();
    }

    public void initialize() {
        mjestorodjenja.setItems(mjesta);

        imeField.textProperty().addListener(new ChangeListener<String>() {

            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                if (validnoIme(n)) {
                    imeField.getStyleClass().removeAll("poljeneispravno");
                    imeField.getStyleClass().add("poljeispravno");
                } else {
                    imeField.getStyleClass().removeAll("poljeispravno");
                    imeField.getStyleClass().add("poljeneispravno");
                }
            }
        });
    }



    public boolean validnoIme(String s) {
        if(s.length()>0 && s.length()<20) return true;
return false;
    }






}

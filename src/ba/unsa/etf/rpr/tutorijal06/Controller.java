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
    public TextField prezimeField;
    public TextField indeksField;
    public SimpleStringProperty ime;
    public ComboBox mjestorodjenja;
    ObservableList<String> mjesta= FXCollections.observableArrayList("Sarajevo","Zenica","Tuzla","Mostar","Banja Luka");

    public Controller() { ime=new SimpleStringProperty("");
    imeField= new TextField();
    prezimeField=new TextField();
    indeksField=new TextField();
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

        prezimeField.textProperty().addListener(new ChangeListener<String>() {

            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                if (validnoIme(n)) {
                    prezimeField.getStyleClass().removeAll("poljeneispravno");
                    prezimeField.getStyleClass().add("poljeispravno");
                } else {
                    prezimeField.getStyleClass().removeAll("poljeispravno");
                    prezimeField.getStyleClass().add("poljeneispravno");
                }
            }
        });

        indeksField.textProperty().addListener(new ChangeListener<String>() {

            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                if (validanIndeks(n)) {
                    indeksField.getStyleClass().removeAll("poljeneispravno");
                    indeksField.getStyleClass().add("poljeispravno");
                } else {
                    indeksField.getStyleClass().removeAll("poljeispravno");
                    indeksField.getStyleClass().add("poljeneispravno");
                }
            }
        });




    }



    public boolean validnoIme(String s) {
        if(s.length()>0 && s.length()<20) return true;
return false;
    }

public boolean validanIndeks(String s){
if(s.length()==5) {
    try{
        Integer.parseInt(s);
    }catch(Exception e) {
        return false;
    }
    return true;
}
return false;

}








}

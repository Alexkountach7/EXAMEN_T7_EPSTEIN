package org.example.demo;

import javafx.beans.Observable;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import kotlin.annotation.AnnotationTarget;

import java.io.IOException;
import java.util.ArrayList;

public class pantalla2controller {

   // static ObservableList<Persona> listapersona = FXCollections.observableArrayList();
        @FXML
        private TextField nombretextfield;

        @FXML
        private TextField edadtextfield;

        @FXML
        private TableView<Persona> personastableview;

        @FXML
        private TableColumn<Persona,Integer> edadtablecolumn;

    @FXML
    private TableColumn<Persona, String> nombretablecolumn;

        @FXML
        public void initialize() {
            nombretablecolumn.setCellValueFactory(datos -> new SimpleStringProperty(datos.getValue().getNombre()));

            edadtablecolumn.setCellValueFactory(datos -> new SimpleIntegerProperty(datos.getValue().getEdad()).asObject());

            personastableview.setItems(PersonasCreadas.getListapersona());
        }




    public void volverbutton(ActionEvent actionEvent) throws IOException {

        HelloApplication.setRoot("hello-view");
    }


    public void guardarboton() {
        String nombre = nombretextfield.getText();
        Integer edad = Integer.parseInt(edadtextfield.getText());

        Persona persona = new Persona(nombre, edad);
        PersonasCreadas.insertarpersona(persona);

        System.out.println("persona creada; "+nombre+ "-" +edad);
        System.out.print(PersonasCreadas.getListapersona());
        nombretextfield.clear();
        edadtextfield.clear();
    }
}

package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PersonasCreadas {

    static ObservableList<Persona> listapersona = FXCollections.observableArrayList();

    public static void insertarpersona (Persona persona){
        listapersona.add(persona);


    }

    public static ObservableList<Persona> getListapersona (){

        return listapersona;
    }
}

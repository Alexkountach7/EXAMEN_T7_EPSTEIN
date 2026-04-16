package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {

    static Contador contador = new Contador();

    @FXML
    private Label welcomeText;

    @FXML
    private Label contadorLabel;

    @FXML
    private Button pruebaclickbutton;

    @FXML
    public void initialize() {
        pruebaclickbutton.setOnAction(event -> {
            contador.contar();
            contadorLabel.setText(Integer.toString(contador.getContador()));
        });
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("holaaaaa");
    }

    @FXML
    public void resetclicbutton() {
        contador.setContador(0);
        contadorLabel.setText("0");
    }

    public void pantalla2button() throws IOException {
        HelloApplication.setRoot("pantalla2");
    }

}
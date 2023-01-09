package com.example.guijavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Button bGlowna;
    @FXML
    private Button bDodajZadanie;
    @FXML
    private Button bUstawBudzik;
    @FXML
    private Button bUstawienia;

    @FXML
    private Button bWyjscie;
    @FXML
    private Label napis;

    @FXML
    public void handleClick(ActionEvent event){
        if (event.getSource() == bGlowna)
        {
            napis.setText("Jesteś na stronie głównej");
        }
        if (event.getSource() == bDodajZadanie)
        {
            napis.setText("Jesteś na stronie dodaj zadanie");
        }
        if (event.getSource() == bUstawBudzik)
        {
            napis.setText("Jesteś na stronie ustaw budzik");
        }
        if (event.getSource() == bUstawienia)
        {
            napis.setText("Jesteś na stronie ustawienia");
        }
    }

    public void handleClose(ActionEvent event){
        if (event.getSource() == bWyjscie){
            System.exit(1);
        }
    }

}
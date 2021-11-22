package com.example.mychat;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyChatController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
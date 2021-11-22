package com.example.mychat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MyChatController {

    @FXML
    TextArea mainTextArea;


    @FXML
    TextField message;


    @FXML
    protected void onSendButtonClick(ActionEvent actionEvent) {
        if (!message.getText().isEmpty()) {
            mainTextArea.appendText(message.getText() + "\n");
            message.clear();
        }
    }
}
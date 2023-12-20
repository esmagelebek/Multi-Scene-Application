package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MultiSceneAplicationController {
    @FXML
    private  Label  welcomeText;

    @FXML
    private TextField password;

    @FXML
    private TextField username;
    @FXML
    private Button login;

    @FXML
    private void loginButtonAction() throws IOException {
        Alert alert;
        try {
            if (username.getText().equals(MultiSceneApplication.GetData.username) ||
                    password.getText().equals(MultiSceneApplication.GetData.password)) {

                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully Login!");
                alert.showAndWait();
                MultiSceneApplication.setRoot("Logout");





            } else {

                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Wrong Username/Password");
                alert.showAndWait();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}

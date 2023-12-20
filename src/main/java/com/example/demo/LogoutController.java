package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class LogoutController {
    @FXML
    private Label Text;
    @FXML
    protected void onLogOutButtonClick() throws IOException {
        System.out.println("Basariyla cikis yapildi");
        MultiSceneApplication.setRoot("Login");

    }

}

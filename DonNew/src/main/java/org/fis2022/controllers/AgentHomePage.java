package org.fis2022.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AgentHomePage {

    @FXML
    private Button buttonAdaugaListare;
    @FXML
    private Button backButton;
    @FXML
    private Button buttonModificaListare;
    @FXML
    private Button buttonProfil;
    @FXML
    private Button buttonMesaje;

    @FXML
    private void loadAdaugaListare(){
        try {
            Stage stage = (Stage) buttonAdaugaListare.getScene().getWindow();
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/fxml/AdaugaListare.fxml"));
            Scene scene = new Scene(loginRoot, 640, 480);
            stage.setTitle("Real Estate App - Adauga Listare");
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadLogin(){
        try {
            Stage stage = (Stage) backButton.getScene().getWindow();
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
            Scene scene = new Scene(loginRoot, 640, 480);
            stage.setTitle("Real Estate App");
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

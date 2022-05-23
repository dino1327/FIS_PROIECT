package org.fis2022.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PagListariUser {

    @FXML
    private Button backButton;
    @FXML
    private Button loginButton;

    @FXML
    private void loadLogin(){
        try {
            Stage stage = (Stage) loginButton.getScene().getWindow();
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
            Scene scene = new Scene(loginRoot, 640, 480);
            stage.setTitle("Real Estate App");
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadStart(){
        try {
            Stage stage = (Stage) backButton.getScene().getWindow();
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/fxml/PaginaPornire.fxml"));
            Scene scene = new Scene(loginRoot, 640, 480);
            stage.setTitle("Real Estate App");
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

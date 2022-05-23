package org.fis2022.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.fis2022.exceptions.UsernameAlreadyExists;
import org.fis2022.services.UserService;

import java.io.IOException;

public class Inregistrare {

    @FXML
    private Text registrationMessage;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private ChoiceBox role;

    @FXML
    public void initialize() {
        role.getItems().addAll("Client", "Agent");
        role.getSelectionModel().select(0);
    }

    @FXML
    public void handleRegisterAction() {
        try {
            if(usernameField.getText().isEmpty() || passwordField.getText().isEmpty()){
                registrationMessage.setText("Campurile trebuie completate!");
                return;
            }
            UserService.addUser(usernameField.getText(), passwordField.getText(), (String) role.getValue());
            registrationMessage.setText("Contul a fost creat cu succes!");
        } catch (UsernameAlreadyExists e) {
            registrationMessage.setText(e.getMessage());
        }
    }
    public void loadLoginPage(){
        try {
            Stage stage = (Stage) registrationMessage.getScene().getWindow();
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
            Scene scene = new Scene(loginRoot, 640, 480);
            stage.setTitle("Autentificare - Real Estate App");
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package org.fis2022.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.fis2022.exceptions.ProductAlreadyExists;
import org.fis2022.services.ProductService;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AdaugaListare {
    @FXML
    private TextField produs;
    @FXML
    private TextField pret;
    @FXML
    private TextField descriere;
    @FXML
    private Label errMessage;
    @FXML
    private Button backButton;

    public void initialize(){
        ProductService.initService();
    }

    @FXML
    private void resetForm(){
        produs.clear();
        pret.clear();
        descriere.clear();
    }

    public void addProduct(){
        try {
            ProductService.addProduct(produs.getText(), Float.parseFloat(pret.getText()), descriere.getText());
            errMessage.setText("Listarea a fost adaugata!");
            resetForm();
        }
        catch(ProductAlreadyExists e) {
            errMessage.setText(e.getMessage());
        }
    }

    @FXML
    public void loadModificaMeniu(){
        try {
            Stage stage = (Stage) backButton.getScene().getWindow();
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/fxml/AgentHomePage.fxml"));
            Scene scene = new Scene(loginRoot, 640, 480);
            stage.setTitle("Real Estate App");
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
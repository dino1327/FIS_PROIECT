package org.fis2022.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PaginaPornire {
    @FXML
    private Button backBTN;

    public void AgentButtonClick(){
        loadLogin();
    }
    public void ClientButtonClick(){
        loadLogin();
    }
    public void UserButtonClick(){
        //System.out.println("MAI ARE ROST?");
        loadPaginaListari();
    }

    private void loadLogin(){
        try{
            Stage stage = (Stage) backBTN.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
            Parent homeRoot = loader.load();
            Scene scene = new Scene(homeRoot, 640, 480);
            stage.setTitle("Real Estate App");
            stage.setScene(scene);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void loadPaginaListari(){
        try{
            Stage stage = (Stage) backBTN.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PagListariUser.fxml"));
            Parent homeRoot = loader.load();
            Scene scene = new Scene(homeRoot, 640, 480);
            stage.setTitle("Real Estate App");
            stage.setScene(scene);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

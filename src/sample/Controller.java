package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    public Button cancelButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void okAction(ActionEvent event){
        System.out.println("Clicked Ok");
        System.out.println("username: "+ username.getText());
        System.out.println("password: "+ password.getText());
    }

    public void cancelAction(ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}

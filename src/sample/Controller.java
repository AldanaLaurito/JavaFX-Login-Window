package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField username;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void okAction(ActionEvent event){
        System.out.println("Clicked Ok");
        System.out.println("username: "+ username.getText());
    }
}

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SportsmanHomePage {

    @FXML
    private Button goBackButton;

    @FXML
    void changeScreenButtonPushed(ActionEvent event) {

    }
    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        Parent loginView= FXMLLoader.load(getClass().getResource("/login.fxml"));
        Scene loginScene=new Scene(loginView);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(loginScene);
        window.show();
    }

}
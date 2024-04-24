
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import static javafx.scene.paint.Color.color;


public class MainController {
    
    @FXML
    private Button ButtonCompra;

    @FXML
    void MouseMoved(MouseEvent event) {
        ButtonCompra.setStyle("-fx-background-color: blue");
    }
    
    @FXML
    void MouseExited(MouseEvent event) {
        ButtonCompra.setStyle("-fx-background-color:  #00b7ff");
    }
    
    
    @FXML
    void MouseClicked(MouseEvent event) {
//        ButtonCompra.setStyle("-fx-background-color:  #03f507");
        
    }
    
    @FXML
    void MousePressed(MouseEvent event) {
        ButtonCompra.setStyle("-fx-background-color:  #03f507");
    }

    
}

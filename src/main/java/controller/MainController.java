
package controller;



import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import view.*;

public class MainController {
    
//    ClienteView clientes = new ClienteView();
    
    @FXML
    private Button ButtonCompra;
    
    @FXML
    private Button ButtonCliente;

    @FXML
    void MouseMoved(MouseEvent event) {
        ButtonCompra.setStyle("-fx-background-color: blue");
    }
    
    @FXML
    void MouseExited(MouseEvent event) {
        ButtonCompra.setStyle("-fx-background-color:  #00b7ff");
    }
    
    @FXML
    void MousePressed(MouseEvent event) {
        ButtonCompra.setStyle("-fx-background-color:  #03f507");
        
    }
    
    @FXML
    void MouseMovedCliente(MouseEvent event) {
        ButtonCliente.setStyle("-fx-background-color: blue");
    }
    
    @FXML
    void MouseExitedCliente(MouseEvent event) {
        ButtonCliente.setStyle("-fx-background-color:  #00b7ff");
    }
    
    ClienteView cliente = new ClienteView();
    @FXML
    void MousePressedCliente(MouseEvent event) throws IOException {
        ButtonCliente.setStyle("-fx-background-color:  #03f507");
        cliente.mainn();
    }

    
}

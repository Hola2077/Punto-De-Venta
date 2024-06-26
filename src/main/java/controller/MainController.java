
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
    private Button ButtonInventario;
    
    @FXML
    private Button ButtonDescuento;
    
    @FXML
    void MouseMoved(MouseEvent event) {
        ButtonCompra.setStyle("-fx-background-color: #0091ff");
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
        ButtonCliente.setStyle("-fx-background-color: #0091ff");
    }
    
    @FXML
    void MouseExitedCliente(MouseEvent event) {
        ButtonCliente.setStyle("-fx-background-color:  #00b7ff");
    }
    
    ClienteView cliente = new ClienteView();
    @FXML
    void MousePressedCliente(MouseEvent event) throws IOException {
        ButtonCliente.setStyle("-fx-background-color:  #03f507");
        cliente.main();
    }
    @FXML
    void MouseMovedInventario(MouseEvent event) {
        ButtonInventario.setStyle("-fx-background-color: #0091ff");
    }
    
    @FXML
    void MouseExitedInventario(MouseEvent event) {
        ButtonInventario.setStyle("-fx-background-color:  #00b7ff");
    }
    
    ProductoView inventario = new ProductoView();
    @FXML
    void MousePressedInventario(MouseEvent event) throws IOException{
        ButtonInventario.setStyle("-fx-background-color:  #03f507");
        inventario.main();
    }
    
    
    @FXML
    void MouseMovedDescuento(MouseEvent event) {
        ButtonDescuento.setStyle("-fx-background-color: #0091ff");
    }
    
    @FXML
    void MouseExitedDescuento(MouseEvent event) {
        ButtonDescuento.setStyle("-fx-background-color:  #00b7ff");
    }
    
    DescuentoView descuento = new DescuentoView();
    @FXML
    void MousePressedDescuento(MouseEvent event) throws IOException{
        ButtonDescuento.setStyle("-fx-background-color:  #03f507");
        descuento.main();
    }
    
}

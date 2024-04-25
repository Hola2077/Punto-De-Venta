/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Venta;

/**
 *
 * @author sistemas
 */
public class VentaController implements Initializable {
    
   

    @FXML
    private TableColumn<?, ?> columnCantidadProducto;

    @FXML
    private TableColumn<?, ?> columnCodigoProducto;

    @FXML
    private TableColumn<?, ?> columnDescripcionProducto;

    @FXML
    private TableColumn<?, ?> columnDescuentoVenta;

    @FXML
    private TableColumn<?, ?> columnPrecioProducto;

    @FXML
    private TableColumn<?, ?> columnSubtotalVenta;

    @FXML
    private TextField TextCantidad;

    @FXML
    private Button buttonAgregar;

    @FXML
    private TableView<?> tableViewVenta;

    @FXML
    private TextField tetxIdCliente;

    @FXML
    private TextField textCodigoFactura;

    @FXML
    private TextField textCodigoProducto;

    @FXML
    private TextField textNombreCliente;

    @FXML
    private TextField textProducto;

    @FXML
    private TextField textTotal;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

package controller;

import data.ProductoDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Producto;

public class ProductoController implements Initializable {

    private Producto producto;
    private ProductoDAO productoDAO = new ProductoDAO();
    private Alert alert = new Alert(Alert.AlertType.NONE);

    @FXML
    private TableColumn<Producto, Number> columnProductoCodigo;

    @FXML
    private TableColumn<Producto, String> columnProductoNombre;

    @FXML
    private TableColumn<Producto, Number> columnProductoPrecio;

    @FXML
    private TextField textProductoCodigo;

    @FXML
    private TextField textProductoNombre;

    @FXML
    private TextField textProductoPrecio;

    @FXML
    private TableView<Producto> tableViewProductos;

    @FXML
    void setOnActionButtonActualizar(ActionEvent event) {
        double precio;
        precio = Double.parseDouble(textProductoPrecio.getText());
        producto.setPrecio(precio);
        String nombre;
        nombre = textProductoNombre.getText();
        producto.setNombre(nombre);
    }

    @FXML
    void setOnActionButtonBuscar(ActionEvent event) {   
    }

    @FXML
    void setOnActionButtonEliminar(ActionEvent event
    ) {
        productoDAO.eliminar(producto);
    }

    @FXML
    private Button buttonNuevo;

    @FXML
    private Button buttonGuardar;

    @FXML
    void setOnActionButtonNuevo(ActionEvent event
    ) {
        textProductoCodigo.clear();
        textProductoNombre.clear();
        textProductoPrecio.clear();
    }

    private void mostrar(Producto producto) {
        if (producto == null) {
            return;
        }
        textProductoCodigo.setText(producto.getCodigo() + "");
        textProductoNombre.setText(producto.getNombre() + "");
        textProductoPrecio.setText(producto.getPrecio() + "");

    }

    @FXML
    void setOnMouseClicketTableViewProductos(MouseEvent event) {
        try {
            producto = tableViewProductos.getSelectionModel().getSelectedItem();
            mostrar(producto);
        } catch (Exception e) {

        }
    }

    @FXML
    void setOnActionButtonGuardar(ActionEvent event) {
        try {
            double precio;
            precio = Double.parseDouble(textProductoPrecio.getText());
            producto = new Producto(textProductoNombre.getText(), precio);
            textProductoCodigo.setText(producto.getCodigo() + "");
            productoDAO.agregar(producto);
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setContentText("Producto Creado");
            alert.show();
        } catch (Exception e) {
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productoDAO = new ProductoDAO();
        alert = new Alert(Alert.AlertType.NONE);

        tableViewProductos.setItems(productoDAO.getLista());

        columnProductoCodigo.setCellValueFactory(cellData
                -> cellData.getValue().codigoProperty());

        columnProductoNombre.setCellValueFactory(cellData
                -> cellData.getValue().nombreProperty());

        columnProductoPrecio.setCellValueFactory(cellData
                -> cellData.getValue().precioProperty());

    }

}

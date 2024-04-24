package controller;

import data.ClienteDAO;
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
import model.Cliente;

public class ClienteController implements Initializable{

    private Cliente cliente;
    private ClienteDAO clienteDAO = new ClienteDAO();
    private Alert alert = new Alert(Alert.AlertType.NONE);

    @FXML
    private Button buttonActualizar;

    @FXML
    private Button buttonBuscar;

    @FXML
    private Button buttonEliminar;

    @FXML
    private Button buttonGuardar;

    @FXML
    private Button buttonNuevo;

    @FXML
    private TableColumn<Cliente, String> columnApellidoCliente;

    @FXML
    private TableColumn<Cliente, String> columnIdentificacionCliente;

    @FXML
    private TableColumn<Cliente, String> columnNombreCliente;

    @FXML
    private TableView<Cliente> tableViewClientes;

    @FXML
    private TextField textApellidoCliente;

    @FXML
    private TextField textIdentificacionCliente;

    @FXML
    private TextField textNombreCliente;

    @FXML
    void setOnActionButtonActualizar(ActionEvent event) {
        String apellido;
        apellido = textApellidoCliente.toString();
        cliente.setApellido(apellido);
        String nombre;
        nombre = textNombreCliente.getText();
        cliente.setNombre(nombre);
    }

    @FXML
    void setOnActionButtonBuscar(ActionEvent event) {
        clienteDAO.buscar(cliente);
    }

    @FXML
    void setOnActionButtonEliminar(ActionEvent event) {
        clienteDAO.eliminar(cliente);
    }

    @FXML
    void setOnActionButtonGuardar(ActionEvent event) {

        try {
            cliente = new Cliente(textIdentificacionCliente.getText(),
                    textNombreCliente.getText(),
                    textApellidoCliente.getText());
            textIdentificacionCliente.setText(cliente.getIdentificacion());
            clienteDAO.agregar(cliente);
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setContentText("Cliente Agregado");
            alert.show();
        } catch (Exception e) {
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    @FXML
    void setOnActionButtonNuevo(ActionEvent event) {
        textIdentificacionCliente.clear();
        textNombreCliente.clear();
        textApellidoCliente.clear();
    }

    private void mostrar(Cliente cliente) {
        if (cliente == null) {
            return;
        }
        textIdentificacionCliente.setText(cliente.getIdentificacion() + "");
        textNombreCliente.setText(cliente.getNombre() + "");
        textApellidoCliente.setText(cliente.getApellido() + "");

    }
    
    
    @FXML
    void setOnMouseClicketTableViewClientes(MouseEvent event) {

        try {
            cliente = tableViewClientes.getSelectionModel().getSelectedItem();
            mostrar(cliente); 
        } catch (Exception e) {

        }
    }

    
    
    public void initialize(URL url, ResourceBundle rb) {
        clienteDAO = new ClienteDAO();
        alert = new Alert(Alert.AlertType.NONE);

        tableViewClientes.setItems(clienteDAO.getLista());

        columnIdentificacionCliente.setCellValueFactory(cellData
                -> cellData.getValue().identificacionProperty());

        columnNombreCliente.setCellValueFactory(cellData
                -> cellData.getValue().nombreProperty());

        columnApellidoCliente.setCellValueFactory(cellData
                -> cellData.getValue().apellidoProperty());

    }
    
    
    
}

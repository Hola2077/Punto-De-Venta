/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import data.DescuentoDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.DescuentoUnoGratis;

/**
 *
 * @author sistemas
 */
public class DescuentoController implements Initializable {

    private DescuentoUnoGratis descuento;
    private DescuentoDAO descuentoDAO;
    private Alert alert;

    @FXML
    private Button buttonActualizar;

    @FXML
    private Button buttonAgregar;

    @FXML
    private Button buttonBuscar;

    @FXML
    private Button buttonEliminar;

    @FXML
    private ChoiceBox<String> choiseBoxTipoDescuento;

    @FXML
    private TextField textCantidadDescuento;

    @FXML
    private TextField textCodigoDescuento;

    @FXML
    private TextField textDescripcionDescuento;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        alert = new Alert(Alert.AlertType.NONE);
        descuentoDAO = new DescuentoDAO();

    }

    @FXML
    void setOnActionButtonActualizar(ActionEvent event) {
        
    }

    @FXML
    void setOnActionButtonAgregar(ActionEvent event) {

    }

    @FXML
    void setOnActionButtonBuscar(ActionEvent event) {

    }

    @FXML
    void setOnActionButtonEliminar(ActionEvent event) {

    }

    @FXML
    void setOnMouseClickedTableViewDescuento(MouseEvent event) {

    }

}

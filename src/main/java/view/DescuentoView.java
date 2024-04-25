/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class DescuentoView extends Application{
    public void main() throws IOException { 
        FXMLLoader descuentoLoader = new FXMLLoader(getClass().getResource("/pos/DescuentoFXML.fxml"));
        Parent inventario = (Parent) descuentoLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(inventario)); 
        stage.setTitle("Descuento");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

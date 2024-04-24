package view;

import java.io.IOException;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ClienteView extends Application {

    public void mainn() throws IOException {
        
        FXMLLoader clientesLoader = new FXMLLoader(getClass().getResource("/pos/ClienteFXML.fxml"));
        Parent clientes = (Parent) clientesLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(clientes)); 
        stage.setTitle("Clientes");
        stage.show();
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

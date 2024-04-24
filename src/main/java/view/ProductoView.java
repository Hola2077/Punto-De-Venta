package view;

import java.io.IOException;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ProductoView extends Application {

    
    public void main() throws IOException { 
        FXMLLoader inventarioLoader = new FXMLLoader(getClass().getResource("/pos/ProductoFXML.fxml"));
        Parent inventario = (Parent) inventarioLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(inventario)); 
        stage.setTitle("Inventario");
        stage.show();
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage Stage) throws Exception {
//        Parent parent = FXMLLoader.load(getClass().
//                getResource("/pos/ProductoFXML.fxml"));
//
//        Scene scene = new Scene(parent);
//        Stage.setScene(scene);
//        Stage.show();
//
//    }

}

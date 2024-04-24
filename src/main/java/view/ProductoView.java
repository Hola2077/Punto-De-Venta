package view;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ProductoView extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage Stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().
                getResource("/pos/ProductoFXML.fxml"));

        Scene scene = new Scene(parent);
        Stage.setScene(scene);
        Stage.show();

    }

}

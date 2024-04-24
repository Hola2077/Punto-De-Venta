package data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Producto;

public class ProductoDAO extends SuperDAO<Producto> { 
    private static ObservableList<Producto> productos 
            =FXCollections.observableArrayList();
    
    public ProductoDAO () {
        setLista(productos);
    }
}

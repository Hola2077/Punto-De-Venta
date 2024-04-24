
package data;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Cliente;

public class ClienteDAO extends SuperDAO<Cliente>{
    
    private static ObservableList <Cliente> clientes
            = FXCollections.observableArrayList();
    
    public ClienteDAO() {
        setLista(clientes);
    }
    
}

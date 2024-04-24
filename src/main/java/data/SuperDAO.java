package data;

import java.util.Objects;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SuperDAO<T> {

    private ObservableList<T> Lista
            = FXCollections.observableArrayList();

    public void setLista(ObservableList<T> Lista) {
        Objects.requireNonNull(Lista, "Lista no puede ser nula");
    }

    public ObservableList<T> getLista() {
        return Lista;
    }

    public void agregar(T item) {
        Objects.requireNonNull(item, getClass().getSimpleName() + "no puede "
                + "ser nulo");
        Lista.add(item);
    }

    public void eliminar(T item) {
        Objects.requireNonNull(item, getClass().getSimpleName() + "no puede "
                + "ser nulo");
        Lista.remove(item);
    }

    public void actualizar(T item) {
        Objects.requireNonNull(item, getClass().getSimpleName() + "no puede "
                + "ser nulo");
        int indice;
        indice = Lista.indexOf(item);
        if (indice != -1) {
            Lista.set(indice, item);
        }

    }

    public T buscar(T item) {
        Objects.requireNonNull(item, getClass().getSimpleName() + "no puede "
                + "ser nulo");
        int indice;
        indice = Lista.indexOf(item);
        if (indice != -1) {
            return Lista.get(indice);
        }
        return null;
    }

    public T buscar(int codigo) {
        if (codigo < 0) {
            throw new IllegalArgumentException("Codigo no puede ser negativo");
        }
        for (T item : Lista) {
            if (item.equals(codigo)) {
                return item;
            }
        }
        return null;
    }
}

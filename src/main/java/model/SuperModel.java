package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author MULTIMEDIA
 */
public class SuperModel {
    private final IntegerProperty codigo = new SimpleIntegerProperty();
    
    public IntegerProperty codigoProperty() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        if (codigo < 0) {
            throw new IllegalArgumentException("Código no puede ser menor.");
        }
        this.codigo.set(codigo);
    }
    
    public int getCodigo() {
        return codigo.get();
    }
}

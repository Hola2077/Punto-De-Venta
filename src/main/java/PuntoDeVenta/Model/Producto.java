package PuntoDeVenta.Model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Producto {

    private static int consecutivo;
    private IntegerProperty codigo = new SimpleIntegerProperty();
    private StringProperty nombre = new SimpleStringProperty();
    private DoubleProperty precio = new SimpleDoubleProperty();
    private IntegerProperty stock = new SimpleIntegerProperty();

 
    public Producto(){}

    public Producto(String nombre, int precio, int stock){
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
    }

    public int getCodigo() {
        return codigo.get();
    }

    public void setCodigo(int codigo) {
        if (codigo < 0) {
            throw new IllegalArgumentException("codigo no puede ser negativo");

        }
        this.codigo.set(codigo);
    }

    public IntegerProperty codigoProperty() {
        return codigo;
    }

    public String getNombre() {
        return nombre.get();
    }
    
    public IntegerProperty stockProperty() {
        return stock;
    }
    public int getStock() {
        return stock.get();

    }

    public void setStock(int stock) {
        if (stock < 1) {
            throw new IllegalArgumentException("Stock debe tener un valor positivo");

        }
        this.stock.set(stock);
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("Nombre no puede ser nulo");
        }
        this.nombre.set(nombre);
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public double getPrecio() {
        return precio.get();
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("Precio no puede ser negativo");
        }
        this.precio.set(precio);
    }

    public DoubleProperty precioProperty() {
        return precio;
    }
}

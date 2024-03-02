
package PuntoDeVenta.Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

public class ProductoVenta {
    private ObjectProperty<Producto> producto = new SimpleObjectProperty();
    private IntegerProperty cantidad = new SimpleIntegerProperty();
    

    public Producto getProducto() {
        return producto.get();
    }

    public int getCantidad() {
        return cantidad.get();
    }
    
    
    public void setProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("Producto no puede ser nulo");

        }
        this.producto.set(producto);
    }
    
    public void setCodigo(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("codigo no puede ser negativo");

        }
        this.cantidad.set(cantidad);
    }
    
    public ObjectProperty productoProperty(){
        return producto;
    }
    
    public IntegerProperty cantidadProperty(){
        return cantidad;
    }
    
    public double subtotalizar(){
        return getProducto().getPrecio()*getCantidad();
    }
}

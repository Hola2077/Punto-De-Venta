package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;


public class ProductoVenta {

    private ObjectProperty<Producto> producto = new SimpleObjectProperty();
    private IntegerProperty cantidad = new SimpleIntegerProperty();

    //Constructor vacio
    public ProductoVenta() {

    }

    public ProductoVenta(Producto producto, int cantidad) {
        setProducto(producto);
        setCantidad(cantidad);

    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void setProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("Prodcuto no puede ser nulo");
        }
        this.producto.set(producto);
    }//Set producto

    public Producto getProducto() {
        return producto.get();
    }//getProducto

    public ObjectProperty<Producto> productoProperty() {
        return producto;
    }//producto Property

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void setCantidad(Integer cantidad) {
        //Validamos que la cantidad sea mayor que cero
        if (cantidad < 1) {
            throw new IllegalArgumentException("Cantidad no puede ser menor a"
                    + " uno");
        }
        this.cantidad.set(cantidad);
    }//setCantidad

    public Integer getCantidad() {
        return cantidad.get();
    }//getCantidad

    public IntegerProperty cantidadProperty() {
        return cantidad;
    }//cantidad Property

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public double subtotalizar() {
        return getProducto().getPrecio() * getCantidad();
    }//Subtotalizar

    public double subtotalizarEnvio() {
        if (getProducto().getTipoEnvio().equals("Unidad")) {
            return getProducto().getValorEnvio() * getCantidad();
        } else if (getProducto().getTipoEnvio().equals("Total")) {
            return getProducto().getValorEnvio();
        } else {
            return 0;
        }
    }

    public String toString() {
        return getProducto() + "\t" + getCantidad() + "\t" + subtotalizar()
                + "\t" + subtotalizarEnvio();
    }
}

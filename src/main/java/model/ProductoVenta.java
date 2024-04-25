/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 *
 * @author sistemas
 */
public final class ProductoVenta {

    private final IntegerProperty cantidad = new SimpleIntegerProperty();
    private final ObjectProperty<Producto> producto = new SimpleObjectProperty<>();

    public ProductoVenta() {
    }

    public ProductoVenta(int cantidad, Producto producto) {
        setCantidad(cantidad);
        setProducto(producto);
    }

    public int getCantidad() {
        return cantidad.get();
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad no puede ser menor que cero");
        }
        this.cantidad.set(cantidad);
    }

    public IntegerProperty cantidadProperty() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto.get();
    }

    public void setProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("Producto no puede ser null.");
        }
        this.producto.set(producto);
    }

    public ObjectProperty<Producto> productoProperty() {
        return producto;
    }

    public double subTotalizar() {
        return getProducto().getPrecio() * getCantidad();
    }
    
    public int subtotalizarPunto() {
        return getCantidad() * getProducto().getPuntos();
    }

    @Override
    public String toString() {
        return getProducto() + "\t" + getCantidad() + ": " + subTotalizar();
    }
}

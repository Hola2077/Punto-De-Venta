/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public final class Producto extends SuperModel {

    private static int consecutivo;
    private final StringProperty nombre = new SimpleStringProperty();
    private final DoubleProperty precio = new SimpleDoubleProperty();
    private final IntegerProperty cantidad = new SimpleIntegerProperty();
    private final IntegerProperty limite = new SimpleIntegerProperty();
    private final IntegerProperty puntos = new SimpleIntegerProperty();
    private final StringProperty tipoVenta = new SimpleStringProperty();
    
    private final ObjectProperty<DescuentoUnoGratis> descuento = new SimpleObjectProperty<>();

    public Producto() {
    }

    public Producto(String nombreProducto, double precio) {
        this(++consecutivo, nombreProducto, precio, 0, 0, 0);
    }

    public Producto(int codigo, String nombreProducto, double precio,
            int cantidad, int limite, int puntos) {
        setCodigo(codigo);
        setNombre(nombreProducto);
        setPrecio(precio);
        setCantidad(cantidad);
        setLimite(limite);
        setPuntos(puntos);
    }

    public Producto(int codigo, String nombreProducto, double precio,
            int cantidad, int limite, int puntos, String tipoVenta) {
        setCodigo(codigo);
        setNombre(nombreProducto);
        setPrecio(precio);
        setCantidad(cantidad);
        setLimite(limite);
        setPuntos(puntos);
        setTipoVenta(tipoVenta);
    }   
    
    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("Nombre no puede ser nulo");
        }
        this.nombre.set(nombre);
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setPrecio(double precio) {
        if (precio < 0.0) {
            throw new IllegalArgumentException("Precio no puede ser menor que 0.0");
        }
        this.precio.set(precio);
    }

    public double getPrecio() {
        return precio.get();
    }

    public DoubleProperty precioProperty() {
        return precio;
    }

    public int getCantidad() {
        return cantidad.get();
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Código no puede ser menor.");
        }
        this.cantidad.set(cantidad);
    }

    public IntegerProperty codigoCantidad() {
        return cantidad;
    }

    public int getLimite() {
        return limite.get();
    }

    public void setLimite(int limite) {
        if (limite < 0) {
            throw new IllegalArgumentException("Código no puede ser menor.");
        }
        this.limite.set(limite);
    }

    public IntegerProperty limiteProperty() {
        return limite;
    }

    public void setPuntos(int puntos) {
        if (puntos < 0) {
            throw new IllegalArgumentException("Los puntos no pueden ser negativos.");
        }
        this.puntos.set(puntos);
    }

    public int getPuntos() {
        return puntos.get();
    }

    public IntegerProperty puntosProperty() {
        return puntos;
    }

    public void setTipoVenta(String tipoVenta) {
        Objects.requireNonNull(tipoVenta, "Tipo de venta no puede "
                + "ser nulo.");
        this.tipoVenta.set(tipoVenta);
    }

    public String getTipoVenta() {
        return this.tipoVenta.get();
    }

    public StringProperty tipoVentaProperty() {
        return tipoVenta;
    }
    
    public DescuentoUnoGratis getDescuento() {
        return descuento.get();
    }
    
    public ObjectProperty<DescuentoUnoGratis> descuentoProperty() {
        return descuento;
    }
    
    public void setDescuento(DescuentoUnoGratis descuento) {
        Objects.requireNonNull(descuento);
        this.descuento.set(descuento);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(getCodigo());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(getCodigo(), other.getCodigo());
    }

    @Override
    public String toString() {
        return getCodigo() + "-" + getNombre() + "-" + getPrecio()
                + " TIPO_VENTA: " + getTipoVenta();
    }
}

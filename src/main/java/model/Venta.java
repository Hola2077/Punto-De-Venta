/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Objects;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author sistemas
 */
public final class Venta extends SuperModel {

    private static int consecutivo;
    private final ObjectProperty<LocalDate> fecha = new SimpleObjectProperty<>();
    private final ObjectProperty<Cliente> cliente = new SimpleObjectProperty<>();
    private final ObservableList<ProductoVenta> listaProducto =
            FXCollections.observableArrayList();
    private final ObjectProperty<LocalDate> fechaEntrega = new SimpleObjectProperty<>();
    
    public Venta() {
    }
    
    public Venta(Cliente cliente) {
        this(++consecutivo, LocalDate.now(), cliente);
    }
    
    public Venta(int codigo, LocalDate Fecha, Cliente cliente) {
        setCodigo(codigo);
        setFecha(Fecha);
        setCliente(cliente);
    }

    public LocalDate getFecha() {
        return fecha.get();
    }

    public void setFecha(LocalDate fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("Fecha no puede ser nula.");
        }
        this.fecha.set(fecha);
    }

    public ObjectProperty<LocalDate> fechaProperty() {
        return fecha;
    }
    
    public Cliente getCliente() {
        return cliente.get();
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente no puede ser nula.");
        }
        this.cliente.set(cliente);
    }

    public ObjectProperty<Cliente> clienteProperty() {
        return cliente;
    }
    
    private void setFechaEntrega(LocalDate fechaEntrega) {
        Objects.requireNonNull(fechaEntrega, "Fecha entrega no puede "
                + "ser nula");
        this.fechaEntrega.set(fechaEntrega);
    }
    
    public LocalDate getFechaEntrega() {
        return this.fechaEntrega.get();
    }
    
    public ObjectProperty<LocalDate> fechaEntregaProperty() {
        return fechaEntrega;
    }
    
    public ObservableList<ProductoVenta> getListaProducto() {
        return listaProducto;
    }
    
    public void agregarProducto(ProductoVenta productoVenta) {
        if(productoVenta == null) {
            throw new NullPointerException("Producto venta no puede ser nulo.");
        }
        Producto producto = productoVenta.getProducto();
        if((productoVenta.getCantidad() <= 0) 
         && (productoVenta.getCantidad() > producto.getLimite())) {
           throw new IllegalArgumentException("Cantidad no validad o superada.");
        }
        
//        if(producto.getTipoVenta().equals("TIENDA")) {
            getListaProducto().add(productoVenta);
            // Si es tipo DOMICILIO, deberia lnzar un aviso mas no una excepcion
//        }
        // decrementar la cantidad del producto
        // producto.setCantidad(-producto.getCantidad());
        producto.setCantidad(producto.getCantidad() - productoVenta.getCantidad());
    }
    
    public void agregarProducto(Producto producto, int cantidad) {
        ProductoVenta productoVenta = new ProductoVenta(cantidad, producto);
        agregarProducto(productoVenta);
    }
    
    public void confirmarEnvio(LocalDate date) {
        setFechaEntrega(date);
    }
    
    public void acomularPuntos() {
        getCliente().setPuntos((int) totalizarPuntos());
    }
    
    public double totalizar() {
        return listaProducto.stream()
                .mapToDouble(t -> t.subTotalizar())
                .sum();
    }
    
    public double totalizarPuntos() {
        return listaProducto.stream()
                .mapToDouble(t -> t.subtotalizarPunto())
                .sum();
    }

    @Override
    public String toString() {
        String venta = getCodigo() + " - " + getFecha() + "-\t" + getCliente() + "\n";
        for(ProductoVenta productoVenta : listaProducto) {
            venta += productoVenta + "\n";
        }
        venta += "\t\t total:" + totalizar() 
                + " - fecha envio: " + getFechaEntrega();
        return venta;
    }
    
    
}

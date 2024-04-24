package model;

import java.time.LocalDate;
import java.util.Set;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Venta {

    private static int consecutivoVenta;
    private IntegerProperty codigo = new SimpleIntegerProperty();
    private ObjectProperty<LocalDate> fecha = new SimpleObjectProperty();
    private ObjectProperty<Cliente> cliente = new SimpleObjectProperty();
    private ObservableList<ProductoVenta> listaProducto
            = FXCollections.observableArrayList();

    //Constructor vacio
    public Venta() {

    }

    public Venta(int codigo, LocalDate fecha, Cliente cliente) {
        setCodigo(codigo);
        setFecha(fecha);
        setCliente(cliente);
    }

    public Venta(Cliente cliente) {
        this(++consecutivoVenta, LocalDate.now(), cliente);
    }

    public void setCodigo(int codigo) {
        //Validamos que el codigo sea mayor que cero
        if (codigo < 0) {
            throw new IllegalArgumentException("El codigo no puede ser negativo");
        }
        this.codigo.set(codigo);
    }//set Codigo Venta

    public Integer getCodigo() {
        return codigo.get();
    }//get Codigo Venta

    public IntegerProperty codigoProperty() {
        return codigo;
    }//Codigo de venta property
//++++++++++++++++++++++++++++++++++++++++

    public void setFecha(LocalDate fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        this.fecha.set(fecha);
    }//set echa

    public LocalDate getFecha() {
        return fecha.get();
    }

    public ObjectProperty<LocalDate> fechaProperty() {
        return fecha;
    }//Fecha property
//+++++++++++++++++++++++++++++++++++++++++++

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente no puede ser nulo");
        }
        this.cliente.set(cliente);
    }//set cliente

    public Cliente getCliente() {
        return cliente.get();
    }//get cliente

    public ObjectProperty<Cliente> clienteProperty() {
        return cliente;
    }//cliente property
//++++++++++++++++++++++++++++++++++++++++

    public ObservableList<ProductoVenta> getListaProducto() {
        return listaProducto;
    }

    public double totalizar() {
        double total;
        total = 0;
        // For each: recorre la lista de productos y se almacena en producto ...
        //venta. Le sumamos a total cada elemento
        for (ProductoVenta productoVenta : listaProducto) {
            total += productoVenta.subtotalizar();
        }

        return total;
    }

    public double totalizarConEnvio() {
        double totalEnvio;
        totalEnvio = 0;
        // For each: recorre la lista de productos y se almacena en producto ...
        //Total Envio venta. Le sumamos a total cada envio por elemento
        for (ProductoVenta productoVenta : listaProducto) {
            totalEnvio += productoVenta.subtotalizarEnvio();
        }
        return totalEnvio;
    }

    public String toString() {
        String venta;

        venta = getCodigo() + "\t" + getFecha() + "\t" + getCliente() + "\n";
        for (ProductoVenta productoVenta : listaProducto) {
            venta += productoVenta + "\n";
        }
        venta += "\t" + "\t" + "\t" + "\t" + totalizar() + " " 
                + totalizarConEnvio() + "\n";
        venta += (totalizar() + totalizarConEnvio());
        return venta;

    }

    public void agregarProducto(ProductoVenta productoVenta) {
        if (productoVenta == null) {
            throw new IllegalArgumentException("Producto no puede ser nulo");
        }
        listaProducto.add(productoVenta);
    }

    public void agregarProducto(Producto producto, int cantidad) {
        ProductoVenta productoVenta;
        productoVenta = new ProductoVenta(producto, cantidad);
        agregarProducto(productoVenta);
    }
}

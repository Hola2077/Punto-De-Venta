package PuntoDeVenta.Model;
import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Venta {

    private static int consecutivo;
    private IntegerProperty codigo = new SimpleIntegerProperty();
    private ObjectProperty<LocalDate> fecha = new SimpleObjectProperty();
    private ObjectProperty<Cliente> cliente = new SimpleObjectProperty();
    private ObservableList<ProductoVenta> listaProductos
            = FXCollections.observableArrayList();

    public Venta(){}

    public Venta(Cliente cliente){
        setCliente(cliente);
    }

    public void agregarProducto(ProductoVenta productoVenta,Producto producto) {
        if (productoVenta.getCantidad() < producto.getStock()) {
            throw new IllegalArgumentException("No hay stock disponible");
        }
        producto.setStock(producto.getStock() - productoVenta.getCantidad());
    }


    public int getCodigo() {
        return codigo.get();
    }

    public void setCodigo(int codigo) {
        if (codigo < 0) {
            throw new IllegalArgumentException("Codigo no puede ser negativo");
        }
        this.codigo.set(codigo);
    }

    public IntegerProperty codigoProperty() {
        return codigo;

    }

    public void setFecha(LocalDate fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("Fecha no puede ser nula");

        }
        this.fecha.set(fecha);
    }

    public LocalDate getFecha() {

        setFecha(LocalDate.now());
        return fecha.get();

    }

    public ObjectProperty<LocalDate> fechaProperty() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente.get();
    }

    public void setCliente(Cliente Cliente) {
        if (Cliente == null) {
            throw new IllegalArgumentException("Cliente no puede ser nulo");
        }
        this.cliente.set(Cliente);
    }

    public ObjectProperty<Cliente> clienteProperty() {
        return cliente;

    }

    public ObservableList<ProductoVenta> getListaProductos() {
        return listaProductos;
    }

    public double totalizar() {
        double total;
        total = 0;
        for (ProductoVenta productoVenta : listaProductos) {
            total += productoVenta.subtotalizar();
        }
        return total;
    }

    public String toString(){
        String venta;
        venta = getCodigo() + " " + getFecha() + " " + getCliente() + "\n";
        for(ProductoVenta productoVenta: listaProductos){
            venta += productoVenta + "\n";
        }
        venta += "\t\t\t\t" + totalizar();
        return venta;
    }
}

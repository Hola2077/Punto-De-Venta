package model;

import java.util.HashSet;
import java.util.Set;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Producto {

    private static int consecutivo;
    private IntegerProperty codigo = new SimpleIntegerProperty();
    private StringProperty nombreProducto = new SimpleStringProperty();
    private DoubleProperty precio = new SimpleDoubleProperty();
    //Parcial
    private DoubleProperty valorEnvio = new SimpleDoubleProperty();
    private StringProperty tipoEnvio = new SimpleStringProperty();

    public static int getConsecutivo() {
        return consecutivo;
    }

    //Constructor por default
    public Producto(String nombre, double precio) {
        setCodigo(consecutivo++);
        setNombreProducto(nombre);
        setPrecio(precio);

    }

    //Constructor con todos los parametros
    public Producto(int codigo, String nombreProducto, double precio,
            double valorEnvio, String tipoEnvio) {
        setCodigo(codigo);
        setNombreProducto(nombreProducto);
        setPrecio(precio);
        setValorEnvio(valorEnvio);
        setTipoEnvio(tipoEnvio);
    }

    public Producto(String nombreProducto, double precio, double valorEnvio,
            String tipoEnvio) {
        this(++consecutivo, nombreProducto, precio, valorEnvio, tipoEnvio);
    }

    public void setCodigo(Integer codigo) {
        //Validamos que el codigo sea mayor que cero
        if (codigo < 0) {
            throw new IllegalArgumentException("El codigo no puede ser negativo");
        }
        this.codigo.set(codigo);
    }

    public Integer getCodigo() {
        return codigo.get();
    }

    public IntegerProperty codigoProperty() {
        return codigo;
    }
    //++++++++++++++++++++++++++++++++++++

    public void setValorEnvio(double valorEnvio) {
        if (valorEnvio < 0.0) {
            throw new IllegalArgumentException("Envio no puede ser negativo");
        }
        this.valorEnvio.set(valorEnvio);
    }

    public Double getValorEnvio() {
        return valorEnvio.get();
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio.set(tipoEnvio);
    }

    public String getTipoEnvio() {
        return tipoEnvio.get();
    }
//+++++++++++++++++++++++++++++++++++++++++++

    public void setNombreProducto(String nombreProducto) {
        //Validamos que el nombre sea adecuado
        if (nombreProducto == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        this.nombreProducto.set(nombreProducto);
    }

    public String getNombreProducto() {
        return nombreProducto.get();
    }

    public StringProperty nombreProductoProperty() {
        return nombreProducto;
    }

// ++++++++++++++++++++++++++++++++++++++++++
    public void setPrecio(Double precio) {
        //Validamos que el precio sea mayor que 0.0
        if (precio <= 0.0) {
            throw new IllegalArgumentException("El precio no puede ser "
                    + "negativo");
        }
        this.precio.set(precio);
    }

    public Double getPrecio() {
        return precio.get();
    }

    public DoubleProperty precioProperty() {
        return precio;
    }

    public String toString() {
        return getCodigo() + "-" + getNombreProducto() + " " + getPrecio()
                + " " + getValorEnvio();
    }

}

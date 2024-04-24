
package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Cliente {

    // Simepre que sea string, int, float or double coloco esa variable property
    // Si es otro tipo de variable es ObjectProperty
    private StringProperty identificacion = new SimpleStringProperty();
    private StringProperty nombre = new SimpleStringProperty();
    private StringProperty apellido = new SimpleStringProperty();

    public Cliente() {
        //Es un constructor cuando:Nombre igual a la clase y no tiene void 
        //Constructor por default no tiene argumentos, pero usaremos lo sigte
        setIdentificacion("SIN DEFINIR");
        setNombre("SIN DEFINIR");
        setApellido("SIN DEFINIR");
    }
    //Sobrecarga un metodo con el mismo nombre pero diferentes
    //firma de un metodo esta compuesto por nombre,tipo y orden de parametros

    public Cliente(String identificacion, String nombre, String apellido) {
        setIdentificacion(identificacion);
        setNombre(nombre);
        setApellido(apellido);
    }

    public void setIdentificacion(String identificacion) {
        //Validemos si la identificacion es adecuada
        if (identificacion == null) {
            throw new IllegalArgumentException("La identificacion no puede ser"
                    + "nula");

        }//Para identificar una propiedad en vez de un parametro utilizamos this
        //Cuando por ejemplo tiene el mismo nombre (Identificacion)
        this.identificacion.set(identificacion);
    }//setIdentificacion

    public String getIdentificacion() {
        return identificacion.get();
        //Puedo prescindir del this en este caso porque no existe confusion
    }//getIdentificacion

    public StringProperty identificacionProperty() {
        return identificacion;
    }//identificacion Property

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void setNombre(String nombre) {
        //Validamos que el nombre sea adecuado
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        this.nombre.set(nombre);
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public void setApellido(String apellido) {
        //Validamos que el nombre sea adecuado
        if (apellido == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        this.apellido.set(apellido);
    }

    public String getApellido() {
        return apellido.get();
    }

    public StringProperty apellidoProperty() {
        return apellido;
    }

    //Para concatenar todo cuando llame a pantalla un cliente
    //Los constructures siempre van debajo de las propiedades por convencion
    public String toString() {
        return getIdentificacion() + "-" + getNombre() + "-" + getApellido();
    }

}

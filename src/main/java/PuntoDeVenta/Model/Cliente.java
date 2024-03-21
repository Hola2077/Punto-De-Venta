
package PuntoDeVenta.Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cliente {
    private StringProperty identificacion = new SimpleStringProperty();
    private StringProperty nombre = new SimpleStringProperty();
    private StringProperty apellido = new SimpleStringProperty();


    public Cliente(){}

    public Cliente(String identificasion, String nombre, String apellido){
        setIdentificacion(identificasion);
        setNombre(nombre);
        setApellido(apellido);
    }

    public void setIdentificacion(String identificacion) {
        if(identificacion == null){
          throw new IllegalArgumentException("Nombre no puede ser Nulo");  
        }
        this.identificacion.set(identificacion);
    }




    public void setNombre(String nombre) {
        if(nombre == null){
          throw new IllegalArgumentException("Nombre no puede ser Nulo");  
        }
        this.nombre.set(nombre);
    }

    public void setApellido(String apellido) {
        if(apellido == null){
          throw new IllegalArgumentException("Apellido no puede ser Nulo");  
        }
        this.apellido.set(apellido);
    }
    
    public String toString(){
        return getIdentificacion()+" "+getNombre()+" "+getApellido();
    }
    
    public String getIdentificacion() {
        return identificacion.get();
    }

    public String getNombre() {
        return nombre.get();
    }

    public String getApellido() {
        return apellido.get();
    }
    
    public StringProperty identificacionProperty(){
        return identificacion;
    }
    
    public StringProperty nombreProperty(){
        return nombre;
    }
    
    public StringProperty apellidoProperty(){
        return apellido;
    }
}

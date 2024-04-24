/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;


public class Descuento {

    private IntegerProperty codigo = new SimpleIntegerProperty();
    private DoubleProperty descuento = new SimpleDoubleProperty();
    private ObjectProperty<LocalDate> fechaHoy = new SimpleObjectProperty();
  
    //Constructor vacío
    public Descuento() {
    }

    //COnstructor 2
    public Descuento(double descuento, LocalDate fechaHoy) {
        setDescuento(descuento);
        setFechaHoy(fechaHoy);
    }

    //Set y get código
    public void setCodigo(int codigo) {
        if (codigo < 0) {
            throw new IllegalArgumentException("El codigo no puede ser negativo");
        }
        this.codigo.set(codigo);
    }

    public Integer getCodigo() {
        return codigo.get();
    }

    //Set y get fechas
    public void setFechaHoy(LocalDate fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        this.fechaHoy.set(fecha);
    }//set fecha

    public LocalDate getFecha() {
        return fechaHoy.get();
    }

    public ObjectProperty<LocalDate> fechaProperty() {
        return fechaHoy;
    }//Fecha property
    
    public DoubleProperty getCalcularDescuento(ProductoVenta productoventa){
        int diferencia;
        
        
        return descuento;
    }

    //set y get descuento

    private void setDescuento(double descuento) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}

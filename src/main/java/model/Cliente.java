/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author sistemas
 */
public final class Cliente {

    private final StringProperty identificacion = new SimpleStringProperty();
    private final StringProperty nombre = new SimpleStringProperty();
    private final StringProperty apellido = new SimpleStringProperty();
    private final IntegerProperty puntos = new SimpleIntegerProperty();
    private final StringProperty direccion = new SimpleStringProperty();
    private final StringProperty genero = new SimpleStringProperty();

    public Cliente(String identificacion, String nombre, String apellido) {
        setIdentificacion(identificacion);
        setNombre(nombre);
        setApellido(apellido);
    }

    public Cliente(String identificacion, String nombre, String apellido,
            String genero) {
        setIdentificacion(identificacion);
        setNombre(nombre);
        setApellido(apellido);
        setGenero(genero);
    }

    public void setIdentificacion(String identificacion) {
        if (identificacion == null) {
            throw new IllegalArgumentException("Identificacion no puede ser"
                    + " nula");
        }
        this.identificacion.set(identificacion);
    }

    public String getIdentificacion() {
        return identificacion.get();
    }

    public StringProperty identificacionProperty() {
        return identificacion;
    }

    public void setGenero(String genero) {
        if (genero == null) {
            throw new IllegalArgumentException("Genero no puede ser"
                    + " nula");
        }
        this.genero.set(genero);
    }

    public String getGenero() {
        return genero.get();
    }

    public StringProperty generoProperty() {
        return genero;
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

    public void setApellido(String apellido) {
        if (apellido == null) {
            throw new IllegalArgumentException("Apellido no puede ser nulo");
        }
        this.apellido.set(apellido);
    }

    public String getApellido() {
        return apellido.get();
    }

    public StringProperty apellidoProperty() {
        return apellido;
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

    public void setDireccion(String direccion) {
        Objects.requireNonNull(direccion,
                "Direccion no puede ser nula.");
        this.direccion.set(direccion);
    }

    public String getDireccion() {
        return this.direccion.get();
    }

    public StringProperty direccionProperty() {
        return direccion;
    }

    @Override
    public String toString() {
        return getIdentificacion() + " - " + getNombre() + " " + getApellido()
                + " - " + getDireccion() + " - puntos: " + getPuntos();
    }

}

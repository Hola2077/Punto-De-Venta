/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Venta;

/**
 *
 * @author sistemas
 */
public class VentaDAO extends SuperDAO<Venta> {
    
    private static final ObservableList<Venta> ventas = 
            FXCollections.observableArrayList();
    
    public VentaDAO() {
        setLista(ventas);
    }
    
    
    public Venta comparar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public boolean comparar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

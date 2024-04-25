/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.DescuentoUnoGratis;


public class DescuentoDAO extends SuperDAO<DescuentoUnoGratis> {

    private static final ObservableList<DescuentoUnoGratis> descuentos 
            = FXCollections.observableArrayList();
    
    public DescuentoDAO() {
        setLista(descuentos);
    }
        
    
    public DescuentoUnoGratis comparar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public boolean comparar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

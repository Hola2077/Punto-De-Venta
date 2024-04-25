package view;

import java.time.LocalDate;
import model.Cliente;
import model.Producto;
import model.Venta;

public class DemoVenta {

    public static void main(String[] args) {
        Cliente clienteUno = new Cliente("A-001", "Nicolay", 
                "De Caro Paternina", "Cra. 59 #58-135");
        
        Producto productoUno = new Producto(100, "Coca-Cola", 5000,
                100, 10, 10, "TIENDA");
        // CANTIDAD 100 - LIMITE 10
        
        Producto productoDos = new Producto(200, "Empanada", 
                1000, 200, 10, 5, "TIENDA");
        // CANTIDAD 200 - LIMITE 10
        
        Producto productoTres = new Producto(300, "Pechuga", 
                15000, 40, 2, 20, "DOMICILIO");
        // CANTIDAD 40 - LIMITE 2
        
        Producto productoCuatro = new Producto(400, "Carne-Res", 
                30000, 20, 1, 50, "DOMICILIO");
        // CANTIDAD 20 - LIMITE 1
        
        Venta ventaUno = new Venta(clienteUno);

        ventaUno.agregarProducto(productoUno, 5);
        ventaUno.agregarProducto(productoDos, 5);
        ventaUno.agregarProducto(productoTres, 1);
        ventaUno.agregarProducto(productoCuatro, 1);
        
        ventaUno.acomularPuntos();
        ventaUno.confirmarEnvio(LocalDate.now());
        System.out.println(ventaUno);
    }
}

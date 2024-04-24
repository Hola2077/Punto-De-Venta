package view;

import model.Cliente;
import model.Producto;
import model.ProductoVenta;
import model.Venta;

public class DemoVenta {

    public static void main(String[] args) {
        //Declaracion
        Cliente cliente1;
        Cliente cliente2;
        Producto producto1;
        Producto producto2;
        Producto producto3;
        ProductoVenta productoVenta1;
        Venta venta1;
        
        //Instanciacion
        cliente1 = new Cliente("1111", "ClienteUno", "ApellidoUno");
        cliente2 = new Cliente();
        cliente2.setIdentificacion("202456");
        producto1 = new Producto(5, "Gaseosas", 1500, 500, "Unidad");
        producto2=new Producto("Empanada", 2000, 40, "Total");
        producto3= new Producto("Lapiz",5000, 0, "");
        
        venta1 = new Venta(cliente1);
        
        productoVenta1 = new ProductoVenta(producto1,5);
        venta1.agregarProducto(productoVenta1);
        productoVenta1= new ProductoVenta(producto2,2);
        venta1.agregarProducto(productoVenta1);
        productoVenta1 = new ProductoVenta(producto3,1);
        venta1.agregarProducto(productoVenta1);
        
        System.out.println(cliente1); //Muestra todo gracias a toString>Cliente
        System.out.println(venta1);
    }
}

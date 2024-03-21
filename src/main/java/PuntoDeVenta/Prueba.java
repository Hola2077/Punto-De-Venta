package PuntoDeVenta.View;
import PuntoDeVenta.Model.Cliente;
import ProductoVenta.Model.Producto;
import PuntoDeVenta.Model.Venta;

public class Prueba {

    public static void main(String[] args){
        Cliente cliente1 = new Cliente("10193", "Nonbre1", "Apellido1");
        Cliente cliente2 = new Cliente("32446", "Nonbre2", "Apellido2");

        Producto producto1 = new Producto("gaseosa", 500, 10);
        Producto producto2 = new Producto("empanada", 500, 15);


        Venta venta1 = new Venta(cliente1);

        

        System.out.println(venta1);

        System.out.println(cliente1);
    }


}
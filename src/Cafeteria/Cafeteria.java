package Cafeteria;

import java.util.ArrayList;


public class Cafeteria {
    String nombre;
    ArrayList<Pedido> listaPedidos;

    public Cafeteria(String nombre) {
        this.nombre = nombre;
        this.listaPedidos = new ArrayList<>();
    }

    public void agregarPedidos(Pedido pedido){
        listaPedidos.add(pedido);
    }

    public void mostrarPedidos(){
        System.out.println("\nLISTADO DE PEDIDOS: ");
        for(Pedido pedido : listaPedidos){
            System.out.println("\nId pedido: " + pedido.id);
            System.out.println("Nombre producto: " +pedido.producto.nombre);
            System.out.println("Precio: " + pedido.producto.precio);
            System.out.println("Cantidad: " + pedido.cantidadComprada);
            System.out.println("Total: " + pedido.calcularTotal());
            System.out.println("Entregado: " +pedido.entregado);

        }
    }

    public void calcularMostrarVentasTotales(){
        double totalVentas = 0;
        int totalCantidadesProducto = 0;
        System.out.println("\n--------------------------------------------");
        System.out.println("Cantidad de unidades vendidas por producto:");
        for (Pedido pedido : listaPedidos){
            if(pedido.entregado) {
                totalVentas += pedido.calcularTotal();
            }
            Producto productoCapturado = pedido.producto;
            System.out.println("-" + productoCapturado.nombre + " = " + productoCapturado.cantidadVendida);

        }
        System.out.println("\n---------------------------------------------");
        System.out.println("Total de ventas de pedidos entregados:" + totalVentas );

    }
}

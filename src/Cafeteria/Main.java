package Cafeteria;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Pan rollo", 500);
        Producto producto2 = new Producto("Pan blandito", 400);
        Producto producto3 = new Producto("Roscón", 1000);
        Producto producto4 = new Producto("Liberal", 1500);
        Producto producto5 = new Producto("Milhoja", 5000);

        Pedido pedido1 = new Pedido(1, producto1, 10);
        Pedido pedido2 = new Pedido(2, producto2, 5);
        Pedido pedido3 = new Pedido(3, producto3, 2);
        Pedido pedido4 = new Pedido(4, producto4, 3);
        Pedido pedido5 = new Pedido(5, producto5, 1);

        Cafeteria cafeteria = new Cafeteria("Las delicias del barrio");

        cafeteria.agregarPedidos(pedido1);
        cafeteria.agregarPedidos(pedido2);
        cafeteria.agregarPedidos(pedido3);
        cafeteria.agregarPedidos(pedido4);
        cafeteria.agregarPedidos(pedido5);

        pedido1.marcarEntregado();
        pedido2.marcarEntregado();
        pedido3.marcarEntregado();

        cafeteria.mostrarPedidos();

        cafeteria.calcularMostrarVentasTotales();



    }
}

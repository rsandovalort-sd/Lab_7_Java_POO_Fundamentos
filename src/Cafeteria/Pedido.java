package Cafeteria;

public class Pedido {
    int id;
    Producto producto;
    int cantidadComprada;
    boolean entregado;

    public Pedido(int id, Producto producto, int cantidadComprada) {
        this.id = id;
        this.producto = producto;
        this.cantidadComprada = cantidadComprada;
        this.entregado = false;
    }

    public boolean marcarEntregado(){
        if(!entregado){
            entregado = true;
            producto.marcarVenta(cantidadComprada);
        }
        return entregado;
    }

    public double calcularTotal(){
        double totalPedido = cantidadComprada * this.producto.precio;
        return totalPedido;
    }

    public void mostrarDetallePedido(){
        System.out.println("\n--- DETALLE DEL PEDIDO ---");
        producto.mostrarInfoProducto();
        System.out.println("Total del pedido: " + calcularTotal());
        if (entregado == true){
            System.out.println("El pedido ha sido entregado");
        }else{
            System.out.println("Pedido a la espera de ser entregado");
        }


    }
}

package Cafeteria;

public class Producto {
    String nombre;
    double precio;
    int cantidadVendida;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadVendida = 0;
    }

    public void marcarVenta(int cantidadComprada){
        cantidadVendida += cantidadComprada;
    }

    public void mostrarInfoProducto(){
        System.out.println("___Información del producto___");
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidadVendida);

    }

}

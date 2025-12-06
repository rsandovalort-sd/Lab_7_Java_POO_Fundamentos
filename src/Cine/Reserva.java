package Cine;


public class Reserva {
    Pelicula pelicula;
    Sala sala;
    String cliente;

    public Reserva(Pelicula pelicula, Sala sala, String cliente) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.cliente = cliente;
    }

    public void procesarReseva(int cantidadEntradas){
        if(this.pelicula.venderEntrada(cantidadEntradas) && this.sala.ocuparAsiento(cantidadEntradas)){
            mostrarDetallesReserva(cantidadEntradas);
        }else{
            System.out.println("La reserva no fue existosa");
        }

    }

    public void mostrarDetallesReserva(int cantidadEntradas){
        System.out.println("\nReserva Exitosa");
        System.out.println("\n--- DETALLES DE LA RESERVA ---");
        System.out.println("Cliente: "  + cliente);
        System.out.println("Pelicula: " + this.pelicula.titulo);
        System.out.println("Sala: " + this.sala.identificador);
        System.out.println("Entradas: " + cantidadEntradas);
    }
}

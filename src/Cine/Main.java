package Cine;

public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Avatar", "Ciencia Ficción", 150);
        Sala sala1 = new Sala(1, "2D", 50);

        Reserva reserva1 = new Reserva(pelicula1, sala1, "Ricardo" );
        Reserva reserva2 = new Reserva(pelicula1, sala1, "Andrés" );
        Reserva reserva3 = new Reserva(pelicula1, sala1, "Juan" );

        reserva1.procesarReseva(4);
        reserva2.procesarReseva(5);
        reserva3.procesarReseva(15);

        pelicula1.mostrarInfoPelicula();
        sala1.mostrarEstadoActualSala();







    }
}

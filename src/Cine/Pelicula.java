package Cine;

public class Pelicula {
    String titulo;
    String genero;
    int duracion;
    int cantidadEntradas;

    public Pelicula(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.cantidadEntradas = 50;
    }

    public boolean venderEntrada(int entradasAcomprar){
        if(entradasAcomprar <= cantidadEntradas){
            cantidadEntradas -= entradasAcomprar;
            return true;
        }else{
            System.out.println("\nNo hay espacios disponibles");
            return false;
        }

    }

    public void mostrarInfoPelicula(){
        System.out.println("\n--- INFORMACIÓN DE LA PELICULA ---");
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Entradas disponibles: " + cantidadEntradas);
    }
}

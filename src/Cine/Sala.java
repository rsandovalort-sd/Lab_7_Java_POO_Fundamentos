package Cine;

public class Sala {
    int identificador;
    String tipo;
    int capacidad;
    int asientosOcupados;

    public Sala(int identificador, String tipo, int capacidad) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.asientosOcupados = 0;
    }

    public boolean ocuparAsiento(int entradas){
        if (asientosOcupados + entradas <= capacidad) {
            asientosOcupados += entradas;
            return true;
        }else{
            return false;
        }

    }

    public void mostrarEstadoActualSala(){
        System.out.println("\n--- ESTADO ACTUAL DE LA SALA ---");
        System.out.println("Número de sala: " + identificador);
        System.out.println("Tipo de sala: " + tipo);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Asientos ocupados: " + asientosOcupados);
    }
}

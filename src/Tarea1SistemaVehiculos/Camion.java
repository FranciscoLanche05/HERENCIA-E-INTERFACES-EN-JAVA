package Tarea1SistemaVehiculos;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, int velocidadMaxima, double capacidadCarga) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void describir() {
        System.out.println("Camion: " + marca + " " + modelo + " | Max: " + velocidadMaxima + "km/h | Carga: " + capacidadCarga + "kg");
    }
}
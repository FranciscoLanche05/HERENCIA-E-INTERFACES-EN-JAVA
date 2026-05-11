package Tarea1SistemaVehiculos;

public class Auto extends Vehiculo implements Electrico {
    private int numeroPuertas;
    private int nivelBateria;

    public Auto(String marca, String modelo, int velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
        this.nivelBateria = 100;
    }

    @Override
    public void describir() {
        System.out.println("Auto: " + marca + " " + modelo + " | Max: " + velocidadMaxima + "km/h | Puertas: " + numeroPuertas);
    }

    @Override
    public void cargarBateria(int porcentaje) {
        this.nivelBateria += porcentaje;
        if (this.nivelBateria > 100) this.nivelBateria = 100;
    }

    @Override
    public int autonomiaKm() {
        return this.nivelBateria * 5;
    }
}
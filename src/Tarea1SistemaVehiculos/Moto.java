package Tarea1SistemaVehiculos;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String marca, String modelo, int velocidadMaxima, int cilindraje) {
        super(marca, modelo, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

    @Override
    public void describir() {
        System.out.println("Moto: " + marca + " " + modelo + " | Max: " + velocidadMaxima + "km/h | CC: " + cilindraje);
    }
}
package Tarea1SistemaVehiculos;


public class MainVehiculos {
    public static void main(String[] args) {
        Vehiculo a = new Auto("Toyota", "Prius", 180, 4);
        Vehiculo m = new Moto("Yamaha", "R6", 260, 600);
        Vehiculo c = new Camion("Volvo", "FH16", 120, 25000);

        Vehiculo[] listaVehiculos = {a, m, c};

        for (Vehiculo v : listaVehiculos) {
            v.describir();
            if (v instanceof Electrico) {
                Electrico e = (Electrico) v;
                System.out.println("Autonomia: " + e.autonomiaKm() + "km");
            }
        }
    }
}
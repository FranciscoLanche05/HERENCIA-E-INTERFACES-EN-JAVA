package Tare2SistemaEmpleados;

public class MainEmpleados {
    public static void main(String[] args) {
        Empleado e1 = new EmpleadoPorHora("Ana", 101, 40, 15.5);
        Empleado e2 = new EmpleadoFijo("Luis", 102, 160, 2000.0);
        Empleado e3 = new EmpleadoComision("Carlos", 103, 160, 800.0, 10.0, 5000.0);

        Empleado[] listaEmpleados = {e1, e2, e3};

        for (Empleado e : listaEmpleados) {
            e.mostrarInfo();
            if (e instanceof Bonificable) {
                Bonificable b = (Bonificable) e;
                System.out.println("Bono aplicable: $" + b.calcularBono());
            }
            System.out.println("----------------------------------------");
        }
    }
}
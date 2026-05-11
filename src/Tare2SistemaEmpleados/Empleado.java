package Tare2SistemaEmpleados;

public abstract class Empleado {
    protected String nombre;
    protected int id;
    protected double horasTrabajadas;

    public Empleado(String nombre, int id, double horasTrabajadas) {
        this.nombre = nombre;
        this.id = id;
        this.horasTrabajadas = horasTrabajadas;
    }

    public abstract double calcularSalario();

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Horas: " + horasTrabajadas + " | Salario: $" + calcularSalario());
    }
}
package Tarea3SistemaFiguras;

public abstract class Figura {
    protected String color;
    protected boolean rellena;

    public Figura(String color, boolean rellena) {
        this.color = color;
        this.rellena = rellena;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public void describir() {
        System.out.println("Color: " + color);
        System.out.println("Rellena: " + (rellena ? "Si" : "No"));
        System.out.println("Area: " + String.format("%.2f", calcularArea()));
        System.out.println("Perimetro: " + String.format("%.2f", calcularPerimetro()));
    }
}
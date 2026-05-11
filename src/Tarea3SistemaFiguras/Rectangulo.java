package Tarea3SistemaFiguras;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, boolean rellena, double base, double altura) {
        super(color, rellena);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void describir() {
        System.out.println("--- RECTANGULO (Base: " + base + ", Altura: " + altura + ") ---");
        super.describir();
    }
}
package Tarea3SistemaFiguras;


public class TrianguloRectangulo extends Figura {
    private double catetoA;
    private double catetoB;

    public TrianguloRectangulo(String color, boolean rellena, double catetoA, double catetoB) {
        super(color, rellena);
        this.catetoA = catetoA;
        this.catetoB = catetoB;
    }

    @Override
    public double calcularArea() {
        return (catetoA * catetoB) / 2;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));
        return catetoA + catetoB + hipotenusa;
    }

    @Override
    public void describir() {
        System.out.println("--- TRIANGULO RECTANGULO (Catetos: " + catetoA + ", " + catetoB + ") ---");
        super.describir();
    }
}
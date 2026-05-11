package Tarea3SistemaFiguras;

public class MainFiguras {
    public static void main(String[] args) {
        Figura c1 = new Circulo("Rojo", true, 5.0);
        Figura c2 = new Circulo("Verde", false, 2.5);

        Figura r1 = new Rectangulo("Azul", true, 4.0, 6.0);
        Figura r2 = new Rectangulo("Amarillo", false, 10.0, 2.0);

        Figura t1 = new TrianguloRectangulo("Morado", true, 3.0, 4.0);
        Figura t2 = new TrianguloRectangulo("Naranja", false, 5.0, 12.0);

        Figura[] figuras = {c1, c2, r1, r2, t1, t2};

        System.out.println("========== REPORTE DE FIGURAS GEOMETRICAS ==========");
        for (Figura f : figuras) {
            f.describir();
            System.out.println("--------------------------------------------------");
        }
    }
}
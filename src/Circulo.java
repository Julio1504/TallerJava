public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(String nombre, String colorFigura, double radio) {
        super(nombre, colorFigura);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

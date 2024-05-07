public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(String nombre, String colorFigura) {
        super(nombre, colorFigura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void calcularArea(){
        System.out.println("El area de este rectangulo es de: \n" + (this.base*this.altura) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este rectangulo es de: \n" + (this.base*2+this.altura*2)+"cm");
     }
}

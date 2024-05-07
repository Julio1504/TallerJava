public class FiguraGeometrica {
    private String nombre;
    private String colorFigura;

    public FiguraGeometrica(String nombre, String colorFigura) {
        this.nombre = nombre;
        this.colorFigura = colorFigura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorFigura() {
        return colorFigura;
    }

    public void setColorFigura(String colorFigura) {
        this.colorFigura = colorFigura;
    }
}

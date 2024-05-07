public class Vendedor extends Empleado2{
    private double comision;

    public Vendedor(String nombre, double salario) {
        super(nombre, salario);
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double calcularSalario(){
        return super.calcularSalario() + comision;
    }
}

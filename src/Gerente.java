public class Gerente extends Empleado2{
    private double bono;

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double calcularSalario(){
        return super.calcularSalario() + bono;
    }
}

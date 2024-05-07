public class Estudiante extends Persona{
    private String grado;

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public void mensaje(){
        super.mensaje();
        System.out.println(" ,mi grado es: " + this.grado);
    }
}

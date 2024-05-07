public class Empleado extends Persona implements Trabajador{
    public Empleado(String nombre, Integer edad, String fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
    }
    public void realizarTarea(){
        System.out.println("Realizando tarea laboral");
    }
}

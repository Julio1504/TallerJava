public class Persona {
    private String nombre;
    private Integer edad;
    private String fechaNacimiento;

    public Persona(String nombre, Integer edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        if (edad > 0 ){
            this.edad = edad;
            System.out.println("Edad establecida");
        }
        else{
            System.out.println("Ingrese una edad valida");
        }
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void calcularFechaNacimiento(){
        System.out.println("Su año de nacimiento fue el: " + (2024 - this.edad));
    }
    public void mensaje(){
        System.out.println("Mi nombre es: " + this.nombre + " , Mi edad es: " + this.edad);
    }

}

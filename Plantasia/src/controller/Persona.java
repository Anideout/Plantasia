package controller;

/**
 *
 * @author anideu
 */
public class Persona {
    private String rut, nombre, apellido;
    private int edad;
    private DIreccion direccion;
    public Persona(String rut1, String nombre1, String apellido1, int edad1, Direccion direccion1) {
    }

    public Persona(String rut, String nombre, String apellido, int edad, DIreccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public DIreccion getDireccion() {
        return direccion;
    }

    public void setDireccion(DIreccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\nrut: " + rut +
                    "\nnombre: " + nombre +
                    "\napellido: " + apellido +
                    "\nedad: " + edad +
                    "\ndireccion: " + direccion;
    }

   
    
    
}

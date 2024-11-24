package controller;

/**
 *
 * @author anideu
 */
public class Planta {
    public String nombrePlanta;
    public int precio, seguimiento;

    public Planta() {
    }

    public Planta(String nombrePlanta, int precio, int seguimiento) {
        this.nombrePlanta = nombrePlanta;
        this.precio = precio;
        this.seguimiento = seguimiento;
    }

    public String getNombrePlanta() {
        return nombrePlanta;
    }

    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(int seguimiento) {
        this.seguimiento = seguimiento;
    }

    @Override
    public String toString() {
        return "Planta{" + "nombrePlanta=" + nombrePlanta + ", precio=" + precio + ", seguimiento=" + seguimiento + '}';
    }
    
}

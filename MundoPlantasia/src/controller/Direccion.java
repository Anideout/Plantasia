package controller;

/**
 *
 * @author anideu
 */
public class Direccion {
    private String calle, comuna;
    private int numero;

    public Direccion() {
    }

    public Direccion(String calle, String comuna, int numero) {
        this.calle = calle;
        this.comuna = comuna;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", comuna=" + comuna + ", numero=" + numero + '}';
    }
    
    
}

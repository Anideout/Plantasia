package controller;

import java.util.Random;
/**
 *
 * @author anideu
 */
public class DIreccion {
    private String calle, comuna;
    private int numero, seguimiento;

    public DIreccion() {
    }

    public DIreccion(String calle, String comuna, int numero, int seguimiento) {
        this.calle = calle;
        this.comuna = comuna;
        this.numero = numero;
        this.seguimiento = seguimiento;
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

    public int getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(int seguimiento) {
        this.seguimiento = seguimiento;
    }
    
    
    
    
    @Override
    public String toString() {
        return "DIreccion{" + "calle=" + calle + ", comuna=" + comuna + ", numero=" + numero + ", seguimiento=" + seguimiento + '}';
    }

    

    
    
    
    
}

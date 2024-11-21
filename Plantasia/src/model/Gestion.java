package model;


import controller.Persona;
import java.util.ArrayList;
/**
 *
 * @author anideu
 */
public class Gestion {
    //creando atributo de tipo ArrayList
    
    private ArrayList<Persona> personas = new ArrayList();
    
    //crear getter and setter de la lista
    public ArrayList<Persona> getPersonas(){
        return personas;
        
    }
    public void setPersonas(ArrayList<Persona> personas){
        this.personas = personas;
    }
    
    //metodo customer
    
    //metodo para agregar personas
    public void agregarPersona(Persona persona){
        personas.add(persona);
        System.out.println("Persona " + persona.getNombre() + "Ha sido agregada con exito!");
    }
    //metodo para listar personas
    public void listarPersonas(){
        for(Persona p : personas){
            System.out.println(p);
        }
    }
    
    //metodo para modificar
    public boolean modificarPersona(int indice, Persona personaModificada){
        if(indice >= 0 && indice < personas.size()){
            personas.set(indice, personaModificada);
            System.out.println("persona modificada con exito!" + indice);
            return true;
        }else{
            System.out.println("Indice no se encuentra...");
            return false;
        }
    }
    //metodo para eliminar personas
    public boolean eliminarPersona(int indice){
        Persona eliminado = personas.remove(indice);
        System.out.println("persona eliminada con exito! ");
        return true;
    }
    //metodo para obtener tamaño de la lista! 
    public int tamanioLIsta(){
        int contador = 0;
        for(Persona p : personas){
          contador++;  
        }
        return contador;
    }
    
    
    
    
}


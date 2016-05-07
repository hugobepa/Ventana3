 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana1;

import java.util.ArrayList;

/**
 *
 * @author hugo
 */
public abstract class Persona {
     ArrayList Nombre;
     ArrayList Edad;

    public Persona() {
    }

    public Persona(ArrayList Nombre, ArrayList Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    
    
    public abstract void IngresarNombre(String nom);
    public abstract void IngresarEdad(int edad);
    public abstract void EliminarNombre(String nom);
    public abstract void EliminarEdad(int edad);
    public abstract String BuscarNombre(String nom);
    public abstract int BuscarEdad(int edad);
    
}

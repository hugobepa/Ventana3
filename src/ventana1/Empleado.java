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
public class Empleado extends Persona {

    public Empleado() {
    }

    public Empleado(ArrayList Nombre, ArrayList Edad) {
        super(Nombre, Edad);
    }

    @Override
    public void IngresarNombre(String nom) {
       super.Nombre.add(nom);
    }

    @Override
    public void IngresarEdad(int edad) {
         super.Edad.add(edad);
    }

    @Override
    public void EliminarNombre(String nom) {
        super.Nombre.remove(super.Nombre.indexOf(nom));
    }

    @Override
    public void EliminarEdad(int edad) {
        super.Edad.remove(super.Edad.indexOf(edad));
    }

    @Override
    public String BuscarNombre(String nom) {
        String buscarNombre="";
        if(super.Nombre.contains(nom)==true)
        {
            buscarNombre=(String) super.Nombre.get(super.Nombre.indexOf(nom));
        }else{
            buscarNombre="No existe Nombre";
        }
        
        return buscarNombre;
    }

    @Override
    public int BuscarEdad(int edad) {
       int buscarEdad=0;
       if(super.Edad.contains(edad)==true)
       {
           buscarEdad=(int) super.Edad.get(super.Edad.indexOf(edad));
       }else{
           buscarEdad=0;
       }
       
       return buscarEdad;
    }
    
    
    

    
    
    
    
    
}

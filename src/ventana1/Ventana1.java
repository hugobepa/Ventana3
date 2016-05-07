/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana1;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *https://www.youtube.com/watch?v=HC6jIjJ1484
 * 
 * https://www.youtube.com/watch?v=kYJ-70Dtwbw 3 arrayList
 *
 * @author hugo
 */
public class Ventana1 {

    /**
     *  //v.reshape(20,90,60,40);// x,y,ancho,largo
     * https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html
     * https://docs.oracle.com/javase/tutorial/uiswing/components/internalframe.html
     * 
     * Para hacer ejecutable:
     * netbeansproject/projecto/dist/projecto.jar
     * 
     * obj/BDRaton/Propietes/Code/TypeVaribale/public static (cambiamos)
     * 
     * TFxxx/BDRaton/Propietes/Code/TypeVaribale/public static (cambiamos textField ) 
     */
    public static void main(String[] args) {
        
        //crear y llamar variable de la classe
        VArray v= new VArray();
        //poner titulo
        v.setTitle("Interficie Array");
        //que sea mostrar
        v.setVisible(true);
        //el tamaño y posicion wn medio
        //v.setSize(500, 500);
        v.setLocationRelativeTo(null);
        //con botton xse cierra y y para programa
        v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);
        //Icono
        //v.setIconImage(new ImageIcon().getImage());
        //v.reshape(20,90,60,40);// x,y,ancho,largo
        
        
        
    }
    
}

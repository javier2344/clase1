/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase2.clase02ejercicio02;

/**
 *
 * @author USUARIO
 */
public class claseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Profesor profe = new Profesor("javier", "nueva concepcion", "23/10/2000", "M", 19, "ING", "Programador");
        System.out.println(profe.toString());
        
        Estudiante est = new Estudiante("Fernando", "Chalte", "23/10/200", "M", 19, 1500, "Ing. Sistemas y computacion");
        System.out.println(est.toString());
   
    }  

}

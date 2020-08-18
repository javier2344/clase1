/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase2;

/**
 *
 * @author USUARIO
 */
public class clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(libro.toString());
//        System.out.println(objetolibro2.getNumeroPagina());


        libros objetolibro1 = new libros(1, "PROGRAMACION JAVA", 100, "Deitel");
        libros objetolibro2 = new libros(2, "PROGRAMACION PHP", 600, "Deitel");
 
        
        objetolibro1.setNumeroPagina(200);
           
        if (objetolibro1.getNumeroPagina() < objetolibro2.getNumeroPagina()) {
            System.out.println("El libro 2 tiene mayor numero de paginas  que el libro 1,el libro 2 tiene un numero de pagina de  "+objetolibro2.getNumeroPagina());
            System.out.println("la informacion del libro 2es "+objetolibro2.toString());
        } else {
            System.out.println("El libro 1 tiene mayor numero de paginas  que el libro 2,el libro 1 tiene un numero de pagina de  "+objetolibro1.getNumeroPagina());
            System.out.println("la informacion del libro 1 es "+objetolibro1.toString());
        }
    }

}

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
public class libros {
    private int id;
    private String NombreLibro;
    private int NumeroPagina;
    private String Autor ;
    
public libros(int id,String NombreLibro,int NumeroPagina,String Autor ){  
   this.id  = id;
   this.NombreLibro = NombreLibro;
   this.NumeroPagina = NumeroPagina;
   this.Autor = Autor;
   

}       

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public int getNumeroPagina() {
        return NumeroPagina;
    }

    public void setNumeroPagina(int NumeroPagina) {
        this.NumeroPagina = NumeroPagina;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "libros{" + "id=" + id + ", NombreLibro=" + NombreLibro + ", NumeroPagina=" + NumeroPagina + ", Autor=" + Autor + '}';
    }
    

    
}

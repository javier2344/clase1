/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author USUARIO
 */
public class carro {
    private String Marca ;
    private int Año; 
    private String Color ;
    private int nPuertas;
    
    public carro (String pMarca,int pAño, String pColor  ){
    
    Marca = pMarca;
    Año = pAño;
    Color = pColor; 

    }
    public carro (String pMarca,int pAño, String pColor ,int pnPuertas ){
    
    Marca = pMarca;
    Año = pAño;
    Color = pColor;
    nPuertas = pnPuertas ;
    }

    @Override
    public String toString() {
        return "carro{" + "Marca=" + Marca + ", A\u00f1o=" + Año + ", Color=" + Color + ", nPuertas=" + nPuertas + '}';
    }
    

  
    
    
    
   
    
}

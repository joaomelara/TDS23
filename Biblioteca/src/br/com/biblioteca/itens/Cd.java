/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.itens;

/**
 *
 * @author 3113.343
 */
public class Cd  extends Itens{
    private String artista;
    private int numeroFaixa;
    private String gravadora;
    
        
    
    public Cd(){
        
    }
    
    
    
    
     public Cd( int codigo, String titulo, String artista, int numeroFaixa, String gravadora){
      super(codigo,titulo);
      this.artista = artista;
      this.numeroFaixa= numeroFaixa;
      this.gravadora= gravadora;
         
    }
     
    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
        
    }
    public int getNumeroFaixa(){
        return numeroFaixa;
    }
    public void setNumeroFaixa(int numeroFaixa){
        this.numeroFaixa=numeroFaixa;
     }
    public String getGravadora(){
        return gravadora;
    }
    public void setGravadora(String gravadora){
       this.gravadora=gravadora; 
    }
    public String toString(){
        return super.toString() +"\n Artista:" +getArtista() + "\n numero de faixa: "+ getNumeroFaixa() + "\n a sua Gravadora é:" + getGravadora()+"";
    }
}

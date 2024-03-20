/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */
public class Dado {
        private int numero;
        private int[] ficha = {0, 1};
        
    //Constructor
    public Dado(int numero) {
        this.numero = numero;
    }
    
    public Dado(int[] ficha){
        this.ficha = ficha;
    }
    
    //Getters
    public int getNumero() {
        return numero;
    }

    public int[] getFicha() {
        return ficha;
    }
    
    //Setters

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int tirarDados(){
    this.numero = (int) (Math.random()* 6) +1;
    return numero;
    }
    
    
    
}

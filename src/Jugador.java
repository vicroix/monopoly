
import java.io.Serializable;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Victor
 */
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private int penalizacion;
    private int posicion;
    private int banco;
    private int debes;
    //Opcional
    private int victorias;
    private int derrotas;
    private int numeroJugador;


    //Constructor
    public Jugador(int numeroJugador) {
        nombre = "";
        penalizacion = 0;
        victorias = 0;
        derrotas = 0;
        posicion = 1;
        banco = 100;
        debes = 0;
        this.numeroJugador = numeroJugador;
    }
    
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getPenalizacion(){
        return penalizacion;
    }
    
    public int getVictorias() {
        return victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getBanco() {
        return banco;
    }

    public int getDebes() {
        return debes;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPenalizacion(int penalizacion){
        this.penalizacion = penalizacion;
    }
    
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setPosicion(int posicion) {

        this.posicion = posicion;

    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public void setDebes(int debes) {
        this.debes = debes;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }
 
    //toString

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", banco=" + banco + ", debes=" + debes + ", victorias=" + victorias + ", derrotas=" + derrotas + '}';
    }

    public int sumarDinero(int recibido, int banco) {
        int dineroRecibido = recibido + banco;
        return dineroRecibido;
    }
}

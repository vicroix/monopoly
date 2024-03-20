
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */
public class Juego implements Serializable{
    private boolean turnoJugadores = true;
    private static final long serialVersionUID = 1L;
    
    public Juego() {
    }

    public boolean getTurnoJugadores() {
        return turnoJugadores;
    }

    public void setTurnoJugadores(boolean turnoJugadores) {
        this.turnoJugadores = turnoJugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "turnoJugadores=" + turnoJugadores + '}';
    }
    
    
}

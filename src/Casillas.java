
import java.awt.Color;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Victor
 */
public class Casillas {

    private int[] casillas;

    //Constructor
    Casillas() {
        casillas = new int[]{0, 1, 2, 3, 4, 5, 6,
            7, 8, 9, 10, 11, 12, 13, 14, 15};

    }

    //Getters
    public int[] getCasillas() {
        return casillas;
    }

    //Setters
    public void setCasillas(int[] casillas) {
        this.casillas = casillas;
    }

    //toString
    public String toString() {
        String resultado = "";
        for (int i = 0; i < casillas.length; i++) {
            System.out.print(casillas[i]);
            if (i < casillas.length - 1) {
                System.out.print(", ");
            }
        }

        return resultado;
    }

    public int valorCasilla(int posicion, int valorDado, Jugador jugador) {
        int valorCasilla = 0;
        int suerte = (int) (Math.random() * 3);
        int posicionTotal = posicion + valorDado;
        if (posicionTotal > casillas.length) {
            posicion = (posicionTotal - casillas.length);

        } else {
            posicion = posicionTotal;
        }
        jugador.setPosicion(posicion);
        switch (casillas[posicion - 1]) {
            case 0:
                valorCasilla += 20;
                break;
            case 1:
                valorCasilla += 20;
                break;
            case 2:
                if (suerte == 0) {
                    valorCasilla += 20;
                } else if (suerte == 1) {
                    valorCasilla += 10;
                } else if (suerte == 2) {
                    valorCasilla -= 10;
                }
            case 3:
                valorCasilla += 20;
                break;
            case 4:
                jugador.setPenalizacion(2);
                break;
            case 5:
                valorCasilla += 20;
                break;
            case 6:
                valorCasilla -= 10;
                break;
            case 7:
                valorCasilla += 20;
                break;
            case 8:
                valorCasilla = 0;
                break;
            case 9:
                valorCasilla += 20;
                break;
            case 10:
                if (suerte == 0) {
                    valorCasilla += 20;
                } else if (suerte == 1) {
                    valorCasilla += 10;
                } else if (suerte == 2) {
                    valorCasilla -= 10;
                }
                break;
            case 11:
                valorCasilla += 20;
                break;
            case 12:
                jugador.setPenalizacion(2);
                break;
            case 13:
                valorCasilla += 20;
                break;
            case 14:
                valorCasilla -= 10;
                break;
            case 15:
                valorCasilla += 20;
                break;

        }

        return valorCasilla;
    }

}

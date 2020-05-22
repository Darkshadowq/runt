package sample.Mainnn;

import java.util.*;

/**
 * 
 */
public class Placa {

    /**
     * Default constructor
     */
    public Placa() {
    }

    /**
     * 
     */
    public String letras;

    /**
     * 
     */
    public int numeros;


    /**
     * @param letras 
     * @param numeros
     */
    public Placa(String letras, int numeros) {
        this.letras=letras;
        this.numeros=numeros;
    }


	@Override
	public String toString() {
		return "Placa [letras=" + letras + ", numeros=" + numeros + "]";
	}

}
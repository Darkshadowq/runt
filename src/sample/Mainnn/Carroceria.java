package sample.Mainnn;

import java.util.*;

/**
 * 
 */
public class Carroceria {

    /**
     * Default constructor
     */
    public Carroceria() {
    }

    /**
     * 
     */
    public int codigo;

    /**
     * 
     */
    public String tipo;



    /**
     * @param codigo 
     * @param tipo
     */
    public Carroceria(int codigo, String tipo) {
        // TODO implement here
    	this.codigo=codigo;
    	this.tipo=tipo;
    }



	@Override
	public String toString() {
		return "Carroceria [codigo=" + codigo + ", tipo=" + tipo + "]";
	}

}
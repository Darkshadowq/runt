package sample.Mainnn;


import java.util.*;

/**
 * 
 */
public class Blindaje {

    /**
     * Default constructor
     */
    public Blindaje() {
    }

    /**
     * 
     */
    public int blindaje;

    /**
     * 
     */
    public int resolucionBlindaje;

    /**
     * 
     */
    public String fechaResolucionBlindaje;

    /**
     * 
     */
    public int desmonteBlindaje;

    /**
     * 
     */
    public int resolucionDesmonteBlindaje;

    /**
     * 
     */
    public String fechaResolucionDesmonte;


    /**
     * @param blindaje 
     * @param resolucionBlindaje 
     * @param fechaResolucionBlindaje 
     * @param desmonteBlindaje 
     * @param resolucionDesmonteBlindaje 
     * @param fechaResolucionDesmonte
     */
    public  Blindaje(int blindaje, int resolucionBlindaje, String fechaResolucionBlindaje, int desmonteBlindaje, int resolucionDesmonteBlindaje, String fechaResolucionDesmonte) {
    	 this.blindaje =blindaje;
         this.resolucionBlindaje =resolucionBlindaje;
         this.fechaResolucionBlindaje =fechaResolucionBlindaje;
         this.desmonteBlindaje =desmonteBlindaje;
         this.resolucionDesmonteBlindaje =resolucionDesmonteBlindaje;
         this.fechaResolucionDesmonte=fechaResolucionDesmonte;
    }


	@Override
	public String toString() {
		return "Blindaje [blindaje=" + blindaje + ", resolucionBlindaje=" + resolucionBlindaje
				+ ", fechaResolucionBlindaje=" + fechaResolucionBlindaje + ", desmonteBlindate=" + desmonteBlindaje
				+ ", resolucionDesmonteBlind=" + resolucionDesmonteBlindaje + ", fechaResolucionDesmonte="
				+ fechaResolucionDesmonte + "]";
	}

}
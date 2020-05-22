package sample.Mainnn;


import java.util.*;

/**
 * 
 */
public class OrganizmoDeTransito {

    /**
     * Default constructor
     */
    public OrganizmoDeTransito() {
    }

    /**
     * 
     */
    public String nombre;

    /**
     * 
     */
    public String ciudad;

    /**
     * 
     */
    public int codigo;

    /**
     * 
     */
    public String fecha;


    /**
     * @param nombre 
     * @param ciudad 
     * @param codigo 
     * @param fecha
     */
    public  OrganizmoDeTransito(String nombre, String ciudad, int codigo, String fecha) {
    	  this.nombre =nombre;
          this.ciudad =ciudad;
          this.codigo =codigo;
          this.fecha=fecha;
    }


	@Override
	public String toString() {
		return "OrganizmoDeTransito [nombre=" + nombre + ", ciudad=" + ciudad + ", codigo=" + codigo + ", fecha="
				+ fecha + "]";
	}

}
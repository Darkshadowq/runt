package sample.Mainnn;

import java.util.*;

/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public String primerApellido;

    /**
     * 
     */
    public String segundoApellido;

    /**
     * 
     */
    public String nombres;

    /**
     * 
     */
    public String tipoDocumento;

    /**
     * 
     */
    public String numeroDocumento;

    /**
     * 
     */
    public String direccion;

    /**
     * 
     */
    public String ciudad;

    /**
     * 
     */
    public int telefono;

    /**
     * 
     */
    public String firma;




    /**
     * @param id 
     * @param primerApellido 
     * @param segundoApellido 
     * @param tipoDocumento 
     * @param numeroDocumento 
     * @param direccion 
     * @param ciudad 
     * @param telefono 
     * @param firma
     */
    public  Persona(int id, String primerApellido, String segundoApellido,String nombres, String tipoDocumento, String numeroDocumento, String direccion, String ciudad, int telefono, String firma) {
    	  this.id =id;
          this.primerApellido=primerApellido; 
          this.segundoApellido =segundoApellido;
          this.nombres=nombres;
          this.tipoDocumento =tipoDocumento;
          this.numeroDocumento =numeroDocumento;
          this.direccion =direccion;
          this.ciudad =ciudad;
          this.telefono =telefono;
          this.firma=firma;
    }




	@Override
	public String toString() {
		return "Persona [id=" + id + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido
				+ ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", direccion="
				+ direccion + ", ciudad=" + ciudad + ", telefono=" + telefono + ", firma=" + firma + "]";
	}

}
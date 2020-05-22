package sample.Mainnn;

import java.util.*;

/**
 * 
 */
public class TramiteSolicitado {

    /**
     * Default constructor
     */
    public TramiteSolicitado() {
    }

    /**
     * 
     */
    public int idTramite;

    /**
     * 
     */
    public String nombreTramite;

    /**
     * 
     */
    public Vehiculo vehiculo;

    /**
     * 
     */
    public Persona propietario;

    /**
     *
     */
    public Persona comprador;
    /**
     * 
     */
    public OrganizmoDeTransito organizmoDeTransito;




    /**
     * @param idTramite 
     * @param nombreTramite 
     * @param vehiculo 
     * @param propietario
     * @param organizmoDeTransito
     */
    public TramiteSolicitado(int idTramite, String nombreTramite, Vehiculo vehiculo, Persona propietario, OrganizmoDeTransito organizmoDeTransito) {
    	 this.idTramite =idTramite;
         this.nombreTramite =nombreTramite;
         this.vehiculo =vehiculo;
         this.propietario =propietario;
         this.organizmoDeTransito=organizmoDeTransito;
    }

    /**
     * @param idTramite
     * @param nombreTramite
     * @param vehiculo
     * @param propietario
     * @param comprador
     * @param organizmoDeTransito
     */

    public TramiteSolicitado(int idTramite, String nombreTramite, Vehiculo vehiculo, Persona propietario, Persona comprador, OrganizmoDeTransito organizmoDeTransito) {
        this.idTramite =idTramite;
        this.nombreTramite =nombreTramite;
        this.vehiculo =vehiculo;
        this.propietario =propietario;
        this.comprador=comprador;
        this.organizmoDeTransito=organizmoDeTransito;
    }




	@Override
	public String toString() {
		return "TramiteSolicitado [idTramite=" + idTramite + ", nombreTramite=" + nombreTramite + ", vehiculo="
				+ vehiculo + ", propietario=" + propietario + ", comprador=" + comprador + ", organizmoDeTransito=" + organizmoDeTransito + "]";
	}

}
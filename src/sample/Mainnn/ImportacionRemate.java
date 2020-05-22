package sample.Mainnn;

import java.util.*;

/**
 * 
 */
public class ImportacionRemate {

    /**
     * Default constructor
     */
    public ImportacionRemate() {
    }

    /**
     * 
     */
    public int manifActa;

    /**
     * 
     */
    public int decDeImportacion;

    /**
     * 
     */
    public String acta;

    /**
     * 
     */
    public String entidad;

    /**
     * 
     */
    public String ciudad;

    /**
     * 
     */
    public String codigo;

    /**
     * 
     */
    public int noDocumento;

    /**
     * 
     */
    public String fecha;



    /**
     * @param manifActa 
     * @param decDeImportacion 
     * @param acta 
     * @param entidad 
     * @param ciudad
     * @param codigo 
     * @param noDocumento 
     * @param fecha
     */
    public ImportacionRemate(int manifActa, int decDeImportacion, String acta, String entidad, String ciudad, String codigo, int noDocumento, String fecha) {
    	 this.manifActa =manifActa;
         this.decDeImportacion =decDeImportacion;
         this.acta =acta;
         this.entidad =entidad;
         this.ciudad =ciudad;
         this.codigo =codigo;
         this.noDocumento =noDocumento;
         this.fecha=fecha;
    }



	@Override
	public String toString() {
		return "ImportacionRemate [manifActa=" + manifActa + ", decDeImportacion=" + decDeImportacion + ", acta=" + acta
				+ ", entidad=" + entidad + ", ciudad=" + ciudad + ", codigo=" + codigo + ", noDocumento=" + noDocumento
				+ ", fecha=" + fecha + "]";
	}

}
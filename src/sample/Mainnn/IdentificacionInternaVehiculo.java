package sample.Mainnn;

import java.util.*;

/**
 * 
 */
public class IdentificacionInternaVehiculo {

    /**
     * Default constructor
     */
    public IdentificacionInternaVehiculo() {
    }

    /**
     * 
     */
    public int numeroDeMotor;

    /**
     * 
     */
    public int motorRegrabado;

    /**
     * 
     */
    public int numeroDeChasis;

    /**
     * 
     */
    public int chasisRegrabado;

    /**
     * 
     */
    public int numeroDeSerie;

    /**
     * 
     */
    public int serieRegrabado;

    /**
     * 
     */
    public int numeroDeVinAutomotores;




    /**
     * @param numeroDeMotor 
     * @param motorRegrabado 
     * @param numeroDeChasis 
     * @param chasisRegrabado 
     * @param numeroDeSerie 
     * @param serieRegrabado 
     * @param numeroDeVinAutomotores
     */
    public IdentificacionInternaVehiculo(int numeroDeMotor, int motorRegrabado, int numeroDeChasis, int chasisRegrabado, int numeroDeSerie, int serieRegrabado, int numeroDeVinAutomotores) {
    	 this.numeroDeMotor=numeroDeMotor;
         this.motorRegrabado =motorRegrabado;
         this.numeroDeChasis =numeroDeChasis;
         this.chasisRegrabado =chasisRegrabado;
         this.numeroDeSerie =numeroDeSerie;
         this.serieRegrabado = serieRegrabado;
         this.numeroDeVinAutomotores=numeroDeVinAutomotores;
    }




	@Override
	public String toString() {
		return "IdentificacionInternaVehiculo [numeroDeMotor=" + numeroDeMotor + ", motorRegrabado=" + motorRegrabado
				+ ", numeroDeChasis=" + numeroDeChasis + ", chasisRegrabado=" + chasisRegrabado + ", numeroDeSerie="
				+ numeroDeSerie + ", serieRegrabado=" + serieRegrabado + ", numeroDeVinAutomotores="
				+ numeroDeVinAutomotores + "]";
	}

}
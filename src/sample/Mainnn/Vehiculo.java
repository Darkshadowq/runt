package sample.Mainnn;


import java.util.*;

/**
 * 
 */
public class Vehiculo {

    /**
     * Default constructor
     */
    public Vehiculo() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public Placa  placa;

    /**
     * 
     */
    public String linea;

    /**
     * 
     */
    public String marca;

    /**
     * 
     */
    public String color;

    /**
     * 
     */
    public int modelo;

    /**
     * 
     */
    public int cilindrada;

    /**
     * 
     */
    public String clase;

    /**
     * 
     */
    public String combustible;

    /**
     * 
     */
    public String tipoDeServicio;

    /**
     * 
     */
    public String potencia;

    /**
     * 
     */
    public String datosDeAlerta;

    /**
     * 
     */
    public Carroceria  carroceria;

    /**
     * 
     */
    public String empresaVinculadora;

    /**
     * 
     */
    public String nitEmpresaVinculadora;

    /**
     * 
     */
    public Blindaje blindaje;

    /**
     * 
     */
    public ImportacionRemate importacionRemate;

    /**
     *
     */
    public IdentificacionInternaVehiculo identificacionInternaVehiculo;










    /**

     * @param placa 
     * @param linea 
     * @param marca 
     * @param color 
     * @param modelo 
     * @param cilindrada 
     * @param clase 
     * @param combustible 
     * @param tipoDeServicio 
     * @param potencia 
     * @param datosDeAlerta 
     * @param carroceria 
     * @param empresaVinculadora 
     * @param nitEmpresaVinculadora 
     * @param blindaje 
     * @param importacionRemate
     */
    public Vehiculo( Placa placa, String linea, String marca, String color, int modelo, int cilindrada, String clase, String combustible, String tipoDeServicio, String potencia, String datosDeAlerta, Carroceria carroceria, String empresaVinculadora, String nitEmpresaVinculadora, Blindaje blindaje, ImportacionRemate importacionRemate, IdentificacionInternaVehiculo identificacionInternaVehiculo) {

         this.placa =placa;
         this.linea =linea;
         this.marca =marca;
         this.color =color;
         this.modelo =modelo;
         this.cilindrada =cilindrada;
         this.clase =clase;
         this.combustible =combustible;
         this.tipoDeServicio =tipoDeServicio;
         this.potencia =potencia;
         this.datosDeAlerta =datosDeAlerta;
         this.carroceria =carroceria;
         this.empresaVinculadora =empresaVinculadora;
         this.nitEmpresaVinculadora =nitEmpresaVinculadora;
         this.blindaje =blindaje;
         this.importacionRemate=importacionRemate;
         this.identificacionInternaVehiculo=identificacionInternaVehiculo;
    }

    public Vehiculo( Placa placa, String linea, String marca, String color, int modelo, int cilindrada, String clase, String combustible, String tipoDeServicio, String potencia, String datosDeAlerta, Carroceria carroceria, String empresaVinculadora, String nitEmpresaVinculadora, Blindaje blindaje, ImportacionRemate importacionRemate) {

        this.placa =placa;
        this.linea =linea;
        this.marca =marca;
        this.color =color;
        this.modelo =modelo;
        this.cilindrada =cilindrada;
        this.clase =clase;
        this.combustible =combustible;
        this.tipoDeServicio =tipoDeServicio;
        this.potencia =potencia;
        this.datosDeAlerta =datosDeAlerta;
        this.carroceria =carroceria;
        this.empresaVinculadora =empresaVinculadora;
        this.nitEmpresaVinculadora =nitEmpresaVinculadora;
        this.blindaje =blindaje;
        this.importacionRemate=importacionRemate;

    }




	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", placa=" + placa + ", linea=" + linea + ", marca=" + marca + ", color=" + color
				+ ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", clase=" + clase + ", combustible="
				+ combustible + ", tipoDeServicio=" + tipoDeServicio + ", potencia=" + potencia + ", datosDeAlerta="
				+ datosDeAlerta + ", carroceria=" + carroceria + ", empresaVinculadora=" + empresaVinculadora
				+ ", nitEmpresaVinculadora=" + nitEmpresaVinculadora + ", blindaje=" + blindaje + ", importacionRemate="
				+ importacionRemate + "]";
	}

}
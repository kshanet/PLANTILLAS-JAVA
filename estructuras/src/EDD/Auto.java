/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author PC
 */
public class Auto
{
    private String modelo;
    private int anio;
    private String placa;

    public Auto()
    {
    }

    public Auto(String modelo, int anio, String placa)
    {
        this.modelo = modelo;
        this.anio = anio;
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo()
    {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    /**
     * @return the anio
     */
    public int getAnio()
    {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    /**
     * @return the placa
     */
    public String getPlaca()
    {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    @Override
    public String toString()
    {
        return "Auto{" + "modelo=" + modelo + ", anio=" + anio + ", placa=" + placa + '}';
    }
    
}

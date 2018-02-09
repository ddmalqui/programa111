/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinececla;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Funcion {
    private int diaDeSemana;
    private int duracion;
    private Date horaInicio;
    private int numero;
    //relaciones
    private List<Entrada> entradas;
    private Sala sala;
    private Pelicula pelicula;

    public Funcion() {
    }

    public Funcion(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getDiaDeSemana() {
        return diaDeSemana;
    }

    public int getDuracion() {
        return duracion;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public int getNumero() {
        return numero;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public Sala getSala() {
        return sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setDiaDeSemana(int diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    
    
}

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
public class Programacion {
    
    private Date fechaFin;
    private Date fechaHoraCreada;
    private Date fechaInicio;
    //relacion 1..n
    private List<Funcion> funciones;

    public Programacion(Date fechaFin, Date fechaHoraCreada, Date fechaInicio, List<Funcion> funciones) {
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.fechaInicio = fechaInicio;
        this.funciones = funciones;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public Date getFechaHoraCreada() {
        return fechaHoraCreada;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setFechaHoraCreada(Date fechaHoraCreada) {
        this.fechaHoraCreada = fechaHoraCreada;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }
    
    
    
    
}

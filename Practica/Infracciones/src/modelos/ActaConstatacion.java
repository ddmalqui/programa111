/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Diego
 */
class ActaConstatacion {
    private Date fechaGeneracion;
    private Date fechaVencimientoPagoVoluntario;
    private Time horaGeneracion;
    private String lugarConstatacion;
    private int numero;
    private String obcervaciones;
    private Licencia licencia;
    private List<Infraccion> infracciones;
    
    
    public ActaConstatacion(Date fechaGeneracion, Date fechaVencimientoPagoVoluntario, Time horaGeneracion, String lugarConstatacion, int numero, String obcervaciones) {
        this.fechaGeneracion = fechaGeneracion;
        this.fechaVencimientoPagoVoluntario = fechaVencimientoPagoVoluntario;
        this.horaGeneracion = horaGeneracion;
        this.lugarConstatacion = lugarConstatacion;
        this.numero = numero;
        this.obcervaciones = obcervaciones;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public Date getFechaVencimientoPagoVoluntario() {
        return fechaVencimientoPagoVoluntario;
    }

    public void setFechaVencimientoPagoVoluntario(Date fechaVencimientoPagoVoluntario) {
        this.fechaVencimientoPagoVoluntario = fechaVencimientoPagoVoluntario;
    }

    public Time getHoraGeneracion() {
        return horaGeneracion;
    }

    public void setHoraGeneracion(Time horaGeneracion) {
        this.horaGeneracion = horaGeneracion;
    }

    public String getLugarConstatacion() {
        return lugarConstatacion;
    }

    public void setLugarConstatacion(String lugarConstatacion) {
        this.lugarConstatacion = lugarConstatacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getObcervaciones() {
        return obcervaciones;
    }

    public void setObcervaciones(String obcervaciones) {
        this.obcervaciones = obcervaciones;
    }
    
    public int calcularTotalInfracciones(){
      return 3;  
    }
    
    public int cuantasInfraccionesContiene(){
      return 3;  
    }
    
    public boolean estaEnFechaDePagoVoluntario(){
      return true;  
    }
    
    public ActaConstatacion infoActaConstatacion(){
        ActaConstatacion actaC = null;
      return actaC;  
    }
    
    //public Infracciones queInfraccionesContiene(){
        
    //}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinececla;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Cine {
    
    private String direccion;
    private Date fechaInaguracion;
    private String nombre;
    //Para Moneda BigDecimal
    private BigDecimal precioEntrada;
    //relaciones 0..n o 1..n
    private List<Programacion> programaciones;
    private List<HorarioFuncion> horariofunciones;
    private List<Sala> salas;

    public Cine(String direccion, Date fechaInaguracion, String nombre, BigDecimal precioEntrada, List<Programacion> programaciones, List<HorarioFuncion> horariofunciones, List<Sala> salas) {
        this.direccion = direccion;
        this.fechaInaguracion = fechaInaguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
        this.programaciones = programaciones;
        this.horariofunciones = horariofunciones;
        this.salas = salas;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaInaguracion() {
        return fechaInaguracion;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecioEntrada() {
        return precioEntrada;
    }

    public List<Programacion> getProgramaciones() {
        return programaciones;
    }

    public List<HorarioFuncion> getHorariofunciones() {
        return horariofunciones;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaInaguracion(Date fechaInaguracion) {
        this.fechaInaguracion = fechaInaguracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioEntrada(BigDecimal precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public void setProgramaciones(List<Programacion> programaciones) {
        this.programaciones = programaciones;
    }

    public void setHorariofunciones(List<HorarioFuncion> horariofunciones) {
        this.horariofunciones = horariofunciones;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
    
    
    
    
    
    
}

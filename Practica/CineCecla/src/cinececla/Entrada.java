package cinececla;


import java.math.BigDecimal;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Entrada {
    
    private Date fechaHoraFuncion;
    private Date fechaHoraVenta;
    private BigDecimal precioCobrado;
    private int ticketNumero;
    private Funcion funcion;

    public Entrada(Date fechaHoraFuncion, Date fechaHoraVenta, BigDecimal precioCobrado, int ticketNumero, Funcion funcion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVenta = fechaHoraVenta;
        this.precioCobrado = precioCobrado;
        this.ticketNumero = ticketNumero;
        this.funcion = funcion;
    }

    public Date getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public Date getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public BigDecimal getPrecioCobrado() {
        return precioCobrado;
    }

    public int getTicketNumero() {
        return ticketNumero;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFechaHoraFuncion(Date fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public void setFechaHoraVenta(Date fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public void setPrecioCobrado(BigDecimal precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public void setTicketNumero(int ticketNumero) {
        this.ticketNumero = ticketNumero;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }
    
    
    
    
    
}

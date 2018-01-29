/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinececla;

import java.util.Date;

/**
 *
 * @author Diego
 */
public class HorarioFuncion {
    private int diaSemana;
    private int duracionIntervalo;
    private int diracionPublicidad;
    private boolean esTrasnoche;
    private Date horaPrimeraFuncion;
    private Date horaUltimaFuncion;

    public HorarioFuncion(int diaSemana, int duracionIntervalo, int diracionPublicidad, boolean esTrasnoche, Date horaPrimeraFuncion, Date horaUltimaFuncion) {
        this.diaSemana = diaSemana;
        this.duracionIntervalo = duracionIntervalo;
        this.diracionPublicidad = diracionPublicidad;
        this.esTrasnoche = esTrasnoche;
        this.horaPrimeraFuncion = horaPrimeraFuncion;
        this.horaUltimaFuncion = horaUltimaFuncion;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public int getDuracionIntervalo() {
        return duracionIntervalo;
    }

    public int getDiracionPublicidad() {
        return diracionPublicidad;
    }

    public boolean isEsTrasnoche() {
        return esTrasnoche;
    }

    public Date getHoraPrimeraFuncion() {
        return horaPrimeraFuncion;
    }

    public Date getHoraUltimaFuncion() {
        return horaUltimaFuncion;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setDuracionIntervalo(int duracionIntervalo) {
        this.duracionIntervalo = duracionIntervalo;
    }

    public void setDiracionPublicidad(int diracionPublicidad) {
        this.diracionPublicidad = diracionPublicidad;
    }

    public void setEsTrasnoche(boolean esTrasnoche) {
        this.esTrasnoche = esTrasnoche;
    }

    public void setHoraPrimeraFuncion(Date horaPrimeraFuncion) {
        this.horaPrimeraFuncion = horaPrimeraFuncion;
    }

    public void setHoraUltimaFuncion(Date horaUltimaFuncion) {
        this.horaUltimaFuncion = horaUltimaFuncion;
    }
    
    
    
    
    
}

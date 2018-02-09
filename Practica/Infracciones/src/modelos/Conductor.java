/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Conductor {
    private String apellido;
    private int dni;
    private LocalDate fechaNac;
    private String nombre;
    private char sexo;
    private List<Licencia> Licencias; 

    public Conductor(String apellido, int dni, LocalDate fechaNac, String nombre, char sexo, List<Licencia> Licencias) {
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.nombre = nombre;
        this.sexo = sexo;
        this.Licencias = new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    public int cuantasActasEnPeriodo(){
        return 3;
    }
    public int cuantasInsfraccionesEnPeriodo(){
        return 3;
    }
    public float cuantasDebePorInsfraccionesNoPagadas(){
        return 3.3f;
    }
    public Infraccion obtenerInsfraccionesEnPeriodo(){
        Infraccion inf = null;
        return inf;
    }
    public OrganismoEmisor orgEmisorLicenciaVigente(){
        OrganismoEmisor orgEmisor = null;
        return orgEmisor;
    }
    
}

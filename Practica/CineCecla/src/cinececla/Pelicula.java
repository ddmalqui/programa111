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
public class Pelicula {
    private Date anoEstreno;
    private boolean disponible;
    private int duracion;
    private Date fechaIngreso;
    private String Nombre;
    private String tituloOriginal;
    //relaciones
    private PaisDeOrigen paisDeOrigen;
    private Genero genero;
    private Calificacion calificacion;
    private List<Personaje> personajes;
    private List<Funcion> funciones;

    public Pelicula(Date anoEstreno, boolean disponible, int duracion, Date fechaIngreso, String Nombre, String tituloOriginal, PaisDeOrigen paisDeOrigen, Genero genero, Calificacion calificacion, List<Personaje> personajes, List<Funcion> funciones) {
        this.anoEstreno = anoEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.fechaIngreso = fechaIngreso;
        this.Nombre = Nombre;
        this.tituloOriginal = tituloOriginal;
        this.paisDeOrigen = paisDeOrigen;
        this.genero = genero;
        this.calificacion = calificacion;
        this.personajes = personajes;
        this.funciones = funciones;
    }

    public Pelicula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getAnoEstreno() {
        return anoEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public int getDuracion() {
        return duracion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public PaisDeOrigen getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public Genero getGenero() {
        return genero;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setAnoEstreno(Date anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public void setPaisDeOrigen(PaisDeOrigen paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }
    
    
    
    
    
    
}

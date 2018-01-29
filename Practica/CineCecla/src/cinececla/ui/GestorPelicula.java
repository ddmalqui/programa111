/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinececla.ui;

import cinececla.Calificacion;
import cinececla.Genero;
import cinececla.PaisDeOrigen;
import cinececla.Pelicula;
import cinececla.dao.CalificacionesDaoImpl;
import cinececla.dao.GenerosDaoImpl;
import cinececla.dao.PaisesDeOrigenDaoImpl;
import java.util.List;

/**
 *
 * @author Diego
 */
public class GestorPelicula {
    
    private final CalificacionesDaoImpl calificaciones;
    private final GenerosDaoImpl generos;
    private final PaisesDeOrigenDaoImpl paisesDeOrigen;

    public GestorPelicula() {
        this.calificaciones = new CalificacionesDaoImpl();
        this.generos = new GenerosDaoImpl();
        this.paisesDeOrigen = new PaisesDeOrigenDaoImpl();
    }
    
     public void run () {
        List<Calificacion> calificacionesList = calificaciones.ObtenerTodas();
        List<Genero> generosList = generos.ObtenerTodas();
        List<PaisDeOrigen> paisesDeOrigenList = paisesDeOrigen.ObtenerTodas();
        
        Pelicula pelicula = new Pelicula();
        
     }
     
    
}

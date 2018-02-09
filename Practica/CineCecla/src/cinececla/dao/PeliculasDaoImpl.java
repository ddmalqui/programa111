/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinececla.dao;

import cinececla.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class PeliculasDaoImpl implements PeliculasDao{
    
    private final List<Pelicula> peliculas;

    public PeliculasDaoImpl() {
        this.peliculas = new ArrayList<>();         
    }
    
    @Override
    public List<Pelicula> ObtenerTodas() {
        return this.peliculas;
    }

    @Override
    public Pelicula buscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Pelicula pelicula) {
        this.peliculas.add(pelicula);
        System.out.println("Película agregada: " + pelicula);
    }
    
    
}

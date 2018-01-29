/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinececla.dao;

import cinececla.Genero;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class GenerosDaoImpl implements GenerosDao {
    
    private final List<Genero> generos;

    public GenerosDaoImpl() {
        this.generos = new ArrayList<>();
        this.generos.add(new Genero("Drama"));
        this.generos.add(new Genero("Comedia"));
        this.generos.add(new Genero("Acción"));
    }
      

    @Override
    public List<Genero> ObtenerTodas() {
    return this.generos;
    }
    
}

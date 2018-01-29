/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Modelo {
    private String nombre;

    public Modelo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //conoce todas las marcas solo en la funcion
    //dependencia de uso!!
    public Marca queMarca(List<Marca> marcas){
        Marca marcaEncontrada = null;
        Iterator<Marca> iter = marcas.iterator();
        while(iter.hasNext()){
            Marca marcaActual = iter.next();
            if (marcaActual.soyTuMarca(this)){
            marcaEncontrada = marcaActual;
            break;
            }
        }
        
        return marcaEncontrada;
        
        
    }
}

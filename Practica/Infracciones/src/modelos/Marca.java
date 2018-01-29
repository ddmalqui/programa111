/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Marca {
    
    private String nombre;
    private List<Modelo> modelos;

    public Marca(String nombre) {
        this.nombre = nombre;
        this.modelos = new ArrayList<>();
    }

    public Marca() {
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
    
    public void agregarModelos(Modelo modelo){
        this.modelos.add(modelo);
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }

    boolean soyTuMarca(Modelo modelo) {
        return this.modelos.contains(modelo);
    }
    
}

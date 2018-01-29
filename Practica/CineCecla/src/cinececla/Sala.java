/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinececla;

/**
 *
 * @author Diego
 */
public class Sala {
    
    private int capacidad;
    private int numero;

    public Sala(int capacidad, int numero) {
        this.capacidad = capacidad;
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}

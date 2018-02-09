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
public class Personaje {
    private String nombreEnPelicula;
    private Actor actor;
    private Rol rol;

    public Personaje(String nombreEnPelicula, Actor actor, Rol rol) {
        this.nombreEnPelicula = nombreEnPelicula;
        this.actor = actor;
        this.rol = rol;
    }

    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public Actor getActor() {
        return actor;
    }

    public Rol getRol() {
        return rol;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
    
}

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
public class Actor {
    private boolean animado;
    private String apellido;
    private String Nombre;
    
    private Sexo sexo;

    public Actor(boolean animado, String apellido, String Nombre, Sexo sexo) {
        this.animado = animado;
        this.apellido = apellido;
        this.Nombre = Nombre;
        this.sexo = sexo;
    }

    public boolean isAnimado() {
        return animado;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setAnimado(boolean animado) {
        this.animado = animado;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    
    
}

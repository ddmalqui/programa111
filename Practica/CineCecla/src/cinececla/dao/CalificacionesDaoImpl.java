/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinececla.dao;

import cinececla.Calificacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class CalificacionesDaoImpl implements CalificacionesDao{
    
    private final List<Calificacion> calificaciones;

    public CalificacionesDaoImpl() {
        //Construyo la clase con los datos
        this.calificaciones = new ArrayList<>();
        this.calificaciones.add(new Calificacion("ATP"));
        this.calificaciones.add(new Calificacion("Prohibida para menores de 13 años"));
        this.calificaciones.add(new Calificacion("Prohibida para menores de 16 años"));
        this.calificaciones.add(new Calificacion("Prohibida para menores de 18 años"));        
    }
    
    @Override
    public List<Calificacion> ObtenerTodas() {
        return this.calificaciones;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinececla.dao;

import cinececla.PaisDeOrigen;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class PaisesDeOrigenDaoImpl implements PaisesDeOrigenDao {

    
    private final List<PaisDeOrigen> paisesDeOrigen;
    
    public PaisesDeOrigenDaoImpl() {
    this.paisesDeOrigen = new ArrayList<>();
        this.paisesDeOrigen.add(new PaisDeOrigen("Inglés", "Estados Unidos"));
        this.paisesDeOrigen.add(new PaisDeOrigen("Inglés", "Australia"));
        this.paisesDeOrigen.add(new PaisDeOrigen("Español", "Argentina"));
    }
    
    @Override
    public List<PaisDeOrigen> ObtenerTodas() {
       return this.paisesDeOrigen;
    }
    
    
}

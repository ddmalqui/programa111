/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Licencia {
    private LocalDateTime fechaVencimiento;
    private int numeroLicencia;
    private OrganismoEmisor OrgEmisor; 
    private List<ActaConstatacion> ActasConst; 

    public Licencia(LocalDateTime fechaVencimiento, int numeroLicencia, OrganismoEmisor OrgEmisor, List<ActaConstatacion> ActasConst) {
        this.fechaVencimiento = fechaVencimiento;
        this.numeroLicencia = numeroLicencia;
        this.OrgEmisor = OrgEmisor;
        this.ActasConst = ActasConst;
    }
    
    

    public int cuantasActasEnPeriodo(){
        return 2;
    }
    
    public int cuantasInstraccionesEnPeriodo(){
        return 2;
    }
    
    public boolean estaVencida(){
        return true;
    }
    
    public boolean estaVigente(){
        return false;
    }
    
    public ActaConstatacion getActaConstatacion(){
        ActaConstatacion actaC = null;
        return actaC;
    }
     
    public int getNumero(){
        return 4;
    }
    
    public OrganismoEmisor getOrganismoEmisor(){
        OrganismoEmisor orgEmisor = null;
        return orgEmisor;
    }
    
    public Licencia infoLicencia(){
        Licencia infoLicencia = null;
        return infoLicencia;
    }
    
    public void setActaConstatacion(){
    }
    
    public void setOrganismoEmiso(){
    }
    
    
    
}

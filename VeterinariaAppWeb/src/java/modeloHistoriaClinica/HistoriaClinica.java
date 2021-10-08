/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloHistoriaClinica;

/**
 *
 * @author usuario
 */
public class HistoriaClinica {
    
    
    
     private int id, mascota_id, fecha_creacion;
    
   
    
    public HistoriaClinica(int id, int mascota_id,int fecha_creacion){
    
        this.id=id;
        this.mascota_id=mascota_id;
        this.fecha_creacion=fecha_creacion;
        
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMascota_id() {
        return mascota_id;
    }

    public void setMascota_id(int mascota_id) {
        this.mascota_id = mascota_id;
    }

    public int getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(int fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloHistoriaClinica;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class HistoriaClinicaDAO {
    
    Connection conexion;
        
    public HistoriaClinicaDAO()  {
        Conexion con=new Conexion();
        conexion = con.getConexion();
    }

    public List<HistoriaClinica>listarHistoriaClinica(){

        PreparedStatement ps;
        ResultSet rs;
        List<HistoriaClinica> lista =new ArrayList <>();
        try {
            
            ps= conexion.prepareStatement("Select id, mascota_id, fecha_creacion FROM  veterinaria.historia_clinica");
            rs =  ps.executeQuery();
            while(rs.next()){
            
                int id=rs.getInt("id");
                int  mascota_id=rs.getInt("mascota_id");
                int  fecha_creacion=rs.getInt("fecha_creacion");
                                          
                HistoriaClinica hclinica =new HistoriaClinica( id,  mascota_id,  fecha_creacion);
                
                lista.add(hclinica);
                
            }
            
            return lista;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }

    }
    
        
    public HistoriaClinica mostrarHistoriaClinica(int _id){

        PreparedStatement ps;
        ResultSet rs;
        HistoriaClinica hclinica = null;

        try {
            
            ps= conexion.prepareStatement("Select id, mascota_id, fecha_creacion FROM  veterinaria.historia_clinica WHERE id=? ");
            ps.setInt(1,_id);
            rs =  ps.executeQuery();

            while(rs.next()){
            
                int id=rs.getInt("id");
                
                int  mascota_id=rs.getInt("mascota_id");
                
                int  fecha_creacion=rs.getInt("fecha_creacion");
                
                           
                hclinica =new HistoriaClinica( id,  mascota_id,  fecha_creacion);
                
            }
            
            return hclinica;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }

    }
    
    public boolean  insertar (HistoriaClinica hclinica){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("INSERT INTO veterinaria.historia_clinica ( mascota_id, fecha_creacion) VALUES (?, ?);");
            ps.setInt(1,hclinica.getMascota_id());
            ps.setInt(2,hclinica.getFecha_creacion());
            
            ps.execute();

            
            
            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
    public boolean  actualizar (HistoriaClinica hclinica){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("UPDATE  veterinaria.historia_clinica SET  mascota_id=?,fecha_creacion=? WHERE id=? ");
            
            ps.setInt(1,hclinica.getMascota_id());
            ps.setInt(2,hclinica.getFecha_creacion());
            ps.setInt(3,hclinica.getId());
            ps.execute();

            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
    public boolean  eliminar (int _id){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("DELETE FROM  veterinaria.historia_clinica WHERE id=? ");
          
            ps.setInt(1, _id);
            ps.execute();
                       
            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
}

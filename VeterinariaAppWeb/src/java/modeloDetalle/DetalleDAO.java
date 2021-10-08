/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDetalle;

import config.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class DetalleDAO {
    
    
    Connection conexion;
        
    public DetalleDAO()  {
        Conexion con=new Conexion();
        conexion = con.getConexion();
    }

    public List<Detalle>listarDetalle(){

        PreparedStatement ps;
        ResultSet rs;
        List<Detalle> lista =new ArrayList <>();
        try {
            
            ps= conexion.prepareStatement("Select id, temperatura,  peso, frecuencia_cardiaca,  frecuencia_respiratoria,  fecha_hora,    alimentacion,  habitad,  observacion,  colaborador_id,   historia_clinica_id FROM  veterinaria.detalle_historia_clinica");
            rs =  ps.executeQuery();
            while(rs.next()){
            
                int id=rs.getInt("id");
                String  temperatura=rs.getString("temperatura");
                double  peso=rs.getDouble("peso");
                double  frecuencia_cardiaca=rs.getDouble("frecuencia_cardiaca");
                double  frecuencia_respiratoria=rs.getDouble("frecuencia_respiratoria");
                Date  fecha_hora=rs.getDate("fecha_hora");
                String  alimentacion=rs.getString("alimentacion");
                String  habitad=rs.getString("habitad");
                String  observacion=rs.getString("observacion");
                
                int  colaborador_id=rs.getInt("colaborador_id");
                
                int  historia_clinica_id=rs.getInt("historia_clinica_id");
                           
                Detalle detalle =new Detalle(id, temperatura,  peso, frecuencia_cardiaca,  frecuencia_respiratoria,  fecha_hora,   alimentacion,  habitad, observacion,  colaborador_id,  historia_clinica_id );
                
                lista.add(detalle);
                
            }
            
            return lista;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }

    }
    
        
    public Detalle mostrarDetalle(int _id){

        PreparedStatement ps;
        ResultSet rs;
        Detalle detalle = null;

        try {
            
            ps= conexion.prepareStatement("Select id, temperatura,  peso, frecuencia_cardiaca,  frecuencia_respiratoria,  fecha_hora,   alimentacion,  habitad, observacion,  colaborador_id,  historia_clinica_id FROM  veterinaria.detalle_historia_clinica WHERE id=? ");
            ps.setInt(1,_id);
            rs =  ps.executeQuery();

            while(rs.next()){
            
                int id=rs.getInt("id");
                String  temperatura=rs.getString("temperatura");
                double  peso=rs.getDouble("peso");
                double  frecuencia_cardiaca=rs.getDouble("frecuencia_cardiaca");
                double  frecuencia_respiratoria=rs.getDouble("frecuencia_respiratoria");
                Date  fecha_hora=rs.getDate("fecha_hora");
                String  alimentacion=rs.getString("alimentacion");
                String  habitad=rs.getString("habitad");
                String  observacion=rs.getString("observacion");
                
                int  colaborador_id=rs.getInt("colaborador_id");
                
                int  historia_clinica_id=rs.getInt("historia_clinica_id");
                           
                detalle =new Detalle(id, temperatura,  peso, frecuencia_cardiaca,  frecuencia_respiratoria,  fecha_hora,   alimentacion,  habitad, observacion,  colaborador_id,  historia_clinica_id );
                
                
                
                
                
            }
            
            return detalle;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }

    }
    
    public boolean  insertar (Detalle detalle){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("INSERT INTO veterinaria.detalle_historia_clinica (id, temperatura,  peso, frecuencia_cardiaca,  frecuencia_respiratoria,  fecha_hora,   alimentacion,  habitad, observacion,  colaborador_id,  historia_clinica_id) VALUES (?, ?, ?, ?, ?,?, ?, ?, ?, ?,?);");
            
            ps.setInt(1,detalle.getId());
            ps.setString(2,detalle.getTemperatura());
            ps.setDouble(3,detalle.getPeso());
            ps.setDouble(4,detalle.getFrecuencia_cardiaca());
            ps.setDouble(5,detalle.getFrecuencia_respiratoria());
            ps.setDate(6,detalle.getFecha_hora());
            ps.setString(7,detalle.getAlimentacion());
            ps.setString(8,detalle.getHabitad());
            ps.setString(9,detalle.getObservacion());
            ps.setInt(10,detalle.getColaborador_id());
            ps.setInt(6,detalle.getHistoria_clinica_id());
            
            ps.execute();

            
            
            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
    public boolean  actualizar (Detalle detalle){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("UPDATE  veterinaria.detalle_historia_clinica SET temperatura=?,  peso=?, frecuencia_cardiaca=?,  frecuencia_respiratoria=?,  fecha_hora=?,   alimentacion=?,  habitad=?, observacion=?,  colaborador_id=?,  historia_clinica_id=? WHERE id=? ");
                        
            ps.setString(1,detalle.getTemperatura());
            ps.setDouble(2,detalle.getPeso());
            ps.setDouble(3,detalle.getFrecuencia_cardiaca());
            ps.setDouble(4,detalle.getFrecuencia_respiratoria());
            ps.setDate(5,detalle.getFecha_hora());
            ps.setString(6,detalle.getAlimentacion());
            ps.setString(7,detalle.getHabitad());
            ps.setString(8,detalle.getObservacion());
            ps.setInt(9,detalle.getColaborador_id());
            ps.setInt(10,detalle.getHistoria_clinica_id());
            ps.setInt(11,detalle.getId());
            
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
            
            ps= conexion.prepareStatement("DELETE FROM  veterinaria.detalle_historia_clinica WHERE id=? ");
          
            ps.setInt(1, _id);
            ps.execute();
                       
            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
}

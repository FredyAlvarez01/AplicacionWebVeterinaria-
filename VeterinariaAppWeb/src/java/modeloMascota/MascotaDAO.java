/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloMascota;

import com.mysql.cj.xdevapi.Result;
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
public class MascotaDAO {

    
    Connection conexion;
        
    public MascotaDAO()  {
        Conexion con=new Conexion();
        conexion = con.getConexion();
    }

    public List<Mascota>listarMascota(){

        PreparedStatement ps;
        ResultSet rs;
        List<Mascota> lista =new ArrayList <>();
        try {
            
            ps= conexion.prepareStatement("Select id, nombre, raza, usuario_id, sexo FROM  veterinaria.mascota");
            rs =  ps.executeQuery();
            while(rs.next()){
            
                int id=rs.getInt("id");
                String  nombre=rs.getString("nombre");
                String  raza=rs.getString("raza");
                
                int  usuario_id=rs.getInt("usuario_id");
                
                String sexo=rs.getString("sexo");
                           
                Mascota mascota =new Mascota( id,  nombre, raza ,usuario_id, sexo);
                
                lista.add(mascota);
                
            }
            
            return lista;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }

    }
    
        
    public Mascota mostrarMascota(int _id){

        PreparedStatement ps;
        ResultSet rs;
        Mascota mascota = null;

        try {
            
            ps= conexion.prepareStatement("Select id, nombre, raza,   usuario_id, sexo  FROM  veterinaria.mascota WHERE id=? ");
            ps.setInt(1,_id);
            rs =  ps.executeQuery();

            while(rs.next()){
            
                int id=rs.getInt("id");
                String  nombre=rs.getString("nombre");
                String  raza=rs.getString("raza");
                
                int  usuario_id=rs.getInt("usuario_id");
                
                String sexo=rs.getString("sexo");
                           
                mascota =new Mascota( id,  nombre,  raza,usuario_id ,sexo);
                
                
                
            }
            
            return mascota;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }

    }
    
    public boolean  insertar (Mascota mascota){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("INSERT INTO veterinaria.mascota (id, nombre, raza, usuario_id, sexo) VALUES (?, ?, ?, ?, ?);");
            ps.setInt(1,mascota.getId());
            ps.setString(2,mascota.getNombre());
            ps.setString(3,mascota.getRaza());
            ps.setInt(4,mascota.getUsuario_id());
            ps.setString(5,mascota.getSexo());
            ps.execute();

            
            
            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
    public boolean  actualizar (Mascota mascota){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("UPDATE  veterinaria.mascota SET nombre=?, raza=?,usuario_id=?, sexo=? WHERE id=? ");
            
            ps.setString(1,mascota.getNombre());
            ps.setString(2,mascota.getRaza());
            ps.setInt(3,mascota.getUsuario_id());
            ps.setString(4,mascota.getSexo());
            ps.setInt(5,mascota.getId());
            
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
            
            ps= conexion.prepareStatement("DELETE FROM  mascota WHERE id=? ");
          
            ps.setInt(1, _id);
            ps.execute();
                       
            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
}
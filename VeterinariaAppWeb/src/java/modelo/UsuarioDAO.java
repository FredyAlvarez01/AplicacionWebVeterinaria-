/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class UsuarioDAO {

    
    Connection conexion;
        
    public UsuarioDAO()  {
        Conexion con=new Conexion();
        conexion = con.getConexion();
    }

    public List<Usuario>listarUsuario(){

        PreparedStatement ps;
        ResultSet rs;
        List<Usuario> lista =new ArrayList <>();
        try {
            
            ps= conexion.prepareStatement("Select id, nombre, apellido, tipo_documento, documento_identificacion, estado, sexo FROM  veterinaria.usuario");
            rs =  ps.executeQuery();
            while(rs.next()){
            
                int id=rs.getInt("id");
                String  nombre=rs.getString("nombre");
                String  apellido=rs.getString("apellido");
                String  tipo_documento=rs.getString("tipo_documento");
                int  documento_identificacion=rs.getInt("documento_identificacion");
                String estado=rs.getString("estado");
                String sexo=rs.getString("sexo");
                           
                Usuario usuario =new Usuario( id,  nombre,  apellido,tipo_documento, documento_identificacion, estado, sexo);
                
                lista.add(usuario);
                
            }
            
            return lista;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }

    }
    
        
    public Usuario mostrarUsuario(int _id){

        PreparedStatement ps;
        ResultSet rs;
        Usuario usuario = null;

        try {
            
            ps= conexion.prepareStatement("Select id, nombre, apellido,tipo_documento , documento_identificacion, estado, sexo FROM  veterinaria.usuario WHERE ID=? ");
            ps.setInt(1,_id);
            rs =  ps.executeQuery();

            while(rs.next()){
            
                int id=rs.getInt("id");
                String  nombre=rs.getString("nombre");
                String  apellido=rs.getString("apellido");
                String  tipo_documento=rs.getString("tipo_documento");
                int  documento_identificacion=rs.getInt("documento_identificacion");
                String estado=rs.getString("estado");
                String sexo=rs.getString("sexo");
                           
                usuario =new Usuario( id,  nombre,  apellido,tipo_documento ,documento_identificacion, estado, sexo);
                
                
                
            }
            
            return usuario;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }

    }
    
    public boolean  insertar (Usuario usuario){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("INSERT INTO veterinaria.usuario (nombre, apellido, tipo_documento, documento_identificacion, estado, sexo) VALUES (?, ?, ?, ?, ?, ?);");
            ps.setString(1,usuario.getNombre());
            ps.setString(2,usuario.getApellido());
            ps.setString(3,usuario.getTipo_documento());
            ps.setInt(4,usuario.getDocumento_identificacion());
            ps.setString(5,usuario.getEstado());
            ps.setString(6,usuario.getSexo());
            ps.execute();

            
            
            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
    public boolean  actualizar (Usuario usuario){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("UPDATE  veterinaria.usuario SET nombre=?, apellido=?,tipo_documento=?, documento_identificacion=?, estado=?, sexo=? WHERE id=? ");
            ps.setString(1,usuario.getNombre());
            ps.setString(2,usuario.getApellido());
            ps.setString(3,usuario.getTipo_documento());
            ps.setInt(4,usuario.getDocumento_identificacion());
            ps.setString(5,usuario.getEstado());
            ps.setString(6,usuario.getSexo());
            ps.setInt(7,usuario.getId());
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
            
            ps= conexion.prepareStatement("DELETE FROM  usuario WHERE id=? ");
          
            ps.setInt(1, _id);
            ps.execute();
                       
            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
}



    
    

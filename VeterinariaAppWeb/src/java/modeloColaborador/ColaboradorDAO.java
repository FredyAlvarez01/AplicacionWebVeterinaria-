/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloColaborador;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author colaborador
 */
public class ColaboradorDAO {
    
    Connection conexion;
        
    public ColaboradorDAO()  {
        Conexion con=new Conexion();
        conexion = con.getConexion();
    }

    public List<Colaborador>listarColaborador(){

        PreparedStatement ps;
        ResultSet rs;
        List<Colaborador> lista =new ArrayList <>();
        try {
            
            ps= conexion.prepareStatement("Select id,  nombre, apellido, cargo,  especialidad,  tipo_documento,  documento_identificacion FROM  veterinaria.colaborador");
            rs =  ps.executeQuery();
            while(rs.next()){
            
                int id=rs.getInt("id");
                String  nombre=rs.getString("nombre");
                String  apellido=rs.getString("apellido");
                String  cargo=rs.getString("cargo");
                String  especialidad=rs.getString("especialidad");
                String tipo_documento=rs.getString("tipo_documento");
                int documento_identificacion=rs.getInt("documento_identificacion");
                           
                Colaborador colaborador =new Colaborador( id,  nombre, apellido, cargo,  especialidad,  tipo_documento,  documento_identificacion);
                
                lista.add(colaborador);
                
            }
            
            return lista;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }

    }
    
        
    public Colaborador mostrarColaborador(int _id){

        PreparedStatement ps;
        ResultSet rs;
        Colaborador colaborador = null;

        try {
            
            ps= conexion.prepareStatement("Select id,  nombre, apellido, cargo,  especialidad,  tipo_documento,  documento_identificacion FROM  veterinaria.colaborador WHERE ID=? ");
            ps.setInt(1,_id);
            rs =  ps.executeQuery();

            while(rs.next()){
            
                int id=rs.getInt("id");
                String  nombre=rs.getString("nombre");
                String  apellido=rs.getString("apellido");
                String  cargo=rs.getString("cargo");
                String  especialidad=rs.getString("especialidad");
                String tipo_documento=rs.getString("tipo_documento");
                int documento_identificacion=rs.getInt("documento_identificacion");
                           
                colaborador =new Colaborador( id,  nombre, apellido, cargo,  especialidad,  tipo_documento,  documento_identificacion);
                
                
                
            }
            
            return colaborador;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return null;
        }

    }
    
    public boolean  insertar (Colaborador colaborador){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("INSERT INTO veterinaria.colaborador (nombre, apellido, cargo,  especialidad,  tipo_documento,  documento_identificacion) VALUES (?, ?, ?, ?, ?, ?);");
            ps.setString(1,colaborador.getNombre());
            ps.setString(2,colaborador.getApellido());
            ps.setString(3,colaborador.getCargo());
            ps.setString(4,colaborador.getEspecialidad());
            ps.setString(5,colaborador.getTipo_documento());
            ps.setInt(6,colaborador.getDocumento_identificacion());
            
            ps.execute();

            
            
            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
    public boolean  actualizar (Colaborador colaborador){

        PreparedStatement ps;
        
        

        try {
            
            ps= conexion.prepareStatement("UPDATE  veterinaria.colaborador SET nombre=?, apellido=?, cargo=?,  especialidad=?,  tipo_documento=?,  documento_identificacion=? WHERE id=? ");
            ps.setString(1,colaborador.getNombre());
            ps.setString(2,colaborador.getApellido());
            ps.setString(3,colaborador.getCargo());
            ps.setString(4,colaborador.getEspecialidad());
            ps.setString(5,colaborador.getTipo_documento());
            ps.setInt(6,colaborador.getDocumento_identificacion());
            ps.setInt(7,colaborador.getId());
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
            
            ps= conexion.prepareStatement("DELETE FROM  colaborador WHERE id=? ");
          
            ps.setInt(1, _id);
            ps.execute();
                       
            return true;
            
        }catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
        }

    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloColaborador;

/**
 *
 * @author usuario
 */
public class Colaborador {
    
     private int id, documento_identificacion;
    
    private String nombre, apellido, cargo, especialidad, tipo_documento;
    
    public Colaborador(int id, String nombre,String apellido,String cargo, String especialidad, String tipo_documento, int documento_identificacion){
    
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.cargo=cargo;
        this.especialidad=especialidad;
        this.tipo_documento=tipo_documento;
        this.documento_identificacion=documento_identificacion;
       
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocumento_identificacion() {
        return documento_identificacion;
    }

    public void setDocumento_identificacion(int documento_identificacion) {
        this.documento_identificacion = documento_identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
    
}

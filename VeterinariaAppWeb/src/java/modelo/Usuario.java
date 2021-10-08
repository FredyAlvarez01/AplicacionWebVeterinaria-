/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Usuario {
    
    private int id, documento_identificacion;
    
    private String nombre, apellido, estado, sexo, tipo_documento;
    
    public Usuario(int id, String nombre,String apellido,String tipo_documento, int documento_identificacion, String estado, String sexo){
    
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.tipo_documento=tipo_documento;
        this.documento_identificacion=documento_identificacion;
        this.estado=estado;
        this.sexo=sexo;
    
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    
}

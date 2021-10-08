/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloMascota;

/**
 *
 * @author usuario
 */


public class Mascota {
    
    private int id, usuario_id;
    
    private String nombre, raza, sexo;
    
    public Mascota(int id, String nombre,String raza, int usuario_id, String sexo){
    
        this.id=id;
        this.nombre=nombre;
        this.raza=raza;
        this.usuario_id=usuario_id;
        this.sexo=sexo;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
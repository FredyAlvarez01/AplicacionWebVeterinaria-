/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDetalle;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class Detalle {

    
       private int id, colaborador_id, historia_clinica_id;
       private double peso, frecuencia_cardiaca, frecuencia_respiratoria;
       private String temperatura, alimentacion, habitad, observacion; 
       private Date fecha_hora;
    

    
    public Detalle(int id, String temperatura, double peso,double frecuencia_cardiaca, double frecuencia_respiratoria, Date fecha_hora,   String alimentacion, String habitad, String observacion,int  colaborador_id, int  historia_clinica_id ){
    
        this.id=id;
        this.temperatura=temperatura;
        this.peso=peso;                             
        this.frecuencia_cardiaca=frecuencia_cardiaca;           
        this.frecuencia_respiratoria=frecuencia_respiratoria;
                this.fecha_hora=fecha_hora;         
                this.alimentacion=alimentacion;
                this.habitad=habitad;           
                this.observacion=observacion;       
                this.colaborador_id=colaborador_id;             
                this.historia_clinica_id=historia_clinica_id;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColaborador_id() {
        return colaborador_id;
    }

    public void setColaborador_id(int colaborador_id) {
        this.colaborador_id = colaborador_id;
    }

    public int getHistoria_clinica_id() {
        return historia_clinica_id;
    }

    public void setHistoria_clinica_id(int historia_clinica_id) {
        this.historia_clinica_id = historia_clinica_id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFrecuencia_cardiaca() {
        return frecuencia_cardiaca;
    }

    public void setFrecuencia_cardiaca(double frecuencia_cardiaca) {
        this.frecuencia_cardiaca = frecuencia_cardiaca;
    }

    public double getFrecuencia_respiratoria() {
        return frecuencia_respiratoria;
    }

    public void setFrecuencia_respiratoria(double frecuencia_respiratoria) {
        this.frecuencia_respiratoria = frecuencia_respiratoria;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }
}

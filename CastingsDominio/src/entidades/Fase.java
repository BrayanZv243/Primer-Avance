/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author lv1822
 */
public class Fase {
    Date fechaInicio;
    Date fechaFin;
    Candidato candidato;
    Prueba prueba;

    public Fase(Date fechaInicio, Date fechaFin, Candidato candidato, Prueba prueba) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.candidato = candidato;
        this.prueba = prueba;
    }

    public Fase() {
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    @Override
    public String toString() {
        return "Fase{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", candidato=" + candidato + ", prueba=" + prueba + '}';
    }
    
}

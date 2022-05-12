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
    Casting codigoCasting;
    Candidato codigoCantidato;
    Prueba prueba;

    public Fase(Date fechaInicio, Date fechaFin, Casting codigoCasting, Candidato codigoCantidato, Prueba prueba) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.codigoCasting = codigoCasting;
        this.codigoCantidato = codigoCantidato;
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

    public Casting getCodigoCasting() {
        return codigoCasting;
    }

    public void setCodigoCasting(Casting codigoCasting) {
        this.codigoCasting = codigoCasting;
    }

    public Candidato getCodigoCantidato() {
        return codigoCantidato;
    }

    public void setCodigoCantidato(Candidato codigoCantidato) {
        this.codigoCantidato = codigoCantidato;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    @Override
    public String toString() {
        return "Fase{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", codigoCasting=" + codigoCasting + ", codigoCantidato=" + codigoCantidato + ", prueba=" + prueba + '}';
    }
    
    
}

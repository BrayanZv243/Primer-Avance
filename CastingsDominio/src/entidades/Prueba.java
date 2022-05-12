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
public class Prueba {
    Date fecha;
    Direccion descripcion;
    boolean aprobado;
    Sala sala;

    public Prueba(Date fecha, Direccion descripcion, boolean aprobado, Sala sala) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.aprobado = aprobado;
        this.sala = sala;
    }

    public Prueba() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Direccion getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Direccion descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Prueba{" + "fecha=" + fecha + ", descripcion=" + descripcion + ", aprobado=" + aprobado + ", sala=" + sala + '}';
    }
    
    
    
}

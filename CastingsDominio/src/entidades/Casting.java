/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Casting {
    boolean aprobado;
    float costo;
    String codigo;
    String nombre;
    String descripcion;
    Date fechaContrato;
    Date fechaHoraInicio;
    Date fechaHoraFin;
    CastingOnline castingOnline;
    CastingPresencial castingPresencial;
    ArrayList<Perfil> perfiles;
    Cliente cliente;
    Agente agente;

    public Casting() {
    }

    public Casting(boolean aprobado, float costo, String codigo, String nombre, 
            String descripcion, Date fechaContrato, Date fechaHoraInicio, Date fechaHoraFin, 
            CastingOnline castingOnline, ArrayList<Perfil> perfiles, Cliente cliente, Agente agente) {
        this.aprobado = aprobado;
        this.costo = costo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaContrato = fechaContrato;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.castingOnline = castingOnline;
        this.perfiles = perfiles;
        this.cliente = cliente;
        this.agente = agente;
    }

    public Casting(boolean aprobado, float costo, String codigo, String nombre, String descripcion, 
            Date fechaContrato, Date fechaHoraInicio, Date fechaHoraFin, CastingPresencial castingPresencial, 
            ArrayList<Perfil> perfiles, Cliente cliente, Agente agente) {
        this.aprobado = aprobado;
        this.costo = costo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaContrato = fechaContrato;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.castingPresencial = castingPresencial;
        this.perfiles = perfiles;
        this.cliente = cliente;
        this.agente = agente;
    }
    
    public Casting(String codigo) {
        this.codigo = codigo;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public CastingOnline getCastingOnline() {
        return castingOnline;
    }

    public void setCastingOnline(CastingOnline castingOnline) {
        this.castingOnline = castingOnline;
    }

    public CastingPresencial getCastingPresencial() {
        return castingPresencial;
    }

    public void setCastingPresencial(CastingPresencial castingPresencial) {
        this.castingPresencial = castingPresencial;
    }

    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    @Override
    public String toString() {
        return "Casting{" + "aprobado=" + aprobado + ", costo=" + costo + ", codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaContrato=" + fechaContrato + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraFin=" + fechaHoraFin + ", castingOnline=" + castingOnline + ", castingPresencial=" + castingPresencial + ", perfiles=" + perfiles + ", cliente=" + cliente + ", agente=" + agente + '}';
    }
}

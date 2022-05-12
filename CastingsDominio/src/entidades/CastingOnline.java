/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lv1822
 */
public class CastingOnline extends Casting {
    String enlace;
    int asistente;
    
    public CastingOnline(String enlace, int asistente) {
        this.enlace = enlace;
        this.asistente = asistente;
    }

    @Override
    public String toString() {
        return "CastingOnline{" + "enlace=" + enlace + ", asistente=" + asistente + '}';
    }

    public CastingOnline() {
    }

    public CastingOnline(boolean aprobado, float costo, String codigo, String nombre, String descripcion, Date fechaContrato, Date fechaHoraInicio, Date fechaHoraFin, CastingOnline castingOnline, ArrayList<Perfil> perfiles, Cliente cliente, Agente agente) {
        super(aprobado, costo, codigo, nombre, descripcion, fechaContrato, fechaHoraInicio, fechaHoraFin, castingOnline, perfiles, cliente, agente);
    }

    public CastingOnline(boolean aprobado, float costo, String codigo, String nombre, String descripcion, Date fechaContrato, Date fechaHoraInicio, Date fechaHoraFin, CastingPresencial castingPresencial, ArrayList<Perfil> perfiles, Cliente cliente, Agente agente) {
        super(aprobado, costo, codigo, nombre, descripcion, fechaContrato, fechaHoraInicio, fechaHoraFin, castingPresencial, perfiles, cliente, agente);
    }

    public CastingOnline(String codigo) {
        super(codigo);
    }

    

    public CastingOnline(String enlace, int asistente, String codigo) {
        super(codigo);
        this.enlace = enlace;
        this.asistente = asistente;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public int getAsistente() {
        return asistente;
    }

    public void setAsistente(int asistente) {
        this.asistente = asistente;
    }

    @Override
    public boolean isAprobado() {
        return aprobado;
    }

    @Override
    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    @Override
    public float getCosto() {
        return costo;
    }

    @Override
    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public Date getFechaContrato() {
        return fechaContrato;
    }

    @Override
    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    @Override
    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    @Override
    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    @Override
    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    @Override
    public CastingOnline getCastingOnline() {
        return castingOnline;
    }

    @Override
    public void setCastingOnline(CastingOnline castingOnline) {
        this.castingOnline = castingOnline;
    }

    @Override
    public CastingPresencial getCastingPresencial() {
        return castingPresencial;
    }

    @Override
    public void setCastingPresencial(CastingPresencial castingPresencial) {
        this.castingPresencial = castingPresencial;
    }
    
    @Override
    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    @Override
    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public Agente getAgente() {
        return agente;
    }

    @Override
    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    
}

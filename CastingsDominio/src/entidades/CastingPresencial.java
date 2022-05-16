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
public class CastingPresencial extends Casting {

    int numPersonas;
    Sala sala;

    public CastingPresencial() {
    }

    public CastingPresencial(int numPersonas, Sala sala) {
        this.numPersonas = numPersonas;
        this.sala = sala;
    }

    public CastingPresencial(int numPersonas, Sala sala, boolean aprobado, float costo, 
            String codigo, String nombre, String descripcion, Date fechaContrato, Date fechaHoraInicio, Date fechaHoraFin, 
            CastingPresencial castingPresencial, Cliente cliente, Agente agente, ArrayList<Fase> fase) {
        
        super(aprobado, costo, codigo, nombre, descripcion, fechaContrato, fechaHoraInicio, fechaHoraFin, castingPresencial, 
                cliente, agente, fase);
        
        this.numPersonas = numPersonas;
        this.sala = sala;
    }

    public CastingPresencial(int numPersonas, Sala sala, boolean aprobado, float costo, String codigo, String nombre, 
            String descripcion, Date fechaContrato, Date fechaHoraInicio, Date fechaHoraFin, CastingOnline castingOnline, 
            Cliente cliente, Agente agente, ArrayList<Fase> fase) {
        
        super(aprobado, costo, codigo, nombre, descripcion, fechaContrato, fechaHoraInicio, fechaHoraFin, castingOnline, 
                cliente, agente, fase);
        
        this.numPersonas = numPersonas;
        this.sala = sala;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
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

    public ArrayList<Fase> getFase() {
        return fase;
    }

    public void setFase(ArrayList<Fase> fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        return "CastingPresencial{" + "numPersonas=" + numPersonas + ", sala=" + sala + '}';
    }

    

}

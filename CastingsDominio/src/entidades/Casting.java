/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

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
    ArrayList<Fase> fase;

    public Casting() {
    }

    public Casting(boolean aprobado, float costo, String codigo, String nombre, String descripcion,
            Date fechaContrato, Date fechaHoraInicio, Date fechaHoraFin, CastingPresencial castingPresencial,
            Cliente cliente, Agente agente, ArrayList<Fase> fase) {
        this.aprobado = aprobado;
        this.costo = costo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaContrato = fechaContrato;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.castingPresencial = castingPresencial;
        this.cliente = cliente;
        this.agente = agente;
        this.fase = fase;
    }

    public Casting(boolean aprobado, float costo, String codigo, String nombre, String descripcion,
            Date fechaContrato, Date fechaHoraInicio, Date fechaHoraFin, CastingOnline castingOnline,
            Cliente cliente, Agente agente, ArrayList<Fase> fase) {
        this.aprobado = aprobado;
        this.costo = costo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaContrato = fechaContrato;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.castingOnline = castingOnline;
        this.cliente = cliente;
        this.agente = agente;
        this.fase = fase;
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
        String toString = "-Cliente: " + nombre + "  -Agente: " + agente.getNombre();
        String resultado = castingPresencial != null ? "  -Tipo: Presencial" : "  -Tipo: Online";

        toString += resultado;

        return toString;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.aprobado ? 1 : 0);
        hash = 83 * hash + Float.floatToIntBits(this.costo);
        hash = 83 * hash + Objects.hashCode(this.codigo);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.descripcion);
        hash = 83 * hash + Objects.hashCode(this.fechaContrato);
        hash = 83 * hash + Objects.hashCode(this.fechaHoraInicio);
        hash = 83 * hash + Objects.hashCode(this.fechaHoraFin);
        hash = 83 * hash + Objects.hashCode(this.castingOnline);
        hash = 83 * hash + Objects.hashCode(this.castingPresencial);
        hash = 83 * hash + Objects.hashCode(this.perfiles);
        hash = 83 * hash + Objects.hashCode(this.cliente);
        hash = 83 * hash + Objects.hashCode(this.agente);
        hash = 83 * hash + Objects.hashCode(this.fase);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Casting other = (Casting) obj;
        if (this.aprobado != other.aprobado) {
            return false;
        }
        if (Float.floatToIntBits(this.costo) != Float.floatToIntBits(other.costo)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.fechaContrato, other.fechaContrato)) {
            return false;
        }
        if (!Objects.equals(this.fechaHoraInicio, other.fechaHoraInicio)) {
            return false;
        }
        if (!Objects.equals(this.fechaHoraFin, other.fechaHoraFin)) {
            return false;
        }
        if (!Objects.equals(this.castingOnline, other.castingOnline)) {
            return false;
        }
        if (!Objects.equals(this.castingPresencial, other.castingPresencial)) {
            return false;
        }
        if (!Objects.equals(this.perfiles, other.perfiles)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.agente, other.agente)) {
            return false;
        }
        if (!Objects.equals(this.fase, other.fase)) {
            return false;
        }
        return true;
    }
    
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lv1822
 */
public class CandidadoAceptado {
    Candidato aprobado[];
    Casting castingAprobado[];

    public CandidadoAceptado(Candidato[] aprobado, Casting[] castingAprobado) {
        this.aprobado = aprobado;
        this.castingAprobado = castingAprobado;
    }

    public CandidadoAceptado() {
    }

    public Candidato[] getAprobado() {
        return aprobado;
    }

    public void setAprobado(Candidato[] aprobado) {
        this.aprobado = aprobado;
    }

    public Casting[] getCastingAprobado() {
        return castingAprobado;
    }

    public void setCastingAprobado(Casting[] castingAprobado) {
        this.castingAprobado = castingAprobado;
    }

    @Override
    public String toString() {
        return "CandidadoAceptado{" + "aprobado=" + aprobado + ", castingAprobado=" + castingAprobado + '}';
    }
    
}

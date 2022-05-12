/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author lv1822
 */
public class Candidato extends Persona{
    String codigo;
    Contacto contacto;
    Date fechaNacimiento;
    Image fotografia;
    Representante representante;
    Perfil perfil;
    Prueba prueba;

    public Candidato(String codigo, Contacto contacto, Date fechaNacimiento, Image fotografia, Representante representante, Perfil perfil, Prueba prueba) {
        this.codigo = codigo;
        this.contacto = contacto;
        this.fechaNacimiento = fechaNacimiento;
        this.fotografia = fotografia;
        this.representante = representante;
        this.perfil = perfil;
        this.prueba = prueba;
    }

    public Candidato(String codigo, Contacto contacto, Date fechaNacimiento, Image fotografia, Representante representante, Perfil perfil, Prueba prueba, String nombre, String telefono, String curp, String rfc, Direccion direccion) {
        super(nombre, telefono, curp, rfc, direccion);
        this.codigo = codigo;
        this.contacto = contacto;
        this.fechaNacimiento = fechaNacimiento;
        this.fotografia = fotografia;
        this.representante = representante;
        this.perfil = perfil;
        this.prueba = prueba;
    }

    

    public Candidato() {
    }

    public Candidato(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Image getFotografia() {
        return fotografia;
    }

    public void setFotografia(Image fotografia) {
        this.fotografia = fotografia;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    @Override
    public String toString() {
        return "Candidato{" + "codigo=" + codigo + ", contacto=" + contacto + ", fechaNacimiento=" + fechaNacimiento + ", fotografia=" + fotografia + ", representante=" + representante + ", perfil=" + perfil + ", prueba=" + prueba + '}';
    }
    
    
}

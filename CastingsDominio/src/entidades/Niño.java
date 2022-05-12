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
public class Niño extends Candidato{
    Contacto contactoTutor;

    public Niño() {
    }

    public Niño(Contacto contactoTutor, String codigo, Contacto contacto, Date fechaNacimiento, Image fotografia, Representante representante, Perfil perfil, Prueba prueba) {
        super(codigo, contacto, fechaNacimiento, fotografia, representante, perfil, prueba);
        this.contactoTutor = contactoTutor;
    }

    public Niño(Contacto contactoTutor, String codigo, Contacto contacto, Date fechaNacimiento, Image fotografia, Representante representante, Perfil perfil, Prueba prueba, String nombre, String telefono, String curp, String rfc, Direccion direccion) {
        super(codigo, contacto, fechaNacimiento, fotografia, representante, perfil, prueba, nombre, telefono, curp, rfc, direccion);
        this.contactoTutor = contactoTutor;
    }

    public Niño(Contacto contactoTutor) {
        this.contactoTutor = contactoTutor;
    }

    public Niño(Contacto contactoTutor, String codigo) {
        super(codigo);
        this.contactoTutor = contactoTutor;
    }

    public Contacto getContactoTutor() {
        return contactoTutor;
    }

    public void setContactoTutor(Contacto contactoTutor) {
        this.contactoTutor = contactoTutor;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Ni\u00f1o{" + "contactoTutor=" + contactoTutor + '}';
    }

    
    
    
}

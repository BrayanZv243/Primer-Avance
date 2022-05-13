/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author lv1822
 */
public class Candidato extends Persona{
    String codigo;
    Contacto contacto;
    Date fechaNacimiento;
    byte[] fotografia;
    Representante representante;
    ArrayList<Perfil> perfiles;
    boolean aprobado;

    public Candidato(String codigo, Contacto contacto, Date fechaNacimiento, byte[] fotografia, Representante representante, ArrayList<Perfil> perfiles, boolean aprobado) {
        this.codigo = codigo;
        this.contacto = contacto;
        this.fechaNacimiento = fechaNacimiento;
        this.fotografia = fotografia;
        this.representante = representante;
        this.perfiles = perfiles;
        this.aprobado = aprobado;
    }

    public Candidato(String codigo, Contacto contacto, Date fechaNacimiento, byte[] fotografia, Representante representante, ArrayList<Perfil> perfiles, boolean aprobado, String nombre, String telefono, String curp, String rfc, Direccion direccion) {
        super(nombre, telefono, curp, rfc, direccion);
        this.codigo = codigo;
        this.contacto = contacto;
        this.fechaNacimiento = fechaNacimiento;
        this.fotografia = fotografia;
        this.representante = representante;
        this.perfiles = perfiles;
        this.aprobado = aprobado;
    }

    public Candidato(String codigo, Contacto contacto, Date fechaNacimiento, byte[] fotografia, Representante representante, ArrayList<Perfil> perfiles, boolean aprobado, String nombre, String telefono, String curp, Direccion direccion) {
        super(nombre, telefono, curp, direccion);
        this.codigo = codigo;
        this.contacto = contacto;
        this.fechaNacimiento = fechaNacimiento;
        this.fotografia = fotografia;
        this.representante = representante;
        this.perfiles = perfiles;
        this.aprobado = aprobado;
    }

    public Candidato() {
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

    public byte[] getFotografia() {
        return fotografia;
    }

    public void setFotografia(byte[] fotografia) {
        this.fotografia = fotografia;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
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
        return "Candidato{" + "codigo=" + codigo + ", contacto=" + contacto + ", fechaNacimiento=" + fechaNacimiento + ", fotografia=" + fotografia + ", representante=" + representante + ", perfiles=" + perfiles + ", aprobado=" + aprobado + '}';
    }

    
    
    
}

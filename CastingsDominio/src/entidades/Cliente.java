/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import Enums.Empresa;

/**
 *
 * @author lv1822
 */
public class Cliente {
    String nombre;
    String telefono;
    String codigo;
    String email;
    Empresa empresa;
    Contacto contacto;
    Direccion direccion;

    public Cliente(String nombre, String telefono, String codigo, String email, Empresa empresa, Contacto contacto, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.codigo = codigo;
        this.email = email;
        this.empresa = empresa;
        this.contacto = contacto;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Código: "+codigo+" - Nombre: "+nombre;
    }

    public Cliente() {
    }

    public Cliente(String codigo) {
        this.codigo = codigo;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
}

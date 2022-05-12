/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lv1822
 */
public class Persona {
    String nombre;
    String telefono;
    String curp;
    String rfc;
    Direccion direccion;

    public Persona() {
    }

    public Persona(String nombre, String telefono, String curp, String rfc, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.curp = curp;
        this.rfc = rfc;
        this.direccion = direccion;
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
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + ", curp=" + curp + ", rfc=" + rfc + ", direccion=" + direccion + '}';
    }
    
    
}

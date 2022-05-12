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
public class Adulto extends Candidato {

    public Adulto(String codigo, Contacto contacto, Date fechaNacimiento, Image fotografia, Representante representante, Perfil perfil, Prueba prueba) {
        super(codigo, contacto, fechaNacimiento, fotografia, representante, perfil, prueba);
    }

    public Adulto(String codigo, Contacto contacto, Date fechaNacimiento, Image fotografia, Representante representante, Perfil perfil, Prueba prueba, String nombre, String telefono, String curp, String rfc, Direccion direccion) {
        super(codigo, contacto, fechaNacimiento, fotografia, representante, perfil, prueba, nombre, telefono, curp, rfc, direccion);
    }

    public Adulto() {
    }

    public Adulto(String codigo) {
        super(codigo);
    }

    
 
    
    
}

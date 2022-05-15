/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import Enums.Estado;
import Enums.Sexo;
import Enums.EPerfil;
/**
 *
 * @author lv1822
 */
public class Perfil {
    String codigo;
    Estado estado;
    Sexo sexo;
    String rangoAltura;
    String rangoEdad;
    String colorCabello;
    String colorOjos;
    boolean experiencia;
    EPerfil tipoPerfil;

    public Perfil() {
    }

    public Perfil(String codigo, Estado estado, Sexo sexo, String rangoAltura, String rangoEdad, 
            String colorCabello, String colorOjos, boolean experiencia, EPerfil tipoPerfil) {
        this.codigo = codigo;
        this.estado = estado;
        this.sexo = sexo;
        this.rangoAltura = rangoAltura;
        this.rangoEdad = rangoEdad;
        this.colorCabello = colorCabello;
        this.colorOjos = colorOjos;
        this.experiencia = experiencia;
        this.tipoPerfil = tipoPerfil;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getRangoAltura() {
        return rangoAltura;
    }

    public void setRangoAltura(String rangoAltura) {
        this.rangoAltura = rangoAltura;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public boolean isExperiencia() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public EPerfil getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(EPerfil tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    @Override
    public String toString() {
        return "Perfil{" + "codigo=" + codigo + ", estado=" + estado + ", sexo=" + sexo + ", rangoAltura=" + rangoAltura + ", rangoEdad=" + rangoEdad + ", colorCabello=" + colorCabello + ", colorOjos=" + colorOjos + ", experiencia=" + experiencia + ", tipoPerfil=" + tipoPerfil + '}';
    }

    
    
    
}

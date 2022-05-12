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
    float alturaMax;
    float alturaMin;
    int edadMin;
    int edadMax;
    String colorCabello;
    String colorOjos;
    boolean experiencia;
    EPerfil tipoPerfil;

    public Perfil() {
    }

    public Perfil(String codigo, Estado estado, Sexo sexo, 
            float alturaMax, float alturaMin, int edadMin, int 
                    edadMax, String colorCabello, String colorOjos, boolean experiencia, EPerfil tipoPerfil) {
        this.codigo = codigo;
        this.estado = estado;
        this.sexo = sexo;
        this.alturaMax = alturaMax;
        this.alturaMin = alturaMin;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
        this.colorCabello = colorCabello;
        this.colorOjos = colorOjos;
        this.experiencia = experiencia;
        this.tipoPerfil = tipoPerfil;
    }

    public Perfil(String codigo) {
        this.codigo = codigo;
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

    public float getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(float alturaMax) {
        this.alturaMax = alturaMax;
    }

    public float getAlturaMin() {
        return alturaMin;
    }

    public void setAlturaMin(float alturaMin) {
        this.alturaMin = alturaMin;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(int edadMax) {
        this.edadMax = edadMax;
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
        return "Perfil{" + "codigo=" + codigo + ", estado=" + estado + ", sexo=" + sexo + ", alturaMax=" + alturaMax + ", alturaMin=" + alturaMin + ", edadMin=" + edadMin + ", edadMax=" + edadMax + ", colorCabello=" + colorCabello + ", colorOjos=" + colorOjos + ", experiencia=" + experiencia + ", tipoPerfil=" + tipoPerfil + '}';
    }
    
    
}

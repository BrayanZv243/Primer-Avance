/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author lv1822
 */
public class Direccion {
    String calle;
    String colonia;
    String codigoPostal;
    String numInterior;
    String numExterior;
    String referencia;
    String entreCalles;

    public Direccion() {
    }

    public Direccion(String calle, String colonia, String codigoPostal, String numInterior, String numExterior, String referencia, String entreCalles) {
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.numInterior = numInterior;
        this.numExterior = numExterior;
        this.referencia = referencia;
        this.entreCalles = entreCalles;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNumInterior() {
        return numInterior;
    }

    public void setNumInterior(String numInterior) {
        this.numInterior = numInterior;
    }

    public String getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getEntreCalles() {
        return entreCalles;
    }

    public void setEntreCalles(String entreCalles) {
        this.entreCalles = entreCalles;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", colonia=" + colonia + ", codigoPostal=" + codigoPostal + ", numInterior=" + numInterior + ", numExterior=" + numExterior + ", referencia=" + referencia + ", entreCalles=" + entreCalles + '}';
    }


    
}

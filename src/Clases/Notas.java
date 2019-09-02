/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author EPIS
 */
public class Notas {
    protected String Correspondencia;
    protected Double Aprobado;
    protected Double Desaprobado;

    public Notas() {
    }

    public Notas(String Correspondencia, Double Aprobado, Double Desaprobado) {
        this.Correspondencia = Correspondencia;
        this.Aprobado = Aprobado;
        this.Desaprobado = Desaprobado;
    }
    public String getCorrespondencia() {
        return Correspondencia;
    }
    public void setCorrespondencia(String Correspondencia) {
        this.Correspondencia = Correspondencia;
    }

    public Double getAprobado() {
        return Aprobado;
    }

    public void setAprobado(Double Aprobado) {
        this.Aprobado = Aprobado;
    }

    public Double getDesaprobado() {
        return Desaprobado;
    }

    public void setDesaprobado(Double Desaprobado) {
        this.Desaprobado = Desaprobado;
    }
    public String Promediar(){
    return "Metodo Promediar";
    }
    public String Ponderar(){
    return "Metodo Ponderar";
    }
    
}
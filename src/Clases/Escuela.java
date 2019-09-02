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
public class Escuela {
    protected String Nombre;
    protected String VisionMision;
    protected int CantidadEstudiantes;
    protected String Resultados;
    protected String Ubicacion;

    public Escuela() {
    }

    public Escuela(String Nombre, String VisionMision, int CantidadEstudiantes, String Resultados, String Ubicacion) {
        this.Nombre = Nombre;
        this.VisionMision = VisionMision;
        this.CantidadEstudiantes = CantidadEstudiantes;
        this.Resultados = Resultados;
        this.Ubicacion = Ubicacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getVisionMision() {
        return VisionMision;
    }

    public void setVisionMision(String VisionMision) {
        this.VisionMision = VisionMision;
    }

    public int getCantidadEstudiantes() {
        return CantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int CantidadEstudiantes) {
        this.CantidadEstudiantes = CantidadEstudiantes;
    }

    public String getResultados() {
        return Resultados;
    }

    public void setResultados(String Resultados) {
        this.Resultados = Resultados;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    public String Administrar(){
    return "Administrar";
    }
    public String Concursar(){
    return"Metodo concursar";
    }
    public String Financiar(){
    return "Metodo Financiar";
    }
    
}



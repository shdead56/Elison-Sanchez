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
public class Asignatura {
    protected String Nombre;
    protected String Codigo;
    protected String Horas;
    protected String Creditos;

    public Asignatura() {
    }

    public Asignatura(String Nombre, String Codigo, String Horas, String Creditos) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Horas = Horas;
        this.Creditos = Creditos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getHoras() {
        return Horas;
    }

    public void setHoras(String Horas) {
        this.Horas = Horas;
    }

    public String getCreditos() {
        return Creditos;
    }

    public void setCreditos(String Creditos) {
        this.Creditos = Creditos;
    }
    public String Seleccionar(){
    return "Usted selecciono asignatura";
    }
    public String Reservar(){
    return "Usted reservo asignatura";
    }
    
}

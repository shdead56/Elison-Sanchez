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
public class Docente {
    protected String Dni;
    protected String Apellidos;
    protected String Nombre;
    protected String GradoAcademico;
    protected String Especialidad;

    public Docente() {
    }

    public Docente(String Dni, String Apellidos, String Nombre, String GradoAcademico, String Especialidad) {
        this.Dni = Dni;
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
        this.GradoAcademico = GradoAcademico;
        this.Especialidad = Especialidad;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGradoAcademico() {
        return GradoAcademico;
    }

    public void setGradoAcademico(String GradoAcademico) {
        this.GradoAcademico = GradoAcademico;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    public String Evaluar(){
    return "usted a sido evaluado";
    }
    public String ControlarAsistencia(){
    return "Controlar Asistencia";
    }
    public String Dictar(){
    return "Dictar Asignatura";
    }
    public String Preparar(){
    return "Preparar Asignatura";
    }
    
}

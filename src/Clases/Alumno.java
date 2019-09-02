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
public class Alumno {
    protected String Codigo;
    protected String Apellidos;
    protected String Nombres;
    protected String correo;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    

    public Alumno() {
    }

    public Alumno(String Codigo, String Apellidos, String Nombres, String correo) {
        this.Codigo = Codigo;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.correo = correo;
    }
    
    public String Matricular(){
    return "Metodo Matricular";
    }
    public String Asistencia(){
    return "Metodo Asistir Alumno";
    }
    public String Pagar(){
    return "Usted a pagado";
    }
    public String Dispensar(){
    return "Metodo Dispensar";
    }
}


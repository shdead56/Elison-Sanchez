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
public class Ambiente {
 protected String Aforo;
 protected String Tipo;
 protected String Ubicacion;

    public Ambiente() {
    }

    public Ambiente(String Aforo, String Tipo, String Ubicacion) {
        this.Aforo = Aforo;
        this.Tipo = Tipo;
        this.Ubicacion = Ubicacion;
    }

    public String getAforo() {
        return Aforo;
    }

    public void setAforo(String Aforo) {
        this.Aforo = Aforo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
 public String Reservar(){
 return "las reservas comenzaran un semana antes de inicio de labores";
 }
 public String Limpiar(){
return "la limpieza se hara de immediato";
}
 public String Asignar(){
 return "el Docente se le asignara de immediato";
 }
}

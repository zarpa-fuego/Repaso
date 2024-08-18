package pe.upeu;

import java.util.Date;
public class Persona {
    protected String nombre;
    protected String asis;
    protected Date fecha;
    char genero;


    public Persona(String nombre, String asis, char genero) {
        this.nombre = nombre;
        this.asis = asis;
        this.fecha = null;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsis() {
        return asis;
    }

    public void setAsis(String asis) {
        this.asis = asis;
    }

    public Date getFechaAsistencia() {
        return fecha;
    }

    public void setFechaAsistencia(Date fechaAsistencia) {
        if (this.fecha == null){
            this.fecha = fechaAsistencia;
        }
    }
}
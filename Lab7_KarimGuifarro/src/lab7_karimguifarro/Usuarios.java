/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class Usuarios {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
    private String nota;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String usuario, String contraseña, String nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nota=" + nota + '}';
    }
    
}

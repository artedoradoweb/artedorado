package com.artedorado.paginaweb.samples.entities;

import java.io.Serializable;

/**
 * @param correo String con el correo electronico de la persona registrada. El correo electronico identifica a un usuario
 * @param nombre String con nombre de la persona registrada en la plataforma de la biblioteca
 * @param empresa String con el apellido de la persona registrada en la plataforma de la biblioteca
 * @param tipo Tipo de usuario de la plataforma este puede ser 1 para Comunidad o 2 para Admisitrador
 * @author AlejandroB
 */
public class Usuario implements Serializable{
    private String correo;
    private String nombre;
    private String empresa;
    private String telefono;
    private String tipo;
    
    public Usuario(String correo,String nombre, String empresa,String telefono,String tipo){
        this.correo = correo;
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono= telefono;
        this.tipo = tipo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", nombre=" + nombre + ", empresa=" + empresa + ", telefono=" + telefono + ", tipo=" + tipo + '}';
    }
   
    
   

    
}
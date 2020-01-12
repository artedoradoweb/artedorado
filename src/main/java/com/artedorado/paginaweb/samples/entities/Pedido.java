package com.artedorado.paginaweb.samples.entities;

import java.sql.Date;
import java.sql.Timestamp;


public class Pedido {
    int id,cantidad;
    private String idUsuario,tipo,estado,articulo;
    private Date fechaPedido;
    

    public Pedido(int id, String articulo,Date fechaPedido,String tipo, String estado, int cantidad) {
        this.id=id;
        this.articulo = articulo;        
        this.fechaPedido = fechaPedido;
        this.tipo = tipo;
        this.estado=estado;
        this.cantidad=cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", cantidad=" + cantidad + ", idUsuario=" + idUsuario + ", tipo=" + tipo + ", estado=" + estado + ", articulo=" + articulo + ", fechaPedido=" + fechaPedido + '}';
    }

    

    


    
    
    
}
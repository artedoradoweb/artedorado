package com.artedorado.paginaweb.samples.services;

import com.artedorado.paginaweb.persistence.PersistenceException;
import com.artedorado.paginaweb.samples.entities.Pedido;
import com.artedorado.paginaweb.samples.entities.Usuario;
import java.util.List;

public interface ServiciosArteDorado{
    public Usuario consultarUsuario(String email);
    public List<Pedido> consultarPedidos();
    public List<Pedido> consultarPedidosPorCorreo(String correo) throws PersistenceException;
    public void insertarPedido(Pedido pedido);
    
}
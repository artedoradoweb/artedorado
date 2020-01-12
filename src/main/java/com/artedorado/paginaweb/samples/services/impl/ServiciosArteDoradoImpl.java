package com.artedorado.paginaweb.samples.services.impl;

import com.artedorado.paginaweb.persistence.PedidoDAO;
import com.artedorado.paginaweb.persistence.PersistenceException;
import com.artedorado.paginaweb.persistence.UserDAO;
import com.artedorado.paginaweb.samples.entities.Pedido;
import com.artedorado.paginaweb.samples.entities.Usuario;
import com.artedorado.paginaweb.samples.services.ServiciosArteDorado;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Singleton
public class ServiciosArteDoradoImpl implements ServiciosArteDorado{
    @Inject
    private PedidoDAO pedidoDAO;
    @Inject
    private UserDAO userDAO;

    @Override
    public Usuario consultarUsuario(String email) {
        try {
            return userDAO.load(email);
        } catch (PersistenceException ex) {
            Logger.getLogger(ServiciosArteDoradoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Pedido> consultarPedidos() {
        return pedidoDAO.loadPedidos();
    }

    @Override
    public List<Pedido> consultarPedidosPorCorreo(String correo) throws PersistenceException {
        return pedidoDAO.loadPedidosByEmail(correo);
    }

    @Override
    public void insertarPedido(Pedido pedido) {
        try {
            pedidoDAO.addPedido(pedido);
        } catch (PersistenceException ex) {
            Logger.getLogger(ServiciosArteDoradoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
} 
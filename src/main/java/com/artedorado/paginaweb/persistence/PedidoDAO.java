/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artedorado.paginaweb.persistence;

import com.artedorado.paginaweb.samples.entities.Pedido;
import com.artedorado.paginaweb.samples.services.exceptions.ExcepcionServiciosArteDorado;
import java.util.List;

public interface PedidoDAO{
    
    public void addPedido(Pedido pedido) throws PersistenceException;
    
    public List<Pedido> loadPedidos();
    
    public List<Pedido> loadPedidosByEmail(String email) throws PersistenceException;
    
    
}
package com.artedorado.paginaweb.persistence.mybatis;

import com.artedorado.paginaweb.persistence.PedidoDAO;
import com.artedorado.paginaweb.persistence.PersistenceException;
import com.artedorado.paginaweb.samples.entities.Pedido;

import com.google.inject.Inject;
import com.artedorado.paginaweb.persistence.mybatis.mappers.PedidoMapper;
import java.util.List;

public class MyBatisPedidoDAO implements PedidoDAO{
    @Inject
    private PedidoMapper pedidoMapper;
    
    @Override
    public void addPedido(Pedido pedido) throws PersistenceException {
        pedidoMapper.insertarPedido(pedido);
    }

    @Override
    public List<Pedido> loadPedidos() {
        return pedidoMapper.consultarPedidos();
    }

    @Override
    public List<Pedido> loadPedidosByEmail(String email) {
        return pedidoMapper.consultarPedidosPorCorreo(email);
    }
    
}
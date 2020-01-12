package com.artedorado.paginaweb.persistence.mybatis.mappers;

import com.artedorado.paginaweb.samples.entities.Pedido;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PedidoMapper{
    public List<Pedido> consultarPedidos();
    public List<Pedido> consultarPedidosPorCorreo(@Param("correo")String email);
    public void insertarPedido(@Param("pedido") Pedido pedido);
}
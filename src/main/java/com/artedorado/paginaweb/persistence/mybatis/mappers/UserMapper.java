package com.artedorado.paginaweb.persistence.mybatis.mappers;  

import com.artedorado.paginaweb.samples.entities.Usuario;
import org.apache.ibatis.annotations.Param;



/**
 *
 * @author 2106913
 */
public interface UserMapper {
    
    public Usuario consultarUsuario(@Param("correo") String email); 
}
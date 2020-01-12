package com.artedorado.paginaweb.persistence.mybatis;

import com.artedorado.paginaweb.persistence.PersistenceException;
import com.artedorado.paginaweb.persistence.UserDAO;
import com.artedorado.paginaweb.persistence.mybatis.mappers.UserMapper;
import com.artedorado.paginaweb.samples.entities.Usuario;
import com.google.inject.Inject;

public class MyBatisUserDAO implements UserDAO {

    @Inject
    private UserMapper userMapper;

    @Override
    public Usuario load(String email) throws PersistenceException {
        try {
            userMapper.consultarUsuario(email);
        } catch (org.apache.ibatis.exceptions.PersistenceException e) {
            throw new PersistenceException("Error consultar el usuario", e);
        }
        return null;

    
    }
}

package com.artedorado.paginaweb.persistence;
import com.artedorado.paginaweb.persistence.PersistenceException;
import com.artedorado.paginaweb.samples.entities.Usuario;


/**
 *
 * @author 2152805
 */
public interface UserDAO {
    
    public Usuario load(String email) throws PersistenceException;      
}
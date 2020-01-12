/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artedorado.paginaweb.security;

import com.artedorado.paginaweb.samples.services.exceptions.ExcepcionServiciosArteDorado;

/**
 *
 * @author 2152805
 */
public interface IniciarSesion {
    public void login(String email,String contraseña,boolean rememberMe) throws ExcepcionServiciosArteDorado;
    public void logout();
    public boolean isLogged();
}

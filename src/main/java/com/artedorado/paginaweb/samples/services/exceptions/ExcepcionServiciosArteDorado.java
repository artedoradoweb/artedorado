/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artedorado.paginaweb.samples.services.exceptions;

/**
 *
 * @author AlejandroB
 */
public class ExcepcionServiciosArteDorado extends Exception {
    
    public ExcepcionServiciosArteDorado(String message) {
        super(message);
    }
    public ExcepcionServiciosArteDorado(String message,Throwable w) {
        super(message);
    }
    
}

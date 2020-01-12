package com.artedorado.paginaweb.samples.services;


import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;
import java.util.Optional;

import com.artedorado.paginaweb.persistence.mybatis.MyBatisUserDAO;
import com.artedorado.paginaweb.persistence.UserDAO;
import com.artedorado.paginaweb.persistence.PedidoDAO;
import com.artedorado.paginaweb.persistence.mybatis.MyBatisPedidoDAO;
import com.artedorado.paginaweb.samples.services.impl.ServiciosArteDoradoImpl;
import com.artedorado.paginaweb.security.IniciarSesion;
import com.artedorado.paginaweb.security.ApacheShiroLogger;

public class ServiciosArteDoradoFactory {
    
   private static ServiciosArteDoradoFactory instance = new ServiciosArteDoradoFactory();
   private static Optional<Injector> optInjector;
   
   private static Injector myBatisInjector(String env, String pathResource) {
       return createInjector(new XMLMyBatisModule() {
           @Override
           protected void initialize() {
               setEnvironmentId(env);
               setClassPathResource(pathResource);
               bind(UserDAO.class).to(MyBatisUserDAO.class);
               bind(PedidoDAO.class).to(MyBatisPedidoDAO.class);

               
           }
       });
   }

   private ServiciosArteDoradoFactory(){
       optInjector = Optional.empty();
   }

   public static ServiciosArteDorado getServiciosArteDorado(){
       if (!optInjector.isPresent()) {
           optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
       }

       return optInjector.get().getInstance(ServiciosArteDorado.class);
   }


   public static ServiciosArteDorado getServiciosBibliotecaTesting(){
       if (!optInjector.isPresent()) {
           optInjector = Optional.of(myBatisInjector("test","mybatis-config-h2.xml"));
       }

       return optInjector.get().getInstance(ServiciosArteDorado.class);
   }


   public static ServiciosArteDoradoFactory getInstance(){
       return instance;
   }

}
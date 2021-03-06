package com.artedorado.paginaweb.guice;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.artedorado.paginaweb.persistence.UserDAO;
import com.artedorado.paginaweb.persistence.PedidoDAO;
import com.artedorado.paginaweb.persistence.mybatis.MyBatisPedidoDAO;
import com.artedorado.paginaweb.persistence.mybatis.MyBatisUserDAO;




public class GuiceContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(Injector.class.getName());
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Injector injector = Guice.createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                setClassPathResource("mybatis-config.xml");

                // TODO Add service class associated to Stub implementation

               bind(UserDAO.class).to(MyBatisUserDAO.class);
               bind(PedidoDAO.class).to(MyBatisPedidoDAO.class);
               

            }
        });  

        servletContextEvent.getServletContext().setAttribute(Injector.class.getName(), injector);
    }
}
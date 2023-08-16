package com.xyz.myfirstrestapiusingspringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan("com.xyz")
public class SpringBeansConfig {
   @Bean
    public DriverManagerDataSource dataSource(){
       DriverManagerDataSource ds = new DriverManagerDataSource();
       ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
       ds.setUrl("jdbc:mysql://localhost:3306/spring-mvc-rest");
       ds.setUsername("root");
       ds.setPassword("root");
       return ds;

    }

    @Bean
    public LocalSessionFactoryBean sessionFactoryBean(){

       LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
       bean.setDataSource(dataSource());
       bean.setPackagesToScan("com.xyz.myfirstrestapiusingspringmvc.entity");
       bean.setHibernateProperties(readHibernateProps());
       return bean;
    }

    @Bean
    public Properties readHibernateProps(){
       Properties props = new Properties();
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.format_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "update");
        return props;

    }
}

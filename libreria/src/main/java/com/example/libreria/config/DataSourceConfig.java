package com.example.libreria.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DataSourceConfig {

    @Value("${libreria.database.host}")
    private String host;
    @Value("${libreria.database.name}")
    private String database;
    @Value("${libreria.database.user}")
    private String user;
    @Value("${libreria.database.pass}")
    private String pass;
    private final String urlConexion = "jdbc:postgresql://%s:5432/%s";
    
    @Bean
    public DataSource getDataSource(){
        String url = String.format(urlConexion, host, database);
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url(url);
        dataSourceBuilder.username(user);
        dataSourceBuilder.password(pass);
        return dataSourceBuilder.build();
    }
}
package com.batch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class ApplicationConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/batch_database");

        String dbUsername = "root"; // Here you set your own user
        dataSource.setUsername(dbUsername);

        String dbPass = "1234"; // Here you set the password for your user
        dataSource.setPassword(dbPass);

        return dataSource;
    }
}

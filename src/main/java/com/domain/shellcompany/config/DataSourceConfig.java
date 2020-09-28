//package com.domain.shellcompany.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourceConfig
//{
//    @Bean
//    public DataSource dataSource()
//    {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUsername("root");
//        dataSource.setPassword("");
//        dataSource.setUrl(
//                "jdbc:mysql://localhost:3306/testdb?createDatabaseIfNotExist=true&useSSL=false");
//        return dataSource;
//    }
//}

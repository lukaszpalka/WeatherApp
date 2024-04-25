package com.example.weatherapp.config;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.beans.factory.annotation.Value;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class MySQLContainerConfig implements AfterAllCallback {

//    @Value("${spring.datasource.username}")
//    public static String dbUsername;
//
//    @Value("${spring.datasource.password}")
//    public static String password;

    @Container
    protected static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:8.0.28")
            .withDatabaseName("weatherapp")
            .withUsername("root")
            .withPassword("root");

    static {
        mysqlContainer.start();
        System.setProperty("spring.datasource.url", mysqlContainer.getJdbcUrl());
        System.setProperty("spring.datasource.username", mysqlContainer.getUsername());
        System.setProperty("spring.datasource.password", mysqlContainer.getPassword());
    }


//    @Override
//    public void beforeAll(ExtensionContext extensionContext) throws Exception {
//        mysqlContainer.start();
//        System.setProperty("spring.datasource.url", mysqlContainer.getJdbcUrl());
//        System.setProperty("spring.datasource.username", mysqlContainer.getUsername());
//        System.setProperty("spring.datasource.password", mysqlContainer.getPassword());
//    }

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        mysqlContainer.stop();
    }
}

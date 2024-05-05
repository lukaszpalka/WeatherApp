package com.example.weatherapp.config;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.beans.factory.annotation.Value;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class MySQLContainerConfig implements AfterAllCallback {

    @Container
    protected static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:8.0.28")
            .withDatabaseName(System.getenv("DATABASE_NAME"))
            .withUsername(System.getenv("DATABASE_USERNAME"))
            .withPassword(System.getenv("DATABASE_PASSWORD"));

    static {
        mysqlContainer.start();
        System.setProperty("spring.datasource.url", mysqlContainer.getJdbcUrl());
        System.setProperty("spring.datasource.username", mysqlContainer.getUsername());
        System.setProperty("spring.datasource.password", mysqlContainer.getPassword());
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        mysqlContainer.stop();
    }
}

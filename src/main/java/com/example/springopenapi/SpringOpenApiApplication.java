package com.example.springopenapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "OPEN API",version = "1.0.0",description = "Exemple de projet "))
public class SpringOpenApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOpenApiApplication.class, args);
    }

}

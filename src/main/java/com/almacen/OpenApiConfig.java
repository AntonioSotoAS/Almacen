package com.almacen;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class OpenApiConfig {

    @Bean
    @Primary
    public OpenAPI anotherApiConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Almacen")
                        .description("aplicación de inventarios")
                        .version("1.0.0"));
    }
}

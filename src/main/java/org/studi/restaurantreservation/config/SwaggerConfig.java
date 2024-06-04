package org.studi.restaurantreservation.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Restaurant reservation").version("1.0.0"));
    }

    @Bean
    GroupedOpenApi groupedOpenApi() {
        return GroupedOpenApi.builder()
                .group("Restaurant reservation")
                .pathsToMatch("/**")
                .build();
    }

}

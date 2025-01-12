package com.icinta.tasks.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@SuppressWarnings("null") CorsRegistry registry) {
        // Allow CORS for all endpoints with all methods and headers from specific origins
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000") // Replace with the client-side origin
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH") // Allowed HTTP methods
                .allowedHeaders("*"); // Allow all headers
    }
}

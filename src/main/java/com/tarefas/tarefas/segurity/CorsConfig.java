package com.tarefas.tarefas.segurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200, https://front-tarefas-liart.vercel.app, https://front-tarefas-liart.vercel.app/, https://nelsonfjunior.shop/, https://www.nelsonfjunior.shop/, https://nelsonfjunior.shop, https://www.nelsonfjunior.shop, http://localhost:4200, https://18.117.86.165/, https://18.117.86.165:8081, https://18.117.86.165:8081/")
                .allowedMethods("GET", "POST", "DELETE", "PUT");
    }
}

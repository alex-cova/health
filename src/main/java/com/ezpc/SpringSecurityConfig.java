package com.ezpc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;

import java.util.List;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        var cc = new CorsConfiguration();
        cc.applyPermitDefaultValues();
        cc.setAllowedMethods(List.of("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
        cc.setExposedHeaders(List.of("Authorization", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "Content-Range"));

        return http.authorizeHttpRequests((authorizeHttpRequests) ->
                        authorizeHttpRequests.anyRequest()
                                .permitAll()
                ).cors(config -> config.configurationSource(request -> cc))
                .csrf(CsrfConfigurer::disable)
                .build();

    }
}
package com.example.Security_demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; // 1. ADD THIS IMPORT
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Configuration_securityfilter {
	
	@Bean
	public SecurityFilterChain SecurityFilterchain(HttpSecurity http) throws Exception{
		 http
             .authorizeHttpRequests(auth -> auth.requestMatchers("/public")
             .permitAll()
             .requestMatchers("/user")
             .hasAnyRole("ADMIN", "USER")
             .requestMatchers("/admin")
             .hasRole("ADMIN")
             .anyRequest().authenticated())
             .httpBasic(Customizer.withDefaults());
		 	  return http.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails admin = User.withUsername("admin")
	            .password("$2a$10$FuyHyVSLvQGdXK74zJo7FewafKdoxVQME/uKWEAgBo1DZp1ZQH/qW")
	            .roles("ADMIN")
	            .build();

	    UserDetails user = User.withUsername("user")
	            .password("$2a$10$QDvBZ1sKqLGes5jN2.3xBukRtRMJJfOR./OWvdTwPCZjG0UCuUrR.")
	            .roles("USER")
	            .build();
		return new InMemoryUserDetailsManager(user,admin);
		}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}

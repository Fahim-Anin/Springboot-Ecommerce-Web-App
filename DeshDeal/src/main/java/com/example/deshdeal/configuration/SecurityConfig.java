//package com.example.deshdeal.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.*;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder encoder){
//        UserDetails admin = User.withUsername("Fahim")
//                .password(encoder.encode("nxdadmin"))
//                .roles("admin")
//                .build();
//
//        UserDetails user1 = User.withUsername("Fahim")
//                .password("nxduser")
//                .roles(encoder.encode("nxduser"))
//                .build();
//
//        return new InMemoryUserDetailsManager(admin, user);
//    }
//}

package com.mayur.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		
		 http
         .authorizeHttpRequests((requests) -> requests
             .requestMatchers("/name", "/lname").authenticated()  
             .requestMatchers("/age", "/address").permitAll()      
         )
         .formLogin(form -> form                                
                 .permitAll()                                       
                 )
                 .logout(logout -> logout                               
                     .permitAll()                                       
                 ); 

     return http.build();
     }
	
	 @Bean
	    public UserDetailsService userDetailsService() {
	        UserDetails user1 = User.builder()
	            .username("user1")
	            .password(passwordEncoder().encode("password1"))
	            .roles("USER")
	            .build();

	        UserDetails admin = User.builder()
	            .username("admin")
	            .password(passwordEncoder().encode("adminpass"))
	            .roles("ADMIN")
	            .build();

	        return new InMemoryUserDetailsManager(user1, admin);
	    }

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
}

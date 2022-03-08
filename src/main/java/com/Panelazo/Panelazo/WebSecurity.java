package com.Panelazo.Panelazo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
	  @Override
	    public void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	            .antMatchers("/","/login","/registrarUser","/user/getuser","/getprovedor","/registrarproducto").permitAll();
	        http.csrf().disable();

	    }
	  // BCryptPasswordEncoder bCryptPasswordEncoder;
	    //Crea el encriptador de contraseñas	
	 //  @Bean
	 //  public BCryptPasswordEncoder passwordEncoder() {
		//bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
	//El numero 4 representa que tan fuerte quieres la encriptacion.
	//Se puede en un rango entre 4 y 31. 
	//Si no pones un numero el programa utilizara uno aleatoriamente cada vez
	//que inicies la aplicacion, por lo cual tus contrasenas encriptadas no funcionaran bien
	  //      return bCryptPasswordEncoder;
	  //  }
		
	    //@Autowired
	  //  UserDetails userDetailsService;
		
	    //Registra el service para usuarios y el encriptador de contrasena
	  //  @Autowired
	    //public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
	 
	        // Setting Service to find User in the database.
	        // And Setting PassswordEncoder
	     //   auth.userDetailsService((T) userDetailsService).passwordEncoder(passwordEncoder());     
	   // }


}
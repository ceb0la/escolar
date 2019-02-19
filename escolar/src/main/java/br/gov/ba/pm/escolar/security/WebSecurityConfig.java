package br.gov.ba.pm.escolar.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import br.gov.ba.pm.escolar.service.ImplementsUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
			.csrf().disable() //Habilita method Post, #issue verificar como configurar method Post
			.authorizeRequests()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login") //free page login for everyone
				.permitAll()
				.and()
			.rememberMe() // Habilita a função de "lembrar-me"
				.and()
			.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).permitAll();	
		
		//.and().logout().logoutSuccessUrl("/login?logout").permitAll();
		
		/*http.csrf().disable().authorizeRequests()
		.antMatchers(HttpMethod.GET,"/").permitAll()
		.antMatchers(HttpMethod.GET,"/insertEvento").hasRole("ADMIN")
		.antMatchers(HttpMethod.POST,"/insertEvento").hasRole("ADMIN")
		.antMatchers(HttpMethod.GET,"/insertUsuario").hasRole("ADMIN")
		.antMatchers(HttpMethod.POST,"/insertUsuario").hasRole("ADMIN")
		.anyRequest().authenticated()
		.and().formLogin().permitAll()
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));*/
	}
	
	@Autowired
	private ImplementsUserDetailsService userDetailsService;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/style/**","/webjars/**");
	}

}

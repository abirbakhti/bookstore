package com.vermeg.ams.configurations;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import javax.sql.DataSource;
	
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private DataSource dataSource;
	@Value("${spring.queries.users-query}")
	private String usersQuery;
	@Value("${spring.queries.roles-query}")
	private String rolesQuery;

//etablir la conx et le mdp
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.usersByUsernameQuery(usersQuery)
			.authoritiesByUsernameQuery(rolesQuery)
			.dataSource(dataSource)
			.passwordEncoder(bCryptPasswordEncoder);
	}

	//acces
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/").permitAll() // accès pour tous users
				.antMatchers("/login").permitAll() // accès pour tous users
				.antMatchers("/registration").permitAll() // accès pour tous users
				.antMatchers("/accounts/**").permitAll()
			
				.antMatchers("/book/**").permitAll()
				.antMatchers("/command/**").permitAll().anyRequest()

				.authenticated().and().csrf().disable().formLogin() // l'accès de fait via un formulaire

				.loginPage("/login").defaultSuccessUrl("/home")
				.failureUrl("/login?error=true") // fixer la page login

				 // page d'accueil après login avec succès
				
				.usernameParameter("email") // paramètres d'authentifications login et password
				.passwordParameter("password")
				.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")) // route
																															// de
																															// deconnexion
																															// ici/logut

				.logoutSuccessUrl("/login").and().exceptionHandling() // une fois deconnecté redirection vers login

				.accessDeniedPage("/403").and()
                .httpBasic()
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable();
		
	}

	// laisser l'accès aux ressources
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
	}

}*/
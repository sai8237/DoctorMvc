package appointment_mvc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import appointment_mvc.service.DoctorService;


@EnableWebSecurity
public class DoctorSecurity extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DoctorService doctorService;
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(doctorService);
		     
	}
	
	
	@Bean
	public PasswordEncoder getPassEncoded() { 
		//return new BCryptPasswordEncoder(); 
		return NoOpPasswordEncoder.getInstance();
	}
	

	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring().antMatchers("/","/doctor/home","/doctor/register","/doctor/processregister");
	}
	
}
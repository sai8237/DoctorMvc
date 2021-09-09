package appointment_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import appointment_mvc.dao.DoctorDao;
import appointment_mvc.entity.DoctorEntity;

@Service
public class DoctorService implements UserDetailsService{
	
	@Autowired
	private DoctorDao dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("Hi");
		DoctorEntity user = dao.findById(username).get();
		 System.out.println(user);
		 System.out.println("User in Service Layer :"+user);
			if(user == null) {
				throw new UsernameNotFoundException("This user does not exist");
			}
			return user;
	}

}

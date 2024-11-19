package lab.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lab.entity.UserInfor;
import lab.respository.UserInforRepository;

public class UserInforServices implements UserDetailsService{
	
	@Autowired
	UserInforRepository repository;
	
	public UserInforServices(UserInforRepository userInforRepository) {
		this.repository= userInforRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<UserInfor> userInfor = repository.findByName(username);
		return userInfor.map(UserInforUserDetails::new)
				.orElseThrow(()-> new UsernameNotFoundException("user not found "+ username));
	}
	

}

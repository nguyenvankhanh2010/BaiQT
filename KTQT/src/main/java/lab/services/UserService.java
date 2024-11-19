package lab.services;

import org.springframework.security.crypto.password.PasswordEncoder;

import lab.entity.UserInfor;
import lab.respository.UserInforRepository;

public record UserService(UserInforRepository repository, PasswordEncoder passwordEncoder) {

	public String addUser(UserInfor userInfor) {
		userInfor.setPassword(passwordEncoder.encode(userInfor.getPassword()));
		repository.save(userInfor);
		return "Them user thanh cong";
	}
}

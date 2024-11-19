package lab.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import lab.entity.UserInfor;

public interface UserInforRepository extends JpaRepository<UserInfor, Integer>{
	Optional<UserInfor> findByName(String username);
}

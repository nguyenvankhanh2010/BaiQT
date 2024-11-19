package lab.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lab.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
	@Query("SELECT u FROM Users u WHERE u.username = :username")
	public User getUserByUserName(@Param("username") String username);
	Optional<User> findByEmail(String email);
	Optional<User> findByUsernameOrEmail(String username, String email);
	Optional<User> findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);

}

package lab.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (name="role_name", length = 50, columnDefinition = "nvarchar(50) not null")
	private String name;

}

package lab.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(columnDefiniton = "nvarchar(255)")
	private String name;
	@Column(columDefinition = "nvarchar(255)")
	private String brand;
	@Column(columDefinition = "nvarchar(255)")
	private String madein;
	private float price;
	

}

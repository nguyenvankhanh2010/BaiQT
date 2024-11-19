package lab.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lab.entity.Customer;

public class CustomerController {
	final private List<Customer> customers = List.of(Customer.builder().id("001").name("Nguyen Van "
			+ "Khanh").email("vkhanh1224@gmail.com").build(),
			Customer.builder().id("002").name("Nguyen Van "
					+ "Khanh").email("vkhanh@gmail.com").build()
			);
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		return ResponseEntity.ok("Hello is Guest");
	}
	
	@GetMapping("/customer/all")
	@PreAuthorize("hasAuthority('ROLR_ADMIN')")
	public ResponseEntity<List<Customer>> getCustomerList(){
		List<Customer> list = this.customers;
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/customer/{id}")
	@PreAuthorize("hasAuthority('ROLR_USER')")
	public ResponseEntity<Customer> getCustomerList(@PathVariable("id") String id){
	List<Customer> customers = this.customers.stream().filter(customer -> customer.getId().equals(id)).toList();
	return ResponseEntity.ok(customers.get(0));
		
	}

}

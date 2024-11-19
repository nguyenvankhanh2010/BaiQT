package lab.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lab.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

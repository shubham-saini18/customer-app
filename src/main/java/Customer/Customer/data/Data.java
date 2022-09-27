package Customer.Customer.data;

import org.springframework.data.jpa.repository.JpaRepository;

import Customer.Customer.entity.Customer;

public interface Data extends JpaRepository<Customer, Integer>{

}

package Customer.Customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Customer.Customer.entity.Customer;
import Customer.Customer.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class Controller {
	@Autowired
	private CustomerService c;

	@GetMapping("/all")
	public List<Customer> getCustomerList() {
		return this.c.getCustomer();
	}

	@PostMapping("/add")
	public Customer addNewCustomer(@RequestBody Customer customer) {
		return this.c.addCustomer(customer);
	}

	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return this.c.updateCustomer(customer);
	}
    @DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteCustomerData(@PathVariable int id) {
		try {
			this.c.deleteCustomerData(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

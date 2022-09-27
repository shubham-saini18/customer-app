package Customer.Customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Customer.Customer.data.Data;
import Customer.Customer.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private Data data;

	@Override
	public List<Customer> getCustomer() {

		return data.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		data.save(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		data.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomerData(int id) {
		int e = id;
		data.deleteById(e);

	}

}

package Customer.Customer.service;

import java.util.List;

import Customer.Customer.entity.Customer;

public interface CustomerService {
    public List<Customer> getCustomer();
    public Customer addCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public void deleteCustomerData(int id);
}

package site.easytobuild.multipurpose.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.easytobuild.multipurpose.dao.CustomerRepository;
import site.easytobuild.multipurpose.entity.Customer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer findByCustomerId(int customerId) {
        return null;
    }

    @Override
    public List<Customer> findByCustomerName(String customerName) {
        return null;
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteByCustomerId(int customerId) {

    }
}

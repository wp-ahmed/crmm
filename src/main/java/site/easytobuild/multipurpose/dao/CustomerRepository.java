package site.easytobuild.multipurpose.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.easytobuild.multipurpose.entity.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    public Customer findByCustomerId(int customerId);

    public List<Customer> findByCustomerName(String customerName);

    void deleteByCustomerId(int customerId);
}

package site.easytobuild.multipurpose.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.easytobuild.multipurpose.dao.BusinessRepository;
import site.easytobuild.multipurpose.dao.CustomerRepository;
import site.easytobuild.multipurpose.entity.Business;
import site.easytobuild.multipurpose.entity.Customer;

import java.security.Principal;

@Service
public class BusinessServiceImpl implements BusinessService{

    @Autowired
    private BusinessRepository businessRepository;

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Business findByBusinessId(int businessId) {
        return businessRepository.findByBusinessId(businessId);
    }

    public Business findByBusinessName(String businessName){
        return businessRepository.findByBusinessName(businessName);
    }
    @Override
    public void save(Business business, Principal principal) {
        String customerName = principal.getName();
        Customer customer = customerRepository.findByCustomerName(customerName).get(0);
        int customerId = customer.getCustomerId();

        customer.addBusinesses(business);
        business.setCustomer(customer);

        businessRepository.save(business);
    }

    @Override
    public void deleteByBusinessId(int businessId) {

    }
}

package tan.hung.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    //    @Autowired(required = false)
    @Autowired
    @Qualifier("CustomerDAOImpl2")
    private CustomerDAO customerDAO;

    public CustomerService() {
        System.out.println("default constructor");
    }

    //    @Autowired
    public CustomerService(CustomerDAO customerDAO) {
        System.out.println("constructor CustomerService 1 parameter");
        this.customerDAO = customerDAO;
    }

    public CustomerDAO getCustomerDAO() {
        return customerDAO;
    }

    //    @Autowired
    public void setCustomerDAO(CustomerDAO customerDAO) {
        System.out.println("set customerDAO");
        this.customerDAO = customerDAO;
    }
}

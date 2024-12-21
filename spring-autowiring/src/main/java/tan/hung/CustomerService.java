package tan.hung;

public class CustomerService {
    private CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        System.out.println("constructor 1 parameter");
        this.customerDAO=customerDAO;
    }
    public CustomerService() {
        System.out.println("default CustomerService constructor");
    }

    public CustomerDAO getCustomerDAO() {
        return customerDAO;
    }

    public void setCustomerDAO(CustomerDAO customerDAO) {
        System.out.println("setCustomerDAO..........");
        this.customerDAO = customerDAO;
    }
}

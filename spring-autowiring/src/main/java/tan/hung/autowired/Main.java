package tan.hung.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService=context.getBean("customerService",CustomerService.class);
        System.out.println(customerService.getCustomerDAO());
    }
}

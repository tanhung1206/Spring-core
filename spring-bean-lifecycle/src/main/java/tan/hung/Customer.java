package tan.hung;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component("cust")
public class Customer implements BeanNameAware , BeanFactoryAware, ApplicationContextAware, InitializingBean {
    private String firstName;

    public Customer(){
        System.out.println("Customer non-arg constructor...");
    }

    public Customer(String firstName) {
        System.out.println("Customer FirstName constructor..." + firstName);
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("setFirstName is being called");
        this.firstName = firstName;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName is being called...." + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory is being called...." + beanFactory.isSingleton("cust"));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext is being called...." + applicationContext.isPrototype("cust"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet is being called....");
        this.firstName = "TanHung in afterPropertiesSet";
    }

    @PostConstruct
    public void customInit(){
        System.out.println("customInit....");
        this.firstName = "TanHung in customInit";
    }


}

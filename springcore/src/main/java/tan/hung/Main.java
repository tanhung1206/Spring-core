package tan.hung;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tan.hung.config.AppConfig;

public class Main {
    public static void main(String[] args) {
//        EmailService emailService=new EmailService();

//        Wrong with version 6.1.11, correct with 5.2.0-RELEASE
//        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
//        EmailService emailService=beanFactory.getBean("emailService",EmailService.class);

//        BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService=beanFactory.getBean("emailService",EmailService.class);

//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService=context.getBean("emailService",EmailService.class);
//        System.out.println(emailService);
//        emailService.sendEmail("quynhinhi@gmail.com","Hello quynh nhi");
//
//        System.out.println("--------------------------");

//        ApplicationContext context1=new AnnotationConfigApplicationContext(AppConfig.class);
//        EmailService emailService1=context1.getBean("getEmailService",EmailService.class);
//        System.out.println(emailService1);
//        emailService1.sendEmail("tanhung@gmail.com","Hello tan hung");


        //Example 2
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService=context.getBean("emailService",EmailService.class);
//        System.out.println(emailService);
//
//        EmailService emailService2=context.getBean("emailService",EmailService.class);
//        System.out.println(emailService2);


        //Example 3
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService=context.getBean("emailService",EmailService.class);
//        System.out.println(emailService);
//
//        ApplicationContext context2=new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService2=context2.getBean("emailService",EmailService.class);
//        System.out.println(emailService2);


        //Example 4
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService = context.getBean("prototypeEmailService", EmailService.class);
//        System.out.println(emailService);
//
//        EmailService emailService2 = context.getBean("prototypeEmailService", EmailService.class);
//        System.out.println(emailService2);


        //Example 5
//        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        EmailService emailService=context.getBean("getPrototypeEmailService",EmailService.class);
//        EmailService emailService2=context.getBean("getPrototypeEmailService",EmailService.class);
//        System.out.println(emailService);
//        System.out.println(emailService2);
    }
}

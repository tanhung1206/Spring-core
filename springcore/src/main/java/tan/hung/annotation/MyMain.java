package tan.hung.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
    public static void main(String[] args) {

        //Example 1
//        ApplicationContext context=new AnnotationConfigApplicationContext(MyAppConfig.class);
//        SMSService smsService=(SMSService) context.getBean("smsService");
////        SMSService smsService=(SMSService) context.getBean(SMSService.class);
//        smsService.sendMessage("quynhi@gmail.com","Hi");


        //Example 2
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring-annotation.xml");
//        SMSService smsService=(SMSService) context.getBean("smsService");
////        SMSService smsService=(SMSService) context.getBean(SMSService.class);
//        smsService.sendMessage("quynhi@gmail.com","Hi");
    }
}

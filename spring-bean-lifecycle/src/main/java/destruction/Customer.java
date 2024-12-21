package destruction;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Customer implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy() is being called");
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("customDestroy*********");
    }
}

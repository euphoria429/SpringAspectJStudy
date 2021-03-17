package cn.hcx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void testProxy() {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Hello hello = (Hello) applicationContext.getBean("helloProxy");
        try {
            hello.sayhello();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

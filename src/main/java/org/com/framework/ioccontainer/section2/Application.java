package org.com.framework.ioccontainer.section2;

import org.com.framework.ioccontainer.common.DotaeDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        DotaeDTO dotae = context.getBean("dotae", DotaeDTO.class);
        System.out.println(dotae);
    }
}

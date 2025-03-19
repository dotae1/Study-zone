package org.com.framework.ioccontainer.section3;

import org.com.framework.ioccontainer.common.DotaeDTO;
import org.com.framework.ioccontainer.common.DotaeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        // getBeanDefinitionNames : 스프링 컨테이너에서 생성 된 bean 들의 이름을 배열로 반환
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName :" + beanName);
        }

        DotaeDAO dotaeDAO = context.getBean("dotaeDAO", DotaeDAO.class);

        System.out.println(dotaeDAO.selectDotae(1));
        System.out.println(dotaeDAO.insertDotae(new DotaeDTO(27, "바보", "조재현")));
        System.out.println(dotaeDAO.selectDotae(27));
        System.out.println(dotaeDAO.selectDotae(2));
    }
}

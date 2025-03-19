package org.com.framework.section1;

import org.com.framework.common.DotaeDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        //GenericXmlApplicationContext 클래스를 사용해 ApplicationContext를 생성하고 XML 설정 메타 정보를 인자로 전달
        ApplicationContext context
                = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        //1.bean의 id를 이용해서 bean을 가져오는 방법
        DotaeDTO dotae = (DotaeDTO) context.getBean("dotae");

        //2. bean의 클래스 메타 정보를 전달하여 가져오는 방법
        //DotaeDTO dotae = context.getBean(DotaeDTO.class);

        //3. bean의 id와 클래스 메타 정보를 전달하여 가져오는 방법
        //DotaeDTO dotae = context.getBean("dotae", DotaeDTO.class);

        System.out.println(dotae);
    }
}


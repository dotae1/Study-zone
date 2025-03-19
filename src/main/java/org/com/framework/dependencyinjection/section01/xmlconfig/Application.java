package org.com.framework.dependencyinjection.section01.xmlconfig;

import org.com.framework.dependencyinjection.common.MemberDTO;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("dependencyinjection01/section01/xmlconfig/spring-context.xml");

        MemberDTO member = context.getBean(MemberDTO.class);

        System.out.println(member.getPersonalAccount().getBalance());
        //10000원 입금
        System.out.println(member.getPersonalAccount().deposit(10000));
        //잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());
        //5000원 출금
        System.out.println(member.getPersonalAccount().withDraw(5000));
        System.out.println(member.getPersonalAccount().getBalance());
    }
}

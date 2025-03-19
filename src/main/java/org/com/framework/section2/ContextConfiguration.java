package org.com.framework.section2;

import org.com.framework.common.DotaeDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// @Configuration 어노테이션은 해당 클래스가 빈을 생성하는 클래스 임을 표기한다.
@Configuration
public class ContextConfiguration {

    // @Bean 어노테이션은 해당 메소드의 반환 값을 스프링 컨테이너에 빈으로 등록한다는 의미다.
    //이름을 별도로 저장하지 않으면 메소드 이름을 bean 의 id 로 지정한다.
    //@Bean("myName") 또는 @Bean(name="myName")의 형식으로 id 지정할 수 있다.

    @Bean(name = "dotae")
    public DotaeDTO getDotae() {
        return new DotaeDTO(26, "student", "최다빈");
    }

}

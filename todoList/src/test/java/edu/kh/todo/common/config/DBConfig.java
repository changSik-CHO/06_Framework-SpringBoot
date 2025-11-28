package edu.kh.todo.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
/* @Configuration
 * - 스프링 설정용 클래스임 명시 (스프링이 해당 클래스 설정 정보로 인식하고 사용)
 * 
 * 
 * 
 * 
 * */

@Configuration
//@PropertySource : properties 파일의 내용을 이용하겠다는 어노테이션
//다른 properties도 추가하고 싶으면 어노테이션을 계속 추가
@PropertySource("classpath:/config.properties")
public class DBConfig {

}

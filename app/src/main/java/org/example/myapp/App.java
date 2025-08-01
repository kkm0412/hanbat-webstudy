package org.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/*
//스프링 부트를 실행할 수 있도록 기본정보를 자동 설정하는 annotation
@EnableAutoConfiguration // 톰캣 서버 실행에 관련된 기초 설정을 자동으로 처리

// @SpringBootApplication // anotation: bootRun시 시작 클래스 설정
// 다른 컴포넌트들도 스캔함. 현재 클래스와 같은 또는 하위 패키지들에서 컴포넌트들 찾아 자동생성하는 설정
// => @Component, @RestController, @Controller, @Service, @Repository등을 찾음
@ComponentScan
*/

@SpringBootApplication // = @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
@RestController
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args); // .class는 파일 확장자가 아님. .class 내의 부가정보 가져옴
    System.out.println("스프링 부트 서버시작!");
  }
}

// http://localhost:8080/여기서 실습. (로컬임)

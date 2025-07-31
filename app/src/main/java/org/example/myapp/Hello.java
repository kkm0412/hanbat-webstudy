package org.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 사용자 입력에 응답함.
@RequestMapping(path = "/hello")
public class Hello {

  public Hello() {
    System.out.println("Hello의 생성자가 호출됨");
  }

  @GetMapping(path = "/hi") // URL과 맵핑함.
  public String hi() { // 요청을 처리하는 메서드 ==> request handler
    return "Hellu?";
  }

  @GetMapping(path = "/hi2") // URL과 맵핑함.
  public String hi2(String name) { // URL의 '?name = "이름"에서 이름 받아옴"
    return "Hello! " + name + "!";
  }

  @GetMapping(path = "/hi3") // URL과 맵핑함.
  public String hi3() { // 요청을 처리하는 메서드 ==> request handler
    return "Hella!";
  }

  @GetMapping(path = "/hi4") // URL과 맵핑함.
  public String hi4() { // 요청을 처리하는 메서드 ==> request handler
    return "Helli!!!";
  }
}

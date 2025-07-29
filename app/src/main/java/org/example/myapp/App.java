package org.example.myapp;

import com.google.common.base.Joiner;
import org.example.util.Utils;

/** 이 클래스는 한밭대학교 특강 웹 실무 실습 예제를 위한 첫번째 클래스입니다. <code>App</code> */
public class App {
  /**
   * 프로그램의 시작점(main method)입니다. 콘솔에 "Hello World"를 출력합니다.
   *
   * @param args 커맨드라인 인자
   */
  public static void main(String[] args) {
    Utils.printMessage("Hello, world");
    String message = Joiner.on(", ").join("hellu", "world");
    System.out.println(message);
  }
}

package org.example.myapp;

import java.util.Scanner;

/**
 * 이 클래스는 한밭대학교 특강 웹 실무 실습 예제를 위한 첫번째 클래스입니다. <br>
 * <code>App</code>
 */
public class App {
  /**
   * 프로그램의 시작점(main method)입니다. 콘솔에 "Hello World"를 출력합니다.
   *
   * @param args 커맨드라인 인자
   */
  public static void main(String[] args) {
    String result = String.join(",", "aaa", "bbb", "ccc");
    System.out.println(result);

    //      int r = Math.abs(-100);
    //      System.out.println(r);
    //
    //      String str = "abcd";
    //      str.substring(2,6);
    //      //String.substring(2,6); <- 안됨

    Scanner scanner = new Scanner(System.in);
    // Scanner scanner = new Scanner(new FileInputStream("a.txt"));
    System.out.print("이름?: ");
    String name = scanner.nextLine();
    System.out.printf("이름은 %s 입니다\n", name);
    scanner.close();

   // PrintStream out2 = new PrintStream(new FileOutputStream("a.txt"));
   // out2.println("Hello");
  }
}

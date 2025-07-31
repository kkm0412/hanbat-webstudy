package org.example.myapp;


import java.util.Scanner;

/// **
// * 이 클래스는 한밭대학교 특강 웹 실무 실습 예제를 위한 첫번째 클래스입니다. <br>
// * <code>App</code>
// */
 public class App {
  /**
   * 프로그램의 시작점(main method)입니다. 콘솔에 "Hello World"를 출력합니다.
   *
   * @param args 커맨드라인 인자
   */
  public static void main(String[] args) {
    //    class Calculator{ //클래스.메소드의 이해를 위한 예시 코드
    //      int result;
    //      void plus(int a){
    //        this.result += a;
    //      }
    //      void minus(int a){
    //        this.result -= a;
    //      }
    //    }
    //
    //    Calculator c1 = new Calculator();
    //    Calculator c2 = new Calculator();
    //
    //    c1.plus(100);
    //    c2.plus(555);
    //    //중요사항 인스턴스 안에 메소드 없음!!! 값만 있음

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


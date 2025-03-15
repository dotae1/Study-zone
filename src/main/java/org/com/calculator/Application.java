package org.com.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {  // 반복 입력 가능하도록
            try {

                System.out.print("첫 번째 숫자를 입력하세요: ");
                double num1 = scanner.nextDouble();


                System.out.print("연산자(+, -, *, /)를 입력하세요: ");
                char operator = scanner.next().charAt(0);


                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = scanner.nextDouble();

                double result = 0;


                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("0으로 나눌 수 없습니다.");
                        }
                        result = num1 / num2;
                        break;
                    default:
                        throw new IllegalArgumentException("잘못된 연산자입니다. (+, -, *, / 중 입력)");
                }


                System.out.println("결과: " + result);
                break;

            } catch (InputMismatchException e) {
                System.out.println("❌ 숫자를 정확히 입력하세요!");
                scanner.nextLine(); // 버퍼 클리어

            } catch (ArithmeticException e) {
                System.out.println("❌ 오류: " + e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("❌ 오류: " + e.getMessage());

            } finally {
                System.out.println("---- 다시 입력해주세요 ----");
            }
        }

        scanner.close();
    }
}
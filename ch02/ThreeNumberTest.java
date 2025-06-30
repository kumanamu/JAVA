package ch02;

import java.util.Scanner;


public class ThreeNumberTest {
    public static void main(String[] args) {
        // 세 수를 차례로 입력받아요
        // 가장 큰 수와 작은 수를 출력합니다1
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;


        System.out.println("첫 번째 숫자를 입력하세요:");
        a = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요:");
        b = scanner.nextInt();

        System.out.println("세 번째 숫자를 입력하세요:");
        c = scanner.nextInt();

        System.out.println("입력하신 숫자는: " + a + ", " + b + ", " + c);

        maxValue = scanner.nextInt();
        maxValue = minValue;

         a = scanner.nextInt();
         b = scanner.nextInt();
         c = scanner.nextInt();

        if (a > b) {
            maxValue = a;
            minValue = b;
        } else {
            maxValue = b;
            minValue = a;
        }
        if (c > maxValue) {
            maxValue = c;
            if (c < minValue) {
                minValue = c;
            }
            System.out.println("가장 큰 숫자는 : " + maxValue);
            System.out.println("가장 작은 숫자는 : " + minValue);
        }
    }
}

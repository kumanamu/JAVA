package ch01;

public class Calcurator {
    // 두 수를 a = 20, b = 5
    // 두 수를 더하고, 빼고, 곱하고, 나눈 결과를
    // 각각 출력
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        double f = (double) a / b;

        System.out.println("초기값 출력 : " + "A = " + a + ", B = " + b);
        System.out.println("덧셈 결과 : " + c);
        System.out.println("뺄셈 결과 : " + d);
        System.out.println("곱셈 결과 : " + e);
        System.out.println("나눗셈 결과 : " + f);

        //나머지를 구하는 연산자(%)
        // 7 을 3으로 나눈 나머지


        System.out.println(7 % 3);
        // 3을 7로 나눈 나머지
        System.out.println(3 % 7);
        // 문제 7을 3으로 나눈 나머지와 몫을 구하시오
        System.out.println(("몫 : " + 7 % 3 + " 나머지 : " + 3 % 7));
        //위 방식은 결과를 다시 사용하지 않고 버려질때 변수로 전부 선언

        // 1. 몫
        int result = 7 / 3;
        System.out.println(result);

        // 덧셈
        // 뺄셈
        // 나눗셈
        // 곱셈
        // 7을 3으로 나눈 나머지
        // 3을 7로 나눈 나머지
        // 7을 3으로 나눈 나머지와 몫을 구하시오
        // 몫: 2 나머지 : 1
        // 1. 몫
        // 2. 나머지
        // 3. 출력값의 합


    }
}

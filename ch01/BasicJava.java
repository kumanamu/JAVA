package ch01;
// 두 수를 바꾸는 것.

public class BasicJava {
    public static void main(String[] args) {
        // 두 수 a, b를 바꾸려면
        // 0. 빈 변수를(정수) 만들어줌. => temp
        // 1. a를 temp에 넣는다.
        // 2. b를 a에 넣는다.
        // 3. temp를 b에 넣는다.
        // 4. 바꾼 이후의 a와 b를 출력해 본다
        // ---------------------------------
        // a와 b 변수와 temp를 선언하고, 초기값을 준다.
        int a = 10;
        int b = 20;
        int temp;
        //바꾸기 전 a, b를 출력
        System.out.println("A = " + a + ", B = " + b);
            // 두 수 a, b를 바꾸는 작업을 한다.
        temp = a; //a 값을 temp에 할당
        a = b;
        b = temp;
        // 두 수를 바꾼 후 출력
        System.out.println("A = " + a + ", B = " + b);
    }
}

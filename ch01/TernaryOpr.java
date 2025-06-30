package ch01;

//3항 연산자 처리
public class TernaryOpr {
    public static void main(String[] args) {
        int n1 = 5;
        // 조건비교 ? 참일떄 : 거짓일때;
        // n1과 10을 비교
        // 10보다 큰 값인지 작은값인지 출력
        String result; // 두 수를 비교한 결과


        result = n1 > 10 ? "크네요" : "작네요";
        System.out.println(result);

        //score 변수 생성 : 시험점수 70
        //점수가 60 이상이면 pass, Fail 을 출력

        int score = 59;

        String passOrNotpass;
        passOrNotpass = score >= 60 ? "Pass 축하" : "Fail 더 공부해라";
        System.out.println(passOrNotpass);

    }
}

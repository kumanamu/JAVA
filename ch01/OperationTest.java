package ch01;

import java.util.stream.Stream;

public class OperationTest {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int sum = n1 + n2;
        System.out.println(sum);
        String s1 = "반갑~습니다 반갑~습니다 저의 나이는";
        String s2 = "살 이에요";
        int age = 20;
        String result = s1 + age + s2;
        System.out.println(result);
        // 반가워요 나의 나이는 20살 이에요.

        // n1을 0으로 나눈 결과를 출력해보세요
        // system.out.println(n1 / 0);

        //비교연산자
        //>,<,>=,<=,==,!=
        //논리연산자
        // &&(and) , ll (or) , ! (not)
        // 비교 판단 ----- if 조건문에서


        // 비교연산과 논리연산의 결과는 항상 논리값
        boolean trueOrFlase;
        trueOrFlase = (1 == 2);
        System.out.println(trueOrFlase);

        trueOrFlase = (5 != 2);
        System.out.println(trueOrFlase);

        trueOrFlase = (5 >= 2);
        System.out.println(trueOrFlase);

        // x 라는 int 변수가 있고,
        // x 는 1 ~ 10 사이의 값이면, ture 아니면 flase
        // x 는 1보다 크고, x는 10보다 작거나 같다
        int x = 14;
        trueOrFlase = (1 <= x && x <= 10);
        System.out.println(trueOrFlase);

        trueOrFlase = (1 <= x || x <= 10);
        System.out.println(trueOrFlase);

        // 문자열 비교
        String gragd = "VIP";
        String myGrade = "VIP";
        //trueOrFlase = gragd == myGrade;
        trueOrFlase = gragd.equals(myGrade);
        System.out.println(trueOrFlase);


    }
}

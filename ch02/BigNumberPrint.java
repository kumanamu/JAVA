package ch02;

import java.util.Scanner;

public class BigNumberPrint {
    public static void main(String[] args) {
        //두 수를 차례로 입력받습니다
        // 그 중 큰수를 출력해 주세요
        //1. 그중 큰 수를 출력해 주세요.
        // first : 20 Second : 40
        //큰수 : 40
        //2. 입력받은 두 수를 바꾸어서 출력합니다
        // first : 20 Second : 40
        // 두수를 바꾼 결과는?
        // first : 40, second 20
        //Scanner sc = new Scanner(System.in)   }
        //Scanner sc1 = new Scanner(System.in)   }

        Scanner scan = new Scanner(System.in);
        System.out.println("첫 번째를 수를 입력하세요");
        int num1 = scan.nextInt();
        System.out.println("두 번째 수를 입력하세요");
        int num2 = scan.nextInt();

        System.out.println("입력 하신 두 수는 : ");
        System.out.println("First : " + num1 + ", Second : " + num2);

        if (num1 > num2) {
            System.out.println("큰 수 : " + num1);
        } else {
            System.out.println("큰 수 : " + num2);
        }

        int temp = num1;
        num1 = num2;
        num2 = temp;
        temp = num1;
        System.out.println("두 수를 바꾼 결과는?");
        System.out.println("큰수 = " + num1 + ", 작은수 =" + num2);

        System.out.println("당신의 성적을 입력해주세요");

        int score = scan.nextInt();
        String grade = "";
        //성적처리
        if (score >= 90) {
            grade = "수";
        } else if (score >= 80) {
            grade = "우";
        } else if (score >= 70) {
            grade = "미";
        } else if (score >= 60) {
            grade = "양";
        } else {
            grade = "가";
        }

        System.out.println("당신의 성적은 : " + grade );

        // 기준값 선언
        //int first = 20;
       // int second = 40;
       // int temp = 0;
        //int big;
        //int change;

      //  big = (first > second) ? first : second;
       // System.out.println(big);


     //   System.out.println("A = " + first + ", B= " + second);
      //  temp = first;
      //  first = second;
      //  second = temp;
       // System.out.println("A = " + first + ", B = " + second);
    }
}




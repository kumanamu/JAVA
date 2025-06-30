package ch02;

import java.util.Scanner;

public class ConfirmGender {
    public static void main(String[] args) {
        //주민등록번호 뒷자리 첫 숫자를 입력하세요.
        // 1 또는 3 이면 : 남자
        // 2 또는 4이면 : 여자
        // 5이면 : 외국인
        Scanner scan = new Scanner(System.in);

        System.out.println("당신의 주민등록번호 뒷자리 첫 숫자를 입력해주십시요");

        int num = scan.nextInt();
        String gender = "";

        if (num == 1 || num == 3) {
            gender = "남자";
        } else if (num == 2 || num == 4) {
            gender = "여자";
        } else if (num == 5) {
            gender = "외국인";
        } else {
            gender = "잘못 입력하였습니다. 다시 입력하시기 바랍니다.";;
        }

        System.out.println("당신의 성별은: " + gender + ", 입니다" );


    }
}
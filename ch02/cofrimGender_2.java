package ch02;

import java.util.Scanner;

public class cofrimGender_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);

        System.out.println("당신의 주민등록번호 뒷자리 첫 숫자를 입력해주십시요");

        int num = scan.nextInt();
        String gender = "";

        if (num < 1 || num > 5) {
            gender = "잘못 입력하였습니다. 다시 입력하시기 바랍니다.";
        } else if (num == 5) {
            gender = "외국인";
        } else if ((num % 2) == 1) {
            gender = "남자";
        } else {
            gender = "여자";
        }

        System.out.println("당신의 성별은: " + gender + ", 입니다" );

    }
}

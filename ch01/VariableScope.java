package ch01;

    // 요기는 실행 안됨
    // 1. 클래스 밖에 선언 안됨

    //int  a = 3;

    public class VariableScope {
        static int b = 5;
        public static void main(String[] args) {
            // static -< mian() 안에 있기 때문에
            // a 변수값을 사용 할 수 있다.
            int a = 3;
            System.out.println("a = " + a);
            // b 출력
            System.out.println("b = " + VariableScope.b);
        }
    }

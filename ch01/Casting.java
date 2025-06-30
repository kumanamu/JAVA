package ch01;

public class Casting {
    public static void main(String[] args) {
        //형변환
        //다운캐스팅(down-casting)
        //업케스팅(up-casting)
        int n1 = 100; // 4byte(21억)
        System.out.println(n1);
        double d1 = n1; // 묵시적 캐스팅
        System.out.println(d1);

        long longtype = 100;
        int inttype = (int) longtype; // 명시적 다운 캐스팅
        System.out.println(inttype);
    }
}

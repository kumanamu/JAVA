package ch01;
//클래스 변수
class IveMember {
    //장원영을 표현 할 수 있는
    //Properties(멤버)- 속성
    String name;
    int age;
    double heigt;

    //메서드(Method)
    void dance() {
        System.out.println("장원영이 춤을 춰요");
            }
    //int dance(int 돈 int 장바구니) {
    //빙구문구 감,
    //아이스크림 고름
            //잔돈받음
            //귀가함
    }

class Jang {
    public static void main(String[] args) {
        IveMember jang = new IveMember(); //인스턴스
        jang.name = "장원영";
        jang.age = 23;
        jang.heigt = 173.5;
        jang.dance();
        System.out.println(jang.name);
    }
}
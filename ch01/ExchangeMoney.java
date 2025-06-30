package ch01;

public class ExchangeMoney {


    //잔액을 출력하는 함수


    public static void main(String[] args) {
        // 2,680원을 1,000원, 500원, 100원, 50원, 10원
        // 각각 몇 개씩 최소로 필요한지 출력하세요
        // 금액 : 2,680원
        // 1000원 : 2개
        // 500원 : 1개
        // 100원 : 1개
        // 50원 : 1개
        // 10원 : 3개
        // main
        int coin = 2680; // 초기값 데이터
        int restCoin = coin;

        System.out.println("최종 적으로 필요한 권종의 종류와 수량은 하기와 같다");

        System.out.println(" 바꿀 돈 : " + coin);
        // 1000원권의 갯수

        restCoin = restCoinPrint(restCoin,1000);

        //500원의 갯수

        restCoin = restCoinPrint(restCoin,500);

        //100원의 갯수

        restCoin = restCoinPrint(restCoin, 100);

        //50원의 갯수

        restCoin = restCoinPrint(restCoin, 50);
        //10원의 갯수

        restCoin = restCoinPrint(restCoin, 10);
    }


    static int restCoinPrint(int restCoin, int don){
        System.out.println(don + " 원의 갯수 : " + (restCoin / don));
        restCoin = restCoin % don;
        System.out.println("잔액 : " + restCoin);
        return restCoin;



        //int a1 = (2680 / 1000);
       // int a2 = (2680 % 1000);
       // int a3 = (a2 / 500);
       // int a4 = (a2 % 500);
      //  int a5 = (a4 / 100);
      //  int a6 = (a4 % 100);
     //   int a7 = (a6 / 50);
       // int a8 = (a6 % 50);
      //  int a9 = (a8 / 10);
    //    int a10 = (a8 % 10);

        //String result = "2,680원에서 각각 필요한 권종은 각 하단과 같다";
      //  System.out.println(result);
       // System.out.println("1,000원권" + " " + a1 + "개");

       // System.out.println("500원권" + " " +a3 + "개");

      //  System.out.println("100원권" + " " +a5 + "개");

       // System.out.println("50원권" + " " +a7 + "개");

       // System.out.println("10원권" + " " +a9 + "개");



       // int s1 = if (1 >= a1 || a1 >= 3) {
       // } else {2
       // }
       // System.out.println(s1);

       // int s2 = if (0 < a5 && a5 < 2)
        //    a5 = 1;
       // System.out.println(s2);

       // int s3 = if (0 < a7 && a7 < 2)
       //     a7 = 1;
       // System.out.println(s3);

        //int s4 = if (2 < a9 && a9 < 4)
          //  a9 = 31;
       // System.out.println(s2);



        //String r2;
        //r2 = 0< a3 < 2  "1개";
         //System.out.println(r2);

            //String r3;
        //r3 = 0< a5 < 2  "1개";
         //System.out.println(r3);


        //String r4;
        //r4 = 0< a7 < 2  "1개";
         //.out.println(r4);


        //String r5;
        //r5 = 2< a9 < 4  "3개";
        //System.out.println(r5);
    }
}

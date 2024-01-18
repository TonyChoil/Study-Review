package inflearn.basicTest;

public class CompoundInterest {
    static int lastYear = 0, savedTotal = 0; ;
    static void CompoundInterest(int save, double rate, int year){
        double sum = 0;

        for(int i = 1; i <= year; i++){
            if(i > 1) save += 200;
            sum = sum * rate + save;
            if(sum >= 10000){
                System.out.println(i + "년 차 예금액 : " +(int)sum/10000 + "억 " +(int)sum%10000 + "만원");
            } else{
                System.out.println(i + "년 차 예금액 : " + (int)sum + "만원");
            }
            System.out.println("올해 저축 : " + save + "만원");
            savedTotal += save;
            double plusRate = (sum-savedTotal) / savedTotal;
            System.out.print("원금 대비 이율 : " );
            System.out.printf("%.3f%%\n", plusRate*100);
            int plusMoney = (int)sum-savedTotal;
            if(plusMoney > 10000) System.out.println("이자 금액 : " + plusMoney/10000 + "억" + plusMoney%10000 + "만원");
            else System.out.println("이자 금액 : " + plusMoney + "만원");
            System.out.println("전년 대비 : " + (plusMoney - lastYear) + "만원 증가");
            lastYear = plusMoney;

        }
    }

    public static void main(String[] args) {
        CompoundInterest(500, 1.08, 20);
    }
}

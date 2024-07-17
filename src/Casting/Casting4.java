package Casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2; //1.5
        System.out.println("div1 = " + div1); //1 >> int타입 계산, int타입 결과

        double div2 = 3 / 2; //1.5
        System.out.println("div2 = " + div2); //1.0 >> int타입 계산, double타입 결과

        double div3 = 3.0 / 2; //1.5
        System.out.println("div3 = " + div3); //1.5 >> double 타입 계산, double타입 결과

        double div4 = (double) 3 /2;
        System.out.println("div4 = " + div4); //1.5 >> 명시적 형변환으로 double타입 계산, double타입 결과

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);
    }
}

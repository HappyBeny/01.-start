package Casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //앞에 (int)적어준 게 명시적 형변환
        System.out.println(intValue); //정수로 바꾸면서 소수부분 버림(doubleValue 값 자체가 바뀌지 않음)

        System.out.println((int) 10.5); //int 형변환으로 0.5 사라짐

        int z = (int) 10.5; //int 형변환으로 10.5 지정했으니 0.5 사라지고 10 출력
        System.out.println(z);

        System.out.println("doubleValue = " + doubleValue);
    }
}

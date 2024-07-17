package Casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue);
        //int 가장 작은 값(-2147483648부터 1씩 커지는 걸로 다시 시작)
        //62분이 시계에는 2분으로 표시되는 것처럼!
    }
}

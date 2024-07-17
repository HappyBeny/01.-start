package Scanner.Ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요 : ");
        int a = input.nextInt();
        System.out.println();
        System.out.println(a + "단의 구구단 결과");

        for (int b=1; b <= 9; b++) {
            System.out.println(a + " x " + b + " = " + a * b);
        }

    }
}

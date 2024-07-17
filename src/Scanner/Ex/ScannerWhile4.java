package Scanner.Ex;

import java.util.Scanner;

public class ScannerWhile4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        String item;
        int price;
        int num2;
        int sum2 = 0;

        System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
        while (true){
            num1 = scanner.nextInt();
            if (num1 == 1){
                System.out.print("상품명을 입력하세요 : ");
                item = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                num2 = scanner.nextInt();

                int sum = price * num2;

                System.out.println("상품명 : " + item + ", 가격 : " + price + ", 합계 :" + sum);

                sum2 += sum;
            } else if (num1 == 2) {
                System.out.println("총 비용 : " + sum2);
                sum2 = 0;
            } else if (num1 == 3) {
                System.out.println("프로그램을 종료합니다.");
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }

    }
}

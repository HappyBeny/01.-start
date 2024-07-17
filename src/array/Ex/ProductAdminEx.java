package array.Ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        //10칸을 숫자로 지정하는 대신 int maxProduct=10을 지정했으면 수정이 쉬웠을듯
        Scanner scanner = new Scanner(System.in);
        String[] PN = new String[10];
        int[] PP = new int[10];
        int pCount = 0;

        while (true) {
            System.out.println("1. 상품 등록, 2. 상품 목록, 3. 종료.");
            System.out.print("메뉴를 선택하세요 : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1){
                if (pCount > 9){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    System.out.println();
                    continue;
                    }

                    System.out.print("상품 이름을 입력하세요 : ");
                    PN[pCount] = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요 : ");
                    PP[pCount] = scanner.nextInt();
                    System.out.println();

                    pCount++;
            } else if (option == 2) {
                if (pCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    System.out.println();
                    continue;
                }
                for (int i = 0; i < pCount; i++){
                    System.out.println(PN[i] + " : " + PP[i] + "원");
                }
                System.out.println();
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
                System.out.println();
            }
        }
    }
}

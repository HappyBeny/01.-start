package Scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요('종료'를 입력하면 종료) : ");
            String username = scanner.nextLine();
            if (username.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("입력한 이름 : " + username + ", 입력한 나이 : " + age);
            System.out.println();
        }
    }
}

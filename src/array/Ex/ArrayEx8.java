package array.Ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요 : ");
        int num = scanner.nextInt();

        int[][] score = new int [num][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < num; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요.");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + " 점수 : ");
                score[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < num; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += score[i][j];
            }
            double ave = total / 3.0;
            System.out.print((i + 1) + "번 학생의 총점 : " + total);
            System.out.println(", 평균 : " + ave);
        }
    }
}

package array.Ex;

import java.util.Scanner;

public class ArrayEx7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grade = new int [3][4]; //정답은 [4][3]인데 난 왜 잘되냐?
        int[] sum = new int [4];
        double[] ave = new double[4];

        for (int i = 1; i < 5; i++) {
            System.out.println(i + "번 학생의 성적을 입력하세요.");
            System.out.print("국어 점수 : ");
            int score = scanner.nextInt();
            sum[(i - 1)] += score;

            System.out.print("수학 점수 : ");
            score = scanner.nextInt();
            sum[(i - 1)] += score;

            System.out.print("영어 점수 : ");
            score = scanner.nextInt();
            sum[(i - 1)] += score;

            ave[(i-1)] = (double) sum[(i - 1)] / 3;
        }
        for (int i = 1; i < 5; i++) {
            System.out.print(i + "번 학생의 총점 : " + sum[(i - 1)]);
            System.out.println(", 평균 : " + ave[(i - 1)]);
        }
    }
}

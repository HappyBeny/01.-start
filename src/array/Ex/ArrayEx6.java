package array.Ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        int minNum, maxNum;

        System.out.println(n + "개의 정수를 입력하세요.");
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
            }

        minNum = maxNum = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < minNum){
                minNum = nums[i];
            }
            if (nums[i] > maxNum){
                maxNum = nums[i];
            }
        }

        System.out.println("가장 작은 정수 : " + minNum);
        System.out.println("가장 큰 정수 : " + maxNum);
    }
}

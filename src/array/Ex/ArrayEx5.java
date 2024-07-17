package array.Ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int quantity;
        int sum = 0;
        double ave;

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        quantity = scanner.nextInt();
        scanner.nextLine();

        int[] nums = new int[quantity];

        System.out.println(quantity + "개의 정수를 입력하세요.");

        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }
        ave = sum / nums.length;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + ave);
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int quantity = scanner.nextInt();
        int[] nums = new int [quantity];
        int sum = 0;
        double ave;

        System.out.println(quantity + "개의 정수를 입력하세요.");
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }
        ave = sum / nums.length;

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + ave);
    }
}

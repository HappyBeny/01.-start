package loop;

public class Break2_1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (i = 1; sum <= 10 ; i++) {
            sum = sum + i;
        }
        System.out.println("합이 10보다 크면 종료: i = " + i + ", sum = " + sum);
    }
}

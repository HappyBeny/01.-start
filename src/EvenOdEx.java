public class EvenOdEx {

    public static void main(String[] args) {
        int x = 128746;

        String result = (x % 2 == 1) ? "홀수" : "짝수";
        System.out.println("x = " + x + ", " + result);
    }
}

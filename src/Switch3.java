public class Switch3 {

    public static void main(String[] args) {
        int grade = 3;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("쿠폰 적용 금액은 " + coupon + "원입니다.");
    }
}

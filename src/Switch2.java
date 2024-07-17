public class Switch2 {

    public static void main(String[] args) {

        int grade = 3;

        int coupon;
        switch (grade) {
            case 1 :
                coupon = 1000;
                break;
            case 2 :
                coupon = 2000;
                break;
            case 3 :
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
            }
        System.out.println("쿠폰 적용 금액은 " + coupon + "원입니다.");
        }
    }
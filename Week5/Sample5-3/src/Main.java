void main() {
    Scanner input = new Scanner(System.in);
    int apple;
    int pear;
    int payment;
    final int APPLE = 500;
    final int PEAR = 600;
    int price;
    boolean flag;
    String result;

    System.out.print("구입한 사과 개수: ");
    apple = input.nextInt();
    System.out.print("구입한 배 개수: ");
    pear = input.nextInt();
    System.out.print("지불한 금액 : ");
    payment = input.nextInt();

    price = APPLE * apple + PEAR * pear;
    flag = payment >= price;
    result = flag == true ? String.format("물품가격 : %,d원\n" +
            "지불 금액: %,d원\n" +
            "반환 금액: %,d원\n", price, payment, payment-price):
            "금액이 부족합니다.";

    System.out.println(result);
}

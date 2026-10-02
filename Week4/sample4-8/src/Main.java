void main() {
    Scanner input = new Scanner(System.in);
    float exchange;
    int money;
    float dollar;

    System.out.print("달러에 대한 원화 환율을 입력: ");
    exchange = input.nextFloat();
    System.out.print("원화 금액을 입력: ");
    money = input.nextInt();

    dollar = money/exchange;

    System.out.printf("원화(\u20a9) %,d원은 %.2f 달러(\u0024)입니다.\n", money, dollar);
}

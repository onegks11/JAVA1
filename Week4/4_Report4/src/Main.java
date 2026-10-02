void main() {
    Scanner input = new Scanner(System.in);
    int sell_cost;
    int cost;
    int tax;

    //입력
    System.out.print("판매 금액을 입력해 주세요: ");
    sell_cost = input.nextInt();
    
    //정보
    tax = sell_cost / 11;
    cost = sell_cost - tax;
    
    //출력
    System.out.printf("판매 금액: %d 원\n", sell_cost);
    System.out.printf("금액 : %d 원\n", cost);
    System.out.printf("세금 : %d 원\n", tax);
}

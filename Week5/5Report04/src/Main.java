void main() {
    Scanner input = new Scanner(System.in);
    int payment;
    char membership;

    System.out.print("총 구매 금액을 입력하시오: ");
    payment = input.nextInt();
    System.out.print("멤버십 회원 입니까? (Y / N): ");
    membership = input.next().charAt(0);

    String result = payment < 0 ? "오류: 구매금액이 음수입니다." :
            (payment >= 50000 || (membership == 'Y' && payment >= 30000))
                    ? "무료배송 가능" : "무료배송 불가";

    System.out.println(result);
}

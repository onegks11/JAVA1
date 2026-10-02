void main() {
    double a = 1500.35;
    double b = 890.76;

    int sum = (int)(a+b);
    double tax = sum/10.0;
    int result = (int)(sum - tax);

    System.out.printf("이자1 = %.2f 원\n", a);
    System.out.printf("이자2 = %.2f 원\n", b);
    System.out.printf("합계 = %,d 원\n", sum);
    System.out.printf("세금 = %,d 원\n", (int)tax);
    System.out.printf("순수 이자 = %,d 원\n", result);

}

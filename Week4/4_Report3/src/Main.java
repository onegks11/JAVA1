void main() {
    Scanner input = new Scanner(System.in);
    double weight;
    double moon;

    System.out.print("당신의 몸무게를 입력해주세요: ");
    weight = input.nextFloat();

    moon = weight * (16.5/100);

    System.out.printf("지구에서의 몸무게: %.2f\n", weight);
    System.out.printf("달에서의 몸무게: %.2f\n", moon);
}

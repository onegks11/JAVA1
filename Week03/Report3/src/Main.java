void main() {
    Scanner input = new Scanner(System.in);
    double celsius;
    double fahrenheit;

    System.out.print("섭씨 온도를 입력하세요: ");
    celsius = input.nextFloat();
    fahrenheit = (celsius * 9/5) +32;

    System.out.printf("%.2f℃ 는 %.2f℉로 변환된다.", celsius, fahrenheit);
}

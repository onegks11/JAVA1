void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;
    int 사각형면적;
    double radius;
    double 원의면적;
    final double PI = 3.141592;
    double area;

    System.out.print("정사각형의 한변의 길이 입력(예 5) ");
    base = keyboard.nextInt();

    사각형면적 = base * base;
    radius = base / 2.0;
    원의면적 = PI * radius * radius;
    area = 사각형면적 - 원의면적;

    System.out.printf("한 변의 길이가 %,d Cm인 정사각형의 면적은 %,d \u33a0\n", base, 사각형면적);
    System.out.printf("반지름이 %,.2f Cm인 원의 면적은 %,.2f \u33a0\n", radius, 원의면적);
    System.out.printf("구하는 면적 : %,.2f \u33a0\n", area);
}
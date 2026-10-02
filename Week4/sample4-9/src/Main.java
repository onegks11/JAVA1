//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    int base;
    int height;
    float area;

    System.out.print("삼각형의 밑변은? ");
    base = input.nextInt();
    System.out.print("삼각형의 높이은? ");
    height = input.nextInt();

    area = base * height / 2.0f;

    System.out.print("**** 삼각형 넢이 구하기 ****\n");
    System.out.printf("\t 밑변 : %d Cm\n", base);
    System.out.printf("\t 높이 : %d Cm\n", height);
    System.out.printf("\t 넓이 : %.2f \u33a0\n", area);
}

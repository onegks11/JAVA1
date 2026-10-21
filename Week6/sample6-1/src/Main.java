void main() {
    Scanner input = new Scanner(System.in);
    int age;
    final long Heart = 65L; //Symbolic Constant(기호적 상수)
    final int DayOfYear = 365;

    System.out.print("몇 년동안 사셨습니까? : ");
    age = input.nextInt();

    int day = age * DayOfYear;
    int hour = day * 24;
    int min = hour * 60;

    long count = min * Heart;


    System.out.printf("사람은 평균 분당 %d회 심장이 박동한다\n", Heart);
    System.out.printf("%d년 동안 심장이 %,d회 박동했습니다\n", age, count);

}

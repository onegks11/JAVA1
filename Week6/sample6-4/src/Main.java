void main() {
    Scanner input = new Scanner(System.in);
    final int CigaPrice = 4500;
    final int LIFE = 7;
    int cigaYear;
    int ciga;
    int money;

    System.out.print("당신은 몇년동안 담배를 피웠나? : ");
    cigaYear = input.nextInt();
    System.out.print("당신은 하루 평균 몇 개비 피우나? : ");
    ciga = input.nextInt();


    int day = cigaYear * 365;
    int count = day * ciga;

    int min = count * LIFE;
    int hour = min / 60;
    min = min % 60;
    int life_day = hour /24;
    hour = hour % 24;
    int year = life_day / 365;
    life_day = life_day % 365;

    int gap = count / 20 + (count % 20 != 0 ? 1: 0);
    money = gap * CigaPrice;

    System.out.printf("당신은 하루에 %d 개비씩 %d년동안 피웠다.\n", ciga, cigaYear);
    System.out.printf("하루에 %d개비씩 %d년동안 피우면, %d년 %d일 %d시간 %d분 수명이 단축된다.\n",ciga, cigaYear, year, life_day, hour, min);
    System.out.printf("당신은 담배를 구매하기 위해 %,d원을 사용하였다\n.", money);
}

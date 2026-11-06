void main() {
    final int MONEY = 100000000;
    final int MONTH = 2000000;
    int month;
    int buget = MONEY;

    for(month = 1; true; month++){
        buget -= MONTH;
        if(month % 12 == 0){
            buget += (int)(buget * (5/100.0f));
        }

        if(buget <= MONTH){
            month--;
            break;
        }
        System.out.printf("(%d개월 후) 원금 : %,11d원\n", month, buget);
    }

    System.out.printf("%d개월 까지 살 수 있습니다.(남은 잔고 : %,d원)\n", month, buget);
}

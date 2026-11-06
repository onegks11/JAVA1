void main() {
    int day = 1;
    final int START = 1;        //1원
    final int TARGET = 100000000;
    int total = 0;

    for(int i = START; true; i*=2){
        total+=i;
        System.out.printf("오늘 저축 금액 = %,11d원, %3d일 = %,11d 원\n", i, day, total);

        if(total>=TARGET)
            break;

        day++;
    }
    System.out.printf("%d일에 %,d원이 됩니다.\n", day, total);
}

void main() {
    final int START = 1;
    final int END = 100;
    int total = 0;


    for (int i = START; true; i++){
        if(i % 3 == 0 && i % 5 != 0)
            continue;

        total += i;

        if(i == END){
            break;
        }
    }

    System.out.printf("1~100까지의 합은 %,d입니다.\n", total);
}

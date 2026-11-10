void main() {
    final int TOTAL = 37;
    final int C_LEG = 2;
    final int D_LEG = 4;
    final int TOTAL_LEG = 102;
    int chicken=0;
    int dog = 0;


    while(true){
        dog = TOTAL - chicken;

        if(dog*D_LEG + chicken*C_LEG == TOTAL_LEG){
            break;
        }

        chicken++;
    }


    System.out.printf("닭과 개의 합: %d 마리, 전체 닭과 개의 다리 수 합: %d 개 일때\n 닭은 %d 마리, 개는 %d 마리 이다.", TOTAL, TOTAL_LEG, chicken, dog);

}

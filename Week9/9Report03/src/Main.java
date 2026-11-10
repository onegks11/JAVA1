void main() {
    final int DEPTH = 300;
    final int MORN = 55;
    final int NIGHT = 13;
    int distance = 0;
    int day = 1;

    while(true){
        distance += MORN - NIGHT;
        if(distance>=DEPTH){
            break;
        }

        System.out.printf("%d일차: %d cm 올라갔습니다.(%d cm 남았습니다.)\n", day, distance, DEPTH-distance);
        day++;
    }

    System.out.printf("총 %d일 걸렸습니다.\n", day);
    if(day<=7){
        System.out.print("방울꽃이 시드는 모습을 볼 수 있었습니다.\n");
    }
    else{
        System.out.printf("방울꽃이 시드는 모습을 보지 못했습니다.\n");
    }
}

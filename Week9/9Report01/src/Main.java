void main() {
    Scanner input = new Scanner(System.in);
    double height;
    double total = 0;

    System.out.print("초기 높이를 설정하시오: ");
    height = input.nextFloat();

    for(int i = 0; i<10; i++){
        System.out.printf("공의 %d번째 낙하 높이 : %,.4f m\n", i+1, height);
        if(i == 0){
            total += height;
        }
        else{
            total += height*2;
        }
        height *= 2.0/3;
    }

    System.out.printf("총 이동거리 : %,.4f m\n", total);
}

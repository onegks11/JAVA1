void main() {
    Scanner input = new Scanner(System.in);
    int width,length,height;
    int volume;

    //입력
    System.out.print("직육면체 가로, 세로, 높이 입력 : ");
    width = input.nextInt();
    length = input.nextInt();
    height = input.nextInt();

    //부피 값
    volume = width*length*height;
    
    //출력
    System.out.printf("직육면체 가로: %dCm\n",width);
    System.out.printf("직육면체 세로: %dCm\n",length);
    System.out.printf("직육면체 높이: %dCm\n",height);
    System.out.printf("직육면체 부피: %dCm³\n",volume);
}

void main() throws IOException {
    Scanner input = new Scanner(System.in);
    final int SIZE = 30;
    char answer;
    String result;

    for(int i = 1 ; i<=SIZE; i++){

    while (true){ //무한루프
        System.out.printf("%d번 학생 출석했나요?(Y/N): ", i);
        answer = input.nextLine().charAt(0);

        if(answer == 'Y' || answer == 'y' || answer == 'N' || answer=='n')
            break;
        else {
            System.err.print("error");
            System.in.read();
        }
    }


    if(answer == 'Y' || answer == 'y'){
        result = "출석";
    }
    else{
        result = "결석";
    }

    System.out.printf("%d 번 학생은 %s입니다.\n", i,result);

    }
}

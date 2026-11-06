void main() throws IOException {
    Scanner input = new Scanner(System.in);
    final int START = 1;
    final int END = 100;
    int total = 0;
    int first, last;
    String result;
    char answer;

    for (int i = START; i<=END; i++){
        total += i;
    }

    System.out.printf("1~100까지의 합은 %d입니다.\n", total);

    //----------------------------------------------------------
    while(true) {
        while (true) {
            System.out.print("어디부터 시작하나?: ");
            first = input.nextInt();

            System.out.print("어디까지 더하나?: ");
            last = input.nextInt();

            if (first <= last)
                break;
            else {
                System.err.print("시작 값이 마지막 값보다 크다");
                System.in.read();
            }
        }
        total = 0;
        for (int i = first; i <= last; i++) {
            total += i;
        }
        if (first != last) {
            result = String.format("%d~%d까지의 합은 %d입니다.\n", first, last, total);
        } else {
            result = String.format("합은 %d입니다.\n", total);
        }

        System.out.println(result);

        while (true) {
            System.out.print("계속 진행하겠습니까? (y/n): ");
            input.nextLine();
            answer = input.nextLine().charAt(0);
            if(answer == 'y' || answer == 'n')
                break;
            else{
                System.err.println("입력 방식이 잘못되었습니다. 입력 방식 >> (y또는 n)");
                System.in.read();
            }
        }

        if(answer == 'n'){
            break;
        }
    }
}

void main() throws IOException {
    Scanner input = new Scanner(System.in);
    int start, end;
    int even = 0,odd = 0;
    char answer;

    while (true) {
        even = 0;
        odd = 0;
        for (; true; ) {
            System.out.print("시작위치 선택(정수형): ");
            start = input.nextInt();
            System.out.printf("마지막위치 선택(정수형/ 최소값 = %d): ", start + 5);
            end = input.nextInt();

            if (end >= start + 5 && start > 0)
                break;
            else {
                System.err.printf("Error: 마지막 값이 (%d)보다 작다", start + 5);
                System.in.read();
            }
        }

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }

        }

        System.out.printf("%d ~ %d까지의 합은 %,d\n", start, end, even + odd);
        System.out.printf("\t짝수의 합은 %,d\n", even);
        System.out.printf("\t홀수의 합은 %,d\n", odd);

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

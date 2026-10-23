void main() {
    Scanner input = new Scanner(System.in);
    int n1, n2, n3;
    int result;

    System.out.print("세 정수를 입력해 주세요 : ");
    n1 = input.nextInt();
    n2 = input.nextInt();
    n3 = input.nextInt();

    if(n1 >= n2){
        if(n1 >= n3){
            result = n1;
        }
        else {
            result = n3;
        }
    }
    else{
        if(n2 >= n3){
            result = n2;
        }
        else {
            result = n3;
        }
    }

    System.out.printf("%,d / %,d / %,d 중 가장 큰 정수는 %,d입니다.\n", n1, n2, n3, result);
}

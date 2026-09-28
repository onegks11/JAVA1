void main() {
    //선언
    Scanner input = new Scanner(System.in);
    int num1; //첫번째 값
    int num2; //두번쨰 값
    int result; // 결과 계산

    //입력 및 계사
    System.out.print("첫번째 숫자를 입력해주세요 : ");
    num1 = input.nextInt();
    System.out.print("두번째 숫자를 입력해주세요 : ");
    num2 = input.nextInt();
    result = num1+num2;
    
    //결과 출력
    System.out.printf("%d + %d = %d", num1, num2, result);
}

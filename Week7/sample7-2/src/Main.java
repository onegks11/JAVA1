void main() {
    Scanner input = new Scanner(System.in);
    int num1, num2;
    float result;
    String message;

    System.out.print("분자 입력: ");
    num1 = input.nextInt();
    System.out.print("분모 입력 : ");
    num2 = input.nextInt();

    if(num2 == 0){
        message = "분모가 0이라서 나눗셈을 할 수 없다.";
    }
    else{
        result = (float) num1 / num2;
        message = String.format("%d / %d = %.2f", num1, num2, result);
    }
    System.out.println("if ~ else : " + message);


    switch (num2){
        case 0:
            message = "분모가 0이라서 나눗셈을 할 수 없다.";
            break;
        default:
            result = (float) num1 / num2;
            message = String.format("%d / %d = %.2f", num1, num2, result);
    }

    System.out.println("switch : " + message);
}

void main() {
    Scanner input = new Scanner(System.in);
    int num;
    String result;
    String result1, result1_1;
    char result2, result2_1;
    String result3, result3_1;

    System.out.print("양의 정수를 입력하시오 : ");
    num = input.nextInt();


    if(num > 0) {
        result = num % 2 == 0 ? "짝수" : "홀수";


        if (num % 2 == 0) {
            result1 = "짝수";
            result2 = '짝';
            result3 = String.format("%d는 짝수입니다.", num);
        } else {
            result1 = "홀수";
            result2 = '홀';
            result3 = String.format("%d는 홀수입니다.", num);
        }

        switch (num % 2) {
            case 0:
                result1_1 = "짝수";
                result2_1 = '짝';
                result3_1 = String.format("%d는 짝수입니다.", num);
                break;
            case 1:
                result1_1 = "홀수";
                result2_1 = '홀';
                result3_1 = String.format("%d는 홀수입니다.", num);
                break;
            default:
                result1_1 = "Error";
                result2_1 = 'E';
                result3_1 = "Error";
        }


        //if문
        System.out.printf("%d는 %s입니다.\n", num, result);
        System.out.printf("%d는 %s입니다.\n", num, result1);
        System.out.printf("%d는 %c수입니다.\n", num, result2);
        System.out.println(result3);

        //switch문
        System.out.printf("%d는 %s입니다.\n", num, result1_1);
        System.out.printf("%d는 %c수입니다.\n", num, result2_1);
        System.out.println(result3_1);
    }
    else{
        System.out.print("Error");
    }
}

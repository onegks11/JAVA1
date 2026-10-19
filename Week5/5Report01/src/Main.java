void main() {
    Scanner input = new Scanner(System.in);
    int a, b, c; // 입력 받을 정수
    String result;

    System.out.print("3개의 정수를 입력하시오 : ");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    result = (a>0 && b>0 && c>0) ? "모두 양수입니다." :
            (a<0 || b<0 || c<0) ? "음수를 포함하고 있습니다." :
                    (a==0 && b==0 && c==0) ? "모두 0입니다." : "3개의 조건에 포함되지 않는다";

    System.out.print(result);
}

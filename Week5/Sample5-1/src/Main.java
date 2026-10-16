void main() {
    Scanner input = new Scanner(System.in);
    int width;
    int height;
    char type;
    int area;
    boolean flag;

    System.out.print("사각형의 가로 길이 입력 (예: 5): ");
    width = input.nextInt();
    System.out.print("사각형의 세로 길이 입력 (예: 5): ");
    height = input.nextInt();

    flag = (width>0 && height >0) ? true:false;

    type = width == height ? '정':'직';
    area = width*height;

    String result = flag == true ? String.format(
            "**** %c사각형 넓이 ****\n" +
                    "\t가로 길이: %dcm\n" +
                    "\t세로 길이: %dcm\n" +
                    "\t넓이 : %dcm²\n"
            , type, width, height, area
    ) : "데이터 오류입니다.";

    System.out.println(result);
}

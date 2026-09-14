void main() {
    Scanner input = new Scanner(System.in);
    int radius;
    int side; //정사각형의 한 변의 길이 >> radius*2
    int square_Area; //정사각형 넓이
    double circle_Area;// r*r*3.14
    double result;

    //원의 반지름을 입력 받자
    System.out.print("원의 반지름: ");
    radius = input.nextInt();

    //계산
    side = radius*2; // 정사각형 한 변
    square_Area=side*side;// 정사각형 넓이
    circle_Area= radius * radius * 3.14;//원의 넓이
    result = square_Area-circle_Area;// 정사각형 넓이 - 원의 넓이

    //결과 출력
    System.out.printf("\n정사각형 면적: %dcm²", square_Area);
    System.out.printf("\n원의 면적: %.2fcm²",circle_Area);
    System.out.printf("\n구하고자 하는 면적: %.2fcm²",result);
}

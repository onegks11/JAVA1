void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;
    double area;

    System.out.print("원의 반지름을 입력(정수형): ");//반지름 prompt
    radius = keyboard.nextInt();
    area =  radius * radius * 3.141592;
    System.out.printf("반지름이 %dcm인 원의 넓이는 : %,.2fcm²",radius, area);
}

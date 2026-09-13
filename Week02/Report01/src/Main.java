
void main() {
    Scanner input = new Scanner(System.in);
    int age; //나이
    float weight;//몸무게
    float height;//키

    //나이, 몸무게, 키 입력받기
    System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요.");
    age = input.nextInt();
    weight = input.nextFloat();
    height = input.nextFloat();
    
    //결과 출력
    System.out.printf("당신의 나이는 %d살 입니다.\n", age);
    System.out.printf("당신의 체중은 %.1fkg 입니다.\n", weight);
    System.out.printf("당신의 신장은 %.1fcm 입니다.\n", height);
}


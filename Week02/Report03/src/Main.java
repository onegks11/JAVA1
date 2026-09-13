void main() {
    Scanner input = new Scanner(System.in);
    String name; //이름
    int family_num; //가족 수
    String address;// 주소

    //이름, 가족 수 , 주소 입력받기
    System.out.print("당신의 이름은? ");
    name = input.nextLine();
    System.out.printf("%s님의 가족은 몇 명입니까? ", name);
    family_num = input.nextInt();
    input.nextLine(); // input.nextInt()는 입력 엔터를 읽지 못하기 때문에 제거해야함
    System.out.printf("%s님의 가족은 어디에서 살지요? ", name);
    address = input.nextLine();

    //결과 출력
    System.out.printf("\n%s님의 가족은 %d명 입니다.\n", name, family_num);
    System.out.printf("%s님의 가족은 %s에서 살고 있습니다.\n", name, address);
}

void main() {
    Scanner input = new Scanner(System.in);
    int age;
    int fee;
    boolean flag;
    String result;

    System.out.print("나이 입력 :");
    age = input.nextInt();

    flag = (age>=0 && age <= 120);
    fee = (age <= 7 || age >= 65) ? 0:
            (age >= 8 && age <=13 ? 3000: (age>=14 && age<=19 ? 4000 : 5000));

    result = flag == true ? String.format(
            "나이 : %d 세 \n" + "요금 : %d 원 \n", age, fee
    ) : "나이 오류 입니다.";

    System.out.println(result);
}

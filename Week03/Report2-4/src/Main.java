void main() {
    Scanner input = new Scanner(System.in);
    String school;
    String name;
    int age;
    char gender;
    double height;
    float weight;

    System.out.print("당신의 학교 : ");
    school = input.nextLine();
    System.out.print("당신의 이름 : ");
    name = input.nextLine();
    System.out.print("당신의 나이 : ");
    age = input.nextInt();
    System.out.print("당신의 성별 (남/여): ");
    gender = input.next().charAt(0);
    System.out.print("당신의 신장 (cm): ");
    height = input.nextFloat();
    System.out.print("당신의 체중 (kg): ");
    weight = input.nextFloat();

    System.out.println("*********************");
    System.out.printf("\t학교 : %s\n", school);
    System.out.printf("\t이름 : %s\n", name);
    System.out.printf("\t나이 : %d\n", age);
    System.out.printf("\t성별 : %c\n", gender);
    System.out.printf("\t신장 : %.1f\n", height);
    System.out.printf("\t체중 : %.1f\n", weight);
    System.out.println("*********************");
}

void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    double height;
    float weight;

    System.out.print("당신의 이름은: ");
    name = keyboard.nextLine();
    System.out.printf("%s님의 나이는: ", name);
    age = keyboard.nextInt();
    System.out.printf("%s님의 키는(ex: 150.3): ", name);
    height = keyboard.nextFloat();
    System.out.printf("%s님의 몸무게는(ex: 69.0): ", name);
    weight = keyboard.nextFloat();

    System.out.printf("\n%s님의 나이는 %d살 입니다.\n", name, age);
    System.out.printf("%s님의 키는 %.1fcm 입니다.\n", name, height);
    System.out.printf("%s님의 몸무게는 %.1fkg 입니다.\n", name, weight);
}

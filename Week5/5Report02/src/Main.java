void main() {
    Scanner input = new Scanner(System.in);
    int score;
    String grade;

    System.out.print("당신의 JAVA 점수 입력: ");
    score = input.nextInt();

    grade = score >= 95 ? "A+" :
            score >= 90 ? "A0" :
                    score >= 85 ? "B+" :
                            score >= 80 ? "B0" :
                                    score >= 75 ? "C+" :
                                            score >= 70 ? "C0" :
                                                    score >= 65 ? "D+" :
                                                            score >= 60 ? "D0" : "F";

    System.out.printf("입력 점수 : %d\n", score);
    System.out.printf("학점 : %s\n", grade);
}

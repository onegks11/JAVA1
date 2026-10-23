void main() {
    Scanner input = new Scanner(System.in);
    int salary;
    int tax;
    String result;
    final  int MIN = 2000000;
    final int MAX = 30000000;

    System.out.print("급여액을 작성해주세요 : ");
    salary = input.nextInt();

    if(salary > 0 && salary<=30000000) {
        if (salary < MIN) {
            tax = 0;
        } else if (salary <= 4000000) {
            tax = (int) ((salary - MIN) * (10 / 100.0));
        } else if (salary <= 6000000) {
            tax = (int) ((salary - MIN) * (8 / 100.0));
        } else if (salary <= 20000000) {
            tax = (int) ((salary - MIN) * (6 / 100.0));
        } else {
            tax = (int) ((salary - 2000000) * (5 / 100.0));
        }
        result = String.format("급여액 : %,d 원\n납부세금 : %,d 원", salary, tax);
    }
    else{
        result = String.format("Error: 급여액은 0 ~ %d원 사이", MAX);
    }

    System.out.println(result);
}

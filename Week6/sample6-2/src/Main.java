void main() {
    Scanner input = new Scanner(System.in);
    final int GOLD = 775000; //금 1돈의 가격
    final double DON = 3.75f; //1돈 무게
    float weight;

    System.out.print("당신의 몸무게는 ? : ");
    weight = input.nextFloat();

    int gram_weight = (int)(weight * 1000);
    double weight_don = gram_weight / DON;
    double price = weight_don * GOLD;
    long price2 = (long)(price/1000);
    price2 *=1000;


    System.out.printf("%.1f Kg = %,d g\n", weight, gram_weight);
    System.out.printf("%.1f Kg = %,.2f 돈\n", weight, weight_don);
    System.out.printf("%.1f Kg = %,d 원(금 1돈 가격 = %,d 원)\n", weight, price2, GOLD);

}

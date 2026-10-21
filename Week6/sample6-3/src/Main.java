void main() {
    final int radius = 6400; // km
    final int korea_S = 101505; //km²

    double earth_S = 4*Math.PI*radius*radius;
    double result = korea_S / earth_S;

    System.out.printf("지구의 반지름 : %,d km\n",radius);
    System.out.printf("지구의 면적: %,.2f km²\n", earth_S);
    System.out.printf("대한민국의 면적: %,d km²\n", korea_S);
    System.out.printf("대한민국은 약 %f%%를 차지하고 있다.\n", result);
}

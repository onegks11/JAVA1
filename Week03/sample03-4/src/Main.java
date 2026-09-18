void main() {
    short value1 = 32677;
    short value2 = 200;
    int result1 = value1 + value2;
    short result2 = (short)(value1+value2);

    System.out.printf("%,d + %,d = %,d\n", value1, value2, result1);
    System.out.printf("%,d + %,d = %,d\n", value1, value2, result2);
}

void main() {
    int currentSecond = 54321;
    int sec, min, hour;

    sec = currentSecond;
    hour = sec / 3600;
    min = sec % 3600 / 60;
    sec %= 60;

    System.out.printf("%d 초 = %d 시간 %d 분 %d 초", currentSecond, hour, min, sec);
}

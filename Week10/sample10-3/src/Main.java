void main() throws IOException {
    Scanner input = new Scanner(System.in);
    String[] name = {"홍길동", "이대한", "한민국", "경복대", "이미숙", "나추가"};
    char[] attend = new char[name.length];
    int count = 0;
    float rate;

    int i = 0;
    while (i < name.length){
        System.out.printf("%s님 출석 했나요? (1=출석 / 0 = 결석): ", name[i]);
        attend[i] = input.nextLine().charAt(0);
        if(attend[i]=='0'|| attend[i] == '1')
            i++;
        else {
            System.err.println("Error");
            System.in.read();
        }

    }

    for(i = 0; i<attend.length; i++){
        if(attend[i] == '0'){
            count++;
        }
    }

    rate = (float) count/ name.length * 100;

    for(i = 0; i<name.length; i++){
        System.out.printf("%s님 %s\n", name[i], attend[i] == '1'? "출석" : "결석");
    }

    System.out.println("결석자수 = " + count);
    System.out.printf("결석률 = %.2f %%\n", rate);
}

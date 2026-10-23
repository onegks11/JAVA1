void main() {
    Scanner input = new Scanner(System.in);
    int man1, man2;
    String type1, type2;
    String result;

    System.out.print("(가위: 1, 바위: 2, 보: 3)\n첫번째 선수 입력 : ");
    man1 = input.nextInt();
    if(man1 ==1){
        type1 = "가위";
    }
    else if(man1 == 2){
        type1 = "바위";
    }
    else{
        type1 = "보";
    }

    System.out.print("(가위: 1, 바위: 2, 보: 3)\n두번째 선수 입력 : ");
    man2 = input.nextInt();



    if(man2 ==1){
        type2 = "가위";
    }
    else if(man2 == 2){
        type2 = "바위";
    }
    else{
        type2 = "보";
    }
    if((man1>0 && man1<4) && (man2>0 && man2<4)) {
        switch (man1 - man2) {
            case 0:
                result = String.format("man1(%s)와 man2(%s)이면, 비겼습니다.", type1, type2);
                break;
            case -1:
            case 2:
                result = String.format("man1(%s)와 man2(%s)이면, man2이 이겼습니다.", type1, type2);
                break;
            case -2:
            case 1:
                result = String.format("man1(%s)와 man2(%s)이면, man1가 이겼습니다.", type1, type2);
                break;
            default:
                result = "Error";
        }
    }
    else {
        result = "Error";
    }
    System.out.println(result);
}

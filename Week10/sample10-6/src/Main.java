void main() throws IOException {
    Scanner input = new Scanner(System.in);
    String[] name = {"홍길동", "이혜인", "김명성", "경복대", "이대학", "홍길동", "이혜인", "김명성", "경복대", "이대학"};
    int[] kor = new int[name.length];
    int[] eng = new int[name.length];
    int[] math = new int[name.length];


    int[] sum = new int[name.length];
    float[] avg = new float[name.length];
    int[] rank = new int[name.length];

    int k = 0;
    while(k<name.length){
        System.out.printf("%s학생 국어, 영어, 수학 성정 입력 : ", name[k]);
        kor[k] = input.nextInt();
        eng[k] = input.nextInt();
        math[k] = input.nextInt();

        if((kor[k] >= 0 && kor[k] <=100)&&
                (eng[k] >= 0 && eng[k] <=100)&&
                (math[k] >= 0 && math[k] <=100)){
            k++;
        }
        else{
            System.err.print("Error");
            System.in.read();
        }
    }

    for(int i = 0; i<name.length; i++){
        sum[i] = kor[i]+eng[i]+math[i];
    }

    for(int i = 0; i<name.length; i++){
        int step = 1;
        for(int j=0; j<name.length; j++){
            if(sum[j]>sum[i]){
                step++;
            }
        }
        rank[i] = step;
    }

    for(int i = 0; i<name.length; i++){
        rank[i] = i+1;
    }

    for(int i = 0; i<name.length - 1; i++){
        if(sum[i + 1] == sum[i]){
            rank[i+1] = rank[i];
        }
    }

    for(int i = 0; i<name.length; i++){
        avg[i] = sum[i] / 3.0f;
    }


    System.out.println(" 이름  국어  영어 수학 총점  평균  등수");
    for(int i = 0; i<name.length; i++){
        System.out.printf(" %3s %3d %3d %3d %3d %6.2f %2d\n", name[i], kor[i], eng[i], math[i], sum[i], avg[i], rank[i]);
    }
}

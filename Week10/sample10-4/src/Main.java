void main() {
    Scanner input = new Scanner(System.in);
    String source;
    char [] convert;

    System.out.print("영어 문장 입력: ");
    source = input.nextLine();

    convert = new char[source.length()];

    for(int i = 0; i<source.length(); i++){
        if(source.charAt(i) >= 'A' && source.charAt(i) <= 'Z'){
            convert[i] = (char) (source.charAt(i) + 32);
        }
        else if(source.charAt(i) >= 'a' && source.charAt(i) <= 'z'){
            convert[i] = (char)(source.charAt(i) - 32);
        }
        else{
            convert[i] = source.charAt(i);
        }
    }

    System.out.println("원문 : "+source);
    System.out.println("변화 : "+ new String(convert));

}

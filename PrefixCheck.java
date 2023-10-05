class PrefixCheck {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str = "";
        String[] stringArray = my_string.split("");//파라미터로 받은 스트링을 한글자씩 분리
        String[] stringArray2 = new String[my_string.length()];//스트링의 글자를 정수 변수로 보관
        for(int i = 0; i<my_string.length(); i++){//이중 for 문을 사용해 점점 길어지는 스트링들을 하나하나씩 배열에 추가함
            for (int j = 0; j<=i; j++){//새로운 변수 str에 받은 스트링 한 글자씩 더해, 조건을 만족하는 글자만 더함
                str = str+stringArray[j];
            }
            stringArray2[i] = str;
            str = "";

        }
        for(int a = 0; a<my_string.length();a++){
            if(is_prefix.equals(stringArray2[a])){//접두사인지 아닌지 확인할 파라미터 is_prefix 가 만들어진 배열에 존재하는지 확인.
                answer = 1;
            }
        }
        return answer;
    }
}

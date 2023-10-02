class StringChange {
    public String solution(String my_string, int[][] queries) {
    
        String answer = "";//정답을 리턴하기 위한 스트링 변수
        String temp = "";// 일시적으로 변수를 저장하기 위한 스트링 변수
        int len = my_string.length();// 주어진 스트링 파라미터의 길이를 저장
        int querlen = queries.length;// 쿼리 파라미터의 길이를 저장
        String[] str = my_string.split("");// 스트링 파라미터를 한 글자씩 나누어 저장
        
        
        for (int i = 0 ; i < querlen ; i++){
            int a = queries[i][0];
            int b = queries[i][1];//지역변수 a와 b를 부여하여, 아래의 for 문을 작성할 수 있음
            for (int x = a; x<(a+b+1)/2; x++){
              // 스트링 배열의 순서를 하나하나씩 바꿔주는 for 문
                temp = str[x];
                str[x]=str[a+b-x];
                str[a+b-x]=temp;
            }
            
        
    }
        answer = String.join("", str);
        return answer;
}
}

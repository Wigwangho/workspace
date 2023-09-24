class SwitchNum {
  // 입력한 수와 문자에 따라 숫자를 변화시키는 클래스
    public int solution(int n, String control) {
        int answer = 0;
      // 변수 answer 최종결과물을 담을 변수 선언 및 초기화
        
        char[] controlA = control.toCharArray();
      // 파라미터로 받은 control 스트링을 char 배열로 변환
        for (int i = 0 ; i< control.length(); i++){
        //control 스트링의 마지막 부분에 닿을 때까지 아래를 반복
        if (controlA[i] == 'w'){
            n = n+1;
        }
        else if (controlA[i]== 's'){
            n = n-1;
        }
        else if (controlA[i]== 'd'){
            n = n+10;
        }
        else if (controlA[i] =='a'){
            n = n-10;
        }
        }
        answer = n;
        return answer;
        }
    }

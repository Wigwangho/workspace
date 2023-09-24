class NumbersToString {
  //직전 예제와는 반대로, 받은 정수 배열을 통해 어떤 변화가 가해졌는지 역으로 알아보는 코드
    String answer = "";
  //전역변수 초기화
    public String solution(int[] numLog) {
        
        //i값이 배열 길이 -1 에 다할 때까지 바로 앞 값과 현재 값을 빼기
      // 그를 통해 1, -1, 10,-10 등 어떤 수가 되었는지 확인 후 해당 변화와 확인하는 특정 코드 확인
      // 해당 코드를 string 변수 answer 에 추가
        
        for (int i = 0; i<numLog.length-1; i++){
            if (numLog[i+1]-numLog[i] == 1){
                answer = answer + "w";
            }
            else if(numLog[i+1]-numLog[i] == -1){
                answer = answer + "s";
            }
             else if(numLog[i+1]-numLog[i] == 10){
                answer = answer + "d";
            }
             else if(numLog[i+1]-numLog[i] == -10){
                answer = answer + "a";
            }
        }
        return answer;
    }
}

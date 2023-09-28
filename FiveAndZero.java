import java.util.ArrayList;

class fiveAndZero {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> answerlist = new ArrayList<Integer>();
        for (int i = l ; i<= r;i++){
            String numstr = Integer.toString(i);//주어진 파라미터 변수 사이의 모든 숫자를 스트링으로 변환
            if(numstr.matches("^[05]*$")){//스트링 값이 0과 5로만 이루어진 경우 -- 해당 수를 리스ㅡㅌ에 추가
                answerlist.add(i);
                
            }
        }
        int[] answer;
        
        if (answerlist.size() == 0){//리스트에 아무것도 추가되지 않았을 경우 -1을 리턴시킴
            answer = new int[1];
            answer[0] = -1;
        }
        else{//아닐 경우, 리스트에 추가된 모든 수를 answer배열에 추가
        answer = new int[answerlist.size()];
        for(int j = 0 ; j<answer.length;j++){
            answer[j] = answerlist.get(j);
        }
        }
        return answer;
    }
}

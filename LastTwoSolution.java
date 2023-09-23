class LastTwoSolution {
  //정수 배열의 마지막 숫자 비교하기
    int last_num;
    public int[] solution(int[] num_list) {
        
        int len = num_list.length;
        if (num_list[len-1]>num_list[len-2]){
          //마지막 두 숫자 중 후자가 클 경우 마지막-마지막에서 2번째 배열 값을 나타냄
            last_num = num_list[len-1]-num_list[len-2];
                                                            
        }
        else if (num_list[len-1]<=num_list[len-2]){
          // 전자가 클 경우 마지막 배열 값의 2배를 나타냄
            last_num = num_list[len-1]*2;
        }

        int[] answer = new int[len+1];
      //위에서 구한 값을 바탕으로, 기존 배열에 마지막 1번째 값을 추가함
        for( int i = 0; i < len+1;i++)  {
            if(i < len)    {
                answer[i] = num_list[i];
            } else if( i == len)   {
                answer[i] = last_num;
            } 
        }
        
        return answer;
    }
}

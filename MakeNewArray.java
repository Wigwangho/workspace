import java.util.ArrayList;

class MakeNewArray {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk1 = new ArrayList<Integer>();//새로운 ArrayList 선언. 해당 리스트에 특정값을 자유롭게 넣고 뺄 수 있다.
        for (int i = 0 ; i<arr.length;){
            if(stk1.size() == 0){
                stk1.add(arr[i]);
                i++;//문제 조건: 이 조건과 아래 조건의 경우에만 i 변수를 1 더한다
            }
            else if(stk1.get(stk1.size() - 1) < arr[i] ){
                stk1.add(arr[i]);
                i++;
            }
            else if(stk1.get(stk1.size() - 1) >= arr[i]){
                stk1.remove(stk1.size()-1);
            }
        }
        
        int[] stk = new int[stk1.size()];
            for (int j = 0 ; j<stk1.size() ; j++){
                stk[j] = stk1.get(j).intValue();
            }
    
        return stk;
    }
}

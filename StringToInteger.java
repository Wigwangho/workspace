import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] StringToInteger(String[] intStrs, int k, int s, int l) {        
        int strint = 0;
        String[] arr;
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < intStrs.length; i++){
            
            arr= intStrs[i].split("");
            String cutstr = "";
            for (int j = s; j<s+l; j++){
               
                cutstr = cutstr + arr[j]; 
                
            }
            strint = Integer.valueOf(cutstr);
            if (k<strint){
                list.add(strint);
            }
            
            
            
        }
        int[] answer = new int[list.size()];
        for (int a = 0; a<list.size(); a++){
            answer[a] = list.get(a);
        }
        return answer;
    }
}

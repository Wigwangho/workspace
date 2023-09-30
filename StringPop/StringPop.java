class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        int len = index_list.length;
        String[] arr = new String[len];
        arr = my_string.split("");
        
        for (int i = 0; i<len ; i++){
            answer = answer + arr[index_list[i]];
        }
        return answer;
    }
}

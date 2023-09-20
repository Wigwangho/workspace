class Solution {
    int answer = 0;
    public int solution1(int a, int b) {
        String stra = Integer.toString(a);
        String strb = Integer.toString(b); 
        String str = stra + strb;
        int sum = Integer.parseInt(str);
        int multi = 2*a*b;
        if(sum>=multi){
            answer = sum;
        }
        else if (sum<multi){
            answer = multi;
        }
        
        return answer;
    }
  public int solution2(int a, int b){
  int jari = math.log10(b)+1;
  int ajari = 10^jari;
  int finalA = a*ajari;
  int sum = finalA+  b;
  int multi = 2*a*b;
    if(sum>=multi){
            answer = sum;
        }
        else if (sum<multi){
            answer = multi;
        }
        
        return answer;
  }
  
  public void main(){
  Solution S = new Solution;
    int i = S.solution1(1,2);
    System.out.println(i);
  //answer 값이 출력됨
}
} 
//ab 형태의 수가 큰가, a*b*2가 큰가를 비교하는 함수. str 를 사용해 ab 형태의 수를 구했음
//로그함수를 통하여서도 얻을 수 있다


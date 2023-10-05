class qrCode {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] codeArray = code.split("");//주어진 파라미터 문자열을 잘라서 배열에 보관
        for (int i = 0; i<code.length(); i++){
            if(i%q == r){//나머지값을 이용해, 문제에서 찾으라는 값만 뽑아냄
                answer = answer + codeArray[i];
            }
        }
        return answer;
    }
}

class DivideByNine {
    public int solution(String number) {
        int answer = 0;
        int len = number.length();
        String[] num = new String[len];//받은 파라미터를 기초로 하는 새로운 배열 생성
        num = number.split("");//배열에 한 글자씩 나눠 넣기
        int sum = 0;
        int temp = 0;//만들어진 배열의 값을 정수로 변환하기 위한 임시변수
        for (int i = 0; i<len; i++){//배열 내부의 값을 정수로 변환하여 더하기
            temp = Integer.parseInt(num[i]);
            sum = sum + temp;
        }
        
        answer = sum%9;//9로 나눈 나머지 구하기
        return answer;
    }
}

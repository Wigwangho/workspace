class DeleteSelectedCharacter {
    public String solution(String my_string, int[] indices) {//파라미터: 문자열 하나와 정수 배열
        String answer = "";
        String[] StringArray = my_string.split("");//문자열을 각각의 글자를 담은 문자열 타입 배열로 변경
        for (int i = 0; i<my_string.length(); i++){
            for(int j = 0; j<indices.length; j++){//이중 for 문을 통해, indice 배열로부터 호출된 정수가 StringArray의 인덱스와 일치할 경우 해당 값을 ""으로 변경.
                if(indices[j] == i){
                    StringArray[i] = "";//최종 답안에 모든 글자들을 추가. 단, 위에서 변형된 것들은 ""이므로 더해지지 않은 것이나 다름없다.
                }
            }
         answer = answer + StringArray[i];   
        }
        return answer;
    }
}

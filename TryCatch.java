public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = {1,2,3};
		try {//정상적으로 실행되는 try catch 문
			for (int i = 0; i<3; i++) {
				Array[i] = 0;
				System.out.println(Array[i] + "호출 성공");
		} 
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("오류 발생..");
		}
		int[] Array2 = {1,2,3};
		try {//배열의 크기를 벗어나 오류를 리턴하는 경우
			for (int i = 0; i<4; i++) {
				Array2[i] = 0;
				System.out.println(Array2[i] + "호출 성공");
		} 
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("오류 발생..");
		}
	
	}

}

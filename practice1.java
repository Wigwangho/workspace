package com.week41;

public class practice1 {
int k = 0;
	 public static void main(String[] args) {
		 practice1 p = new practice1();
		 int i = p.k;
		 for (i=0;i<= 10;i++){
		 if( i>6) 
			 break;
		 }
		 System.out.println(i);  //오류
		 }
		/*What is the result?
		A. 6
		B. 7 -> 0
		for 문 내부의 모든 연산이 끝난 뒤 ++ 되므로.
		C. 10
		D. 11
		E. Compilation fails.
		F. An exception is thrown at runtime.*/

}

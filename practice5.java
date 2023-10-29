package com.week41;

public class practice5 {
	public static void main(String[] args) {
		 int x=12;	//do..while 문과는 다르게 먼저 조건을 따진다. 한번도 실행이 되지 않을 수도 있다.			
		 while (x < 10) {	//비교연산자		true or false	->> false. 12<10은 false이다.
       //실행되지 않는다. while의 조건이 실행되지 않았으므로.
		 x--;	
	}
				
	 System.out.print(x);				
	/*What is the result?				
	A. 0				
	B. 10				
	C. 12				
	D. Line 29 will never be reached.			*/	


}
}

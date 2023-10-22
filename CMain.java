package java_project;


class C{
	int i;
	C(C1 c1){
		System.out.println("C : "+c1);//C1d
	}
}
class C1{
	//여기서 쓰고 싶다
	C c = new C(this);//2. C 클래스 인스턴스화 -> 이때 C 클래스 생성자의 파라미터는 클래스 C1
	//생성자 실행 -> C:c1 주소번지

	C1(){
		System.out.println("C1 : "+this);//C1 주소번지 호출
	}
}
public class CMain {

	public static void main(String[] args) {
		 new C1();//1. c1 클래스 호출 -> c1 클래스 생성자 자동 호출

	}

}

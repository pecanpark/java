package Math;

public class MyMethTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMath obj = new MyMath();
		System.out.println(obj.square(1)); //메서드 오버로딩은 반드시 매개변수의 갯수가 다르거나 자료형이 달라야한다.
		System.out.println(obj.square(10));
		System.out.println(obj.square(10,20));// 변환형만 다른 경우나 매개변수 이름만 다른 경우는 메소드 오버로딩이 아니다.
		System.out.println(obj.square(3.14)); 
	}

}

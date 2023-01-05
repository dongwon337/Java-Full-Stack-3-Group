package basic;


class aaa{
	long a, b; // 인스턴스 변수
	
	long add() {// 인스턴스 메서드
		return a + b;
	}
	static long add(long a , long b	) {// 클래스메서드(static 메서드)
		return a + b;
	}//static 메서드라는건 객체 생성 없이 호출할 수 있다.

	public static void main(String[] args) {

		aaa mm = new aaa();
		mm.a = 100;
		mm.b = 200;
		System.out.println(add(3,5));
		System.out.println("df");
		
		
}}
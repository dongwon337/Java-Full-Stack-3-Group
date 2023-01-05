package basic;
//이건 라인 주석입니다.

/*이건블락주석입니다.
 * 컴파일시 모두 무시되며 메모리 차지 없음.
 */
/*
 * 코딩시 보라색은 모두 키워드 입니다. 따라서 변수나, 매서드명으로 절대 사용 불가입니다.
 * 아래 클래스 옆에 public 은 option 입니다. 넣거나 빼거니 문제는 없지만, 나중에 패키지란걸
 * 배우면 어떤 의미인지 알게 될겁니다.
 * 
 * 클래스 이름 명명법: 아래의 class 앞에 있는 이름을 클래스명 이라고 합니다.
 * 이름은 반드시 * 10000000000 첫자는 대문자로 시작해야 하고 한단어 이상 연결시
 * 새단어의 첫단어는 기본적으로 대문자 입니다. "-"(언더바)와 $ 를 사용할 수 있지만
 * 아무도 사용하지 않습니다.
 * 
 * 모든 변수, 클래스, 매서드 이름에는 첫문자는 숫자가 올 수 없습니다.
 * 
 * 아래의 클래스 이름이 소스코드의 파일명과 반드시 일치해야 합니다.(대소문자까지)
 */
class FirstJava {//클래스 body
	
	
	public static void main(String[] args) {//메서드 body
		
		byte a,b; //a 지역 변수선언 (declared)(매서드내에서 처음 선언된 변수를 지역변수라 함)//메인에서 byte 타입으로 사용하기위한 a,b 선언
		a = 1;//Assign
		b = 1;
		byte c = 1;
		
		
		
		//short 타입은 자바에서 사장된 데이터 타입 입니다.(2byte)
		short s = 100;
		a = 10;
		int i = 1;
		//연산자를 만났을 경우엔 두 타입을 비교해서 default 보다 작으면 default
		//타입으로 변환후 연산한다.. 당연히 결과 타입도 default 타입이다.
		//default 보다 큰 타입의 연산인 경우 무조건 큰 타입으로 리턴된다.
		i = a + b;
		long lo = 1L; //long 8byte
		long it = lo + 1;
		
		float f = 3.14F; //float 4byte
		
		//같은 또는 더 큰 크기의 데이터 타입을 서로 대입해 봅니다.
		f = lo;
		
		System.out.println(1 + 1.0);

		double d = f;
		
		
		
		
		//실수는 정수보다 크다
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Byte.MIN_VALUE);
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);
		
		
		/*
		 * 자바에서 지역변수를 사용할 때 반드시 값이 초기화 되어 있어야 합니다.
		 * 위에서 초기화란 초기화 또는 값이 존재해야 한다는 말입니다.
		 * 변수를 처음 선언할 때는 반드시 변수명 옆에 타입이 선언되어야 합니다.
		 * 이렇게 선언된 변수는 해당 타입만 값을 넣을 수 있습니다.
		 */
		/* 리터럴 데이터 : 값 자체가 어떤 타입인지를 내포하고 있는 데이터 		 */
		/*
		 * java Data Type : 
		 * 
		 * 1.수치형(정수) : byte(1byte) > short > int(default) > long(8byte)
		 * 2.수치형(실수) : float(4byte) > double(8byte, default)
		 * 3.문자형(char) : char(2byte)
		 * 4.논리형(boolean) : true or false
		 * 
		 * 위 네개의 자료형울 자바에서는 원시자료형(Primitive Type) 이라고 합니다.
		 * 
		 * 
		 * 
		 * 5.객체형(Reference Type)
		 * String System
		 */
		
		
	}
	
}










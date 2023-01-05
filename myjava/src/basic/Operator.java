package basic;

public class Operator {

	public static void main(String[] args) {
				

			double pi = 3.141592;
			
			System.out.println(pi);
			System.out.println(pi * 1000);
			System.out.println((int)Math.round(pi * 1000));
			System.out.println(Math.round(pi * 1000)/1000);
			
			
			//Math.round(소수점 첫 째자리에서 반올림한 정수를 반환)
			//반올림을 하지 않고 싶다면 int 로 형변환을 하여 소수점을 날려버린다.
		
		
		
		//char c = '9' , d = '0';

		//int g = c; // 문자 c(9)를 int 에 대입했기 때문에 '문자' 가 '코드' 로 변환됨.
		//자동 형변환이 되는 이유는 char 는 2byte 이고 int 는 그보다 큰 4 byte 이기 때문.

		//System.out.println(g); // 연산이 들어가게되면 int 보다 작은 char 가 int 로 바뀌게 된다.



		//int a = 1_000_00;
		//int b = 2_000_00;

		//long c = a * (long)b; //overflow 발생. 그러므로 형변환을 수동으로 해줘야함.

		//System.out.println(c);
		
		
		
		
		
		
		
				//byte a = 10; // 두 피연산자의 타입을 같게 일치시킨다. (보다 큰 타입으로 일치)
				//int b = 4;
				
				//System.out.println((float)a / b);
				// int 즉 정수끼리 나눗셈을 하였을 떄 int로 결과를 출력하기 떄문에 둘중 한쪽을 float 으로 형변환 해주어야한다.
				// float 을 넣어줄때 둘중 한쪽만 넣어주어도 바뀐다.
				
				
				// 피연산자의 타입이 int 보다 작은 타입(byte , short, char)이면 int 로 변환된다.
				// byte + short > int + int 로 바뀐다.
				// char + short > int + int 로 바뀐다.
				
		//	int i = 100; 
		//	byte b = (byte)i;

		//	(타입) 피연산자 
		//	double d = 85.8;
		//	int score = (int)d;
		//	int score = (int)85.4;
		//	int score = 85;

		//	int > char (char)64 결과 'A';

		//	float f = 123456789; //자동형변환 
		//	int i = 3.14f; //에러
		//	int i = (int)3.14f; //에러 안남 
		//	int i = 300;


		//	byte b;
		//	b = (byte)i;
		//	기존의 값을 최대한 보존할 수 있는타입으로 자동 형변환된다.



		
		
		
		
		
		
		
		
//		int i = 5, j = 0;
//		
//		j = i++; // 후위형
//		System.out.println(j);
		
		
		
//		int i = -10;
//		i = -i;
//		- 는 피연산자의 부호를 반대로 변경.
//		 
//		System.out.println(i);
//		+ 는 아무런 일도 하지 않는다.(실제사용x)
//		
		
		
		/*
		 * 산술 연산자 +,-,*,/(사칙연산) , %(사칙연산과 나머지 연산%)
		 * 비교 연산자 < > >= <= == != 크고 작음과 같고 다름을 비교
		 * 논리(boolean)연산자 && || ! 그리고,와 또는 으로 조건으로 연결
		 * 대입 연산자 = 우변의 값을 좌변에 저장
		 * 기타 (type), ?:, instanceof 형변환 연산자, 삼항 연산자, instanceof 연산
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 증가 연산자 (++) 피연산자 값을 1 증가시킨다.
		 * 감소 연산자 (--) 피연산자 값을 1 감소시킨다.
		 * 
		 * 전위형 : 값이 참조되기 전에 증가시킨다. j = ++i;
		 * 후위형 : 값이 참조된 후에 증가시킨다. j = i++;
		 * 증감 연산자가 독립적으로 사용된 경우, 전위형과 후위형은 차이가 없다. 
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}

}

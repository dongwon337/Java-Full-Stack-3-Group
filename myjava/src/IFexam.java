import java.util.Scanner;

public class IFexam {

	public static void main(String[] args) {
		
//		int a =1;
//		
//		if(a > 0)
//			System.out.println("a는 0보다 큽니다.");
//		System.out.println("여긴 if 실행문이 아닌 main() 실행문 입니다.");
		
		//조건식을 이용해서 아래와 같은 로직을 완성 하세요.
		/*
		 * 수 3개를 입력 받습니다.
		 * 출력 결과는 가장 큰 수 부터 출력시키세요.
		 * ex >4, 1001, 985--> 결과 1001 >= 985 >=4
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력");
		int a = sc.nextInt();
		System.out.println("두번째 숫자 입력");
		int b = sc.nextInt();
		System.out.println("세번째 숫자 입력");
		int c = sc.nextInt();
		
		int temp;
		
		if(b>=a && b>=c) {
			//무조건 b가 크다.
			//값을 치환한다.
			temp = a;//a 값을 temp에 저장후 b에 넘긴다.
			a = b;//그냥 이렇게 하면 a의 값은 날아가버림.
			b = temp;
			
		}else if(c>=a && c>=b) {
			//무조건 c가 크다.
			temp = a;
			a = c;
			c = temp;
		}
		
		//3번째수가 2번보다 클경우..
		if(c >= b) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println(a + ">=" + b + ">=" + c);
		
	
		/*
		if(a >= b && b >= c) {
			System.out.println(a + ">=" + b + ">=" + c);
		}else if(a >= c && c >= b){
			System.out.println(a + ">=" + c + ">=" + b);
		}else if(b >= a && a >= c){
			System.out.println(b + ">=" + a + ">=" + c);
		}else if(b >= c && c >= a){
			System.out.println(b + ">=" + c + ">=" + a);
		}else if(c >= a && a >= b){
			System.out.println(c + ">=" + a + ">=" + b);
		}else {
			System.out.println(c + ">=" + b + ">=" + a);
		}*/
	
	}
	
}
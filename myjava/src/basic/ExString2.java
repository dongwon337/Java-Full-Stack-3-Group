package basic;

public class ExString2 {

	public static void main(String[] args) {
			
			String str = "3";
			
			System.out.println('3' - '0'); //문자를 숫자로 변환
			System.out.println('3' - '0' + 1); //문자를 숫자로 변환했으므로 숫자 1을 더하면 4가 출력
			System.out.println(Integer.parseInt("3")+1);//문자열 3을 숫자로 변환 후 1을 더하면 4가 출력
			System.out.println("3" + 1); //문자열 3 과 숫자 1을 더하면 숫자 1도 문자열로 변환되므로 31 이 출력
			System.out.println(3 + '0'); // 숫자 3을 문자로 변환하는 '0' 을 더해서 문자 3이 나와야 하는데 출력이 안됨
			System.out.println((char)(3 + '0')); // 위 방법을 정상 출력 하기 위해선 char 타입을 붙여야함.
			
	}

}

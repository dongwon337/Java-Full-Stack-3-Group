package langEx.exceptionEx;
/*
 * JDK 1.8 부터 지원되는 AutoCloseable 을 이용한 Resourse 자동 닫기와
 * 새로운 try~catch 절 예제..
 */

class MyRes implements AutoCloseable{
	
	private String name;
	
	public MyRes(String name) {
		this.name = name;
		System.out.println("내 리소스" + name + " 열었음");
	}
	
	public String read1() {
		System.out.println("내 리소스" + name + " 읽기");
		return "100";
	}
	public String read2() {
		System.out.println("내 리소스" + name + " 읽기");
		return "abcd";
	}
	
	@Override
	public void close() throws Exception{
		System.out.println("내 리소스의 연결 끊기 or 닫기 실행");
	}
	
	
}


public class ExceptionEx3 {

}

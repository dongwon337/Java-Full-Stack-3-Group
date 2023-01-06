package oopEx1.threadEx;
//박동원
public class ThreadEx1 {

	static void doSome() {
		System.out.println("doSome입니다.");
	}
	public static void main(String[] args) {
		
		doSome();
		
		//일부러 예외를 발생 시킵니다.
		System.out.println(args[0]);
	}

}

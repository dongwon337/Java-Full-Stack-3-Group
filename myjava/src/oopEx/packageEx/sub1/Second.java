package oopEx.packageEx.sub1;

import oopEx.packageEx.First;

public class Second extends First{

	public Second() {
		super("박동원");
	}
	
	public static void main(String[] args) {
		//다른 패키지에 있는 First의 생성자를 호출해 봅니다.
//		First f1 = new First();
//		First f2 = new First("박동원");
	}
}

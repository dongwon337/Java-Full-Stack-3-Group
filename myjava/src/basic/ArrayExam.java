package basic;

public class ArrayExam {

	public static void main(String[] args) {

		/*
		 * 자바배열(Array) : 자바에서는 String , 배열은 모두 p type 이 아닌 R type 입니다. 즉 객체란 뜻.. 때문에
		 * 지금까지 알고있던 p type 에 대한 개념과는 틀리니 이해바랍니다. 배열을 생성할 때는 반드시 new 라는 키워드를 이용해서
		 * 생성해야합니다. 또 배열은 객체에서 해당 객체를 ref 하는 변수 (reference) 를 반드시 이용해서 뭔가를 해야합니다. 즉 ref
		 * 를 잃어버린 배열객체는 이후 더 이상 사용 불가능하기 때문입니다. (몹쓸객체)
		 */
		//배열생성식 1, 길이만 준다.
		int[] arr = new int[3]; // 자바에서는 빈배열(length) 가 없는 배열은 생성불가
		// 따라서 반드시 length 는 줘야한다
		//생성된 배열 객체의 hashcode 를 출력
		System.out.println(arr.length);
		//배열은 값을 주지않고 생성하면 (기본배열객체) 자동으로 값이 초기화됩니다.(0)
		for(int a : arr)
			System.out.println(a);
		
		//배열객체는 모든 타입 (P and R type)을 배열로 생성할 수 있습니다.
		
		//배열생성식2..값을 주고 초기화하기..
		String strArr[] = {"Hello" , "World" , "Java"};
		//strArr[] = new int[3]; 이미 타입이 지정됐기 때문에 다른 타입으로 생성불가.
		for(String str : strArr)
			System.out.println(str);
		System.out.println(strArr);
		
		//배열 생성식3 위 두개를 합친형태 length 만빼준다.
		char[] stars = new char[] {'a','b','c'};
		
		//위 str 배열을 버리고 새로운 객체를 생성한다.
		strArr = new String[3];
		System.out.println(strArr);

		for(String str : strArr)
			System.out.println(str);
		
		
		char[]	mych = new char[2];//char 5개의 length 의 배열생성
		//값은 있을까? 있음... \u0000
		mych[0] = 'a';
		mych[1] = 'b';
		for(int i = 0; i<mych.length; i++) {
			System.out.println(mych[i]);
		}
		
		for(char m : mych)
			System.out.println(m);

		String [] com = {"가위", "바위", "보"};
		String comValue = com[((int)(Math.random()*com.length))];
		System.out.println(comValue);
	
	}

}

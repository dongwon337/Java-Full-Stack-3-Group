package basic;

class MyMath{
	int aa;
	int bb;
	
	static int cc = 4;
	static int dd = 5;
	
	static long add(long a, long b)	{
		return a + b;
	}
	
	static String ass(String f ,String n) {
		return f + n;
	}
}

public class Prac2 {
	
public static void main(String[] args) {
	System.out.println("ff");
	MyMath ccdd = new MyMath();
	System.out.println(ccdd.aa);
	System.out.println(ccdd.aa);
	
	long i = MyMath.add(10, 20);
	
//	System.out.println(i);
//	System.out.println(MyMath.add(10, 20));
//	System.out.println(MyMath.ass("이거", "저거"));
	
	
	
}

}

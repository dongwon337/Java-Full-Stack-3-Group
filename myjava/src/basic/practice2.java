package basic;
import Family.Son;

public class practice2 {
	
	
	public static void main(String[]args) {
		add(50,10,40);
		}
	
	
	public static void add(int x, int y) {
	System.out.println(x+y);	
	}
	
	
	
	public static void add(int x, int y , int z) {
		System.out.println(x+y+z);	
	}
	
	public static int add(int... numbers) {
		int sum = 0;
		for(int i = 0 ; i < numbers.length ; i ++) {
			sum = sum + i;
		}
		return sum;
	}
	
	
	class set {
		private String name;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		private int age;
		
	}

	
	}


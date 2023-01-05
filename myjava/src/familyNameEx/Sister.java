package familyNameEx;

public class Sister extends Parent{

		int age;//나이
		String address;//주소
		String jobName;
		
		public Sister(int age, String address) {
			super("미국Ja");
			this.age = age;
			this.address = address;
			this.jobName = "웹디자이너";
		}
		
		public String toString() {
			return super.toString() + " 나이는 " + this.age + " 주소는" + this.address;
		}
	
		public void doJob() {
			System.out.println("Sister 의 직업은 " + this.jobName);
		}
}

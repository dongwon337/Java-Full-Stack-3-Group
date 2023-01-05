package Family;

public class Son extends Parent{
	 int age;
	 String adr;
	 String name;
	 String doJob;
	
	public Son(String familyName ,String name, int age, String adr, String doJob) {
		super(familyName);
		this.name = "Son";
		this.age = 31;
		this.adr = "의정부";
		this.doJob = "개발자";
	}
	public String toString() { 
		return "\n이름은 : " + super.toString() + " " + this.name + "\n나이는 : "+ this.age +
				"\n주소는 : " + this.adr + "\n직업은 : " + this.doJob;
	}

}

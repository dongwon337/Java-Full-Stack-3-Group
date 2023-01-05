package Family;

public class Sister extends Parent {
	 int age;
	 String adr;
	 String name;
	 String doJob;

	public Sister(String familyName ,String name, int age, String adr , String doJob) {
		super(familyName);
		this.name = "Sister";
		this.age = 38;
		this.adr = "동두천";
		this.doJob = "웹디자이너";
	}
	public String toString() { 
		return "\n이름은 : " + super.toString() + " " + this.name + "\n나이는 : "+ this.age +
				"\n주소는 : " + this.adr + "\n직업은 : " + this.doJob;
	}
}

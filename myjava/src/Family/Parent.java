package Family;


class Parent {
	 String familyName;
	 String doJob;

	public Parent (String familyName) {
		this.familyName = " 미국 Ja";
	}
	
	public String toString() {
		return "이집안 성씨는" + familyName;
	}
	
	public String doJob() {
		return "내 직업은 택시운전사 입니다.";
	}
}

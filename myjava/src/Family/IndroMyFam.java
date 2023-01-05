package Family;

class IndroMyFam {

	public static void main(String[] args) {

		
		Sister ss1 = new Sister(null, null, 0, null, null);
		Sister ss2 = new Sister(null, null, 0, null, null);
		Son s1 = new Son(null, null, 0, null, null);
		Son s2 = new Son(null, null, 0, null, null);
//		Marine m1 = new Marine("Jason","이등병",40,60);//Instance 화 하는 단계 즉,
//		FireBet f1 = new FireBet("불추장", "상병", 60, 80);
//		Medic md1 = new Medic("간호사","하사",60,0);
//		
		System.out.println(ss1);
		System.out.println("\n" + ss2);
		System.out.println("\n" + s1);
		System.out.println("\n" + s2);
//		m1.sound();
//		System.out.println(f1.toString());
//		f1.sound();
//		System.out.println(md1.toString());
//		md1.sound();
	}
}
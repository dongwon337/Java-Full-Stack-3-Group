package familyNameEx;

public class IndroMyFam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s1 = new Son(30," 의정부시 오목로 청구1차아파트");//Instance 화 하는 단계 즉, 객체를 생성하는 코드입니다.
		Sister sis1 = new Sister(29,"의정부시 오목로 청구2차아파트");
		GrandSon g1 = new GrandSon(3, " 의정부시 오목로 청구1차아파트");
		Parent p1 = new Parent(null);
		
		System.out.println(s1.toString());
		System.out.println(sis1.toString());
		System.out.println(g1.toString());
		
		p1.doJob();
		s1.doJob();
		sis1.doJob();
		g1.doJob();
		
		
	}

}

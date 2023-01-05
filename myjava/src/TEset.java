
public class TEset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] multiArr[] = new int[3][4];//기본 배열 객체 생성
		
		String[][] myApt = new String[3][4];
		myApt[0][1] = "노재현";
		myApt[2][2] = "문지광";
		
		System.out.println(myApt[0][1]);
		

		//값에 접근해 봅니다. 다중 for 구문을 이용합니다
		for(int i = 0; i<multiArr.length; i++) {//Outer 배열 접근
			//위의 i 는 Outer 의 index 를 가르키기 때문에 내부적으로 배열이다.
			for(int j=0; j<multiArr[i].length; j++) {
				System.out.println(multiArr[i][j]);
			}
		}
		//생성식2번입니다.
		String[] u_Apt[] = {{"노재현","문지광","최대진"},{"조정기","조기제","임진우"}};//{} 갯수가 아파트의 동 입니다.
		
		//생성식3번입니다.
		String herApt[][] = new String[][] {{"A","B"},{"C","D"}};
		for(int i = 0; i<herApt.length; i++) {
			for(int j = 0; j<herApt[i].length; j++) {
				
				System.out.println(herApt[i][j]);
			}
		}
	
		//동적가변배열 : Outer 의 크기는 생성시 초기화 하고 Inner 의 크기와 값은
		//동적으로 적용하는 배열입니다.
		
		char[] stars[] = new char[10][];
		for(int i =0; i<stars.length; i++) {
			stars[i] = new char[i+1];
			for(int j = 0; j<stars[i].length; j++) {
				stars[i][j] = '*';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
		
	}
}
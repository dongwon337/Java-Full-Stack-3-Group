package basic;
import java.awt.color.ICC_Profile;

public class TEset {

	public static void main(String[] args) {
		int[] multiArr[] = new int[3][4];// 기본배열 객체생성

		String[][] myApt = new String[3][4]; // 배열은 new 를 사용해서 만든다
		myApt[0][0] = "노재현";
		myApt[2][2] = "문지광";

		System.out.println(myApt[0][0]);

		// 값에 접근해 봅니다. 다중 for 구문을이용합니다.
		for (int i = 0; i < multiArr.length; i++) {// Outer 배열 접근 // i 는 아파트의 동
			// 위의 i 는 outer 의 index 를 가르키기 때문에 내부적으로 배열이다.
			for (int j = 0; j < multiArr[i].length; j++) { // j 는 동 안에 가구수
				// 값을 출력하는 코드를 정의해보세요.
				System.out.println(multiArr[i][j]);
//				System.out.println(i);
//				System.out.println(j);
			}
		}
			// 생성식2번입니다.
			String[] u_Apt[] = { { "노재현", "문지광", "최대진" }, { "조정기", "조기제", "임진우" } };// {}개수가 아파트의 동이됩니다.

			// 생성식 3번입니다
			// 잠깐 쉰후 아래의 Data 값 "Z","Y","V","W" 순서대로 변경후 값을 출력하세요
			String herApt[][] = new String[][] { { "A", "B" }, { "C", "D" } };
			for (int i = 0; i < herApt.length; i++) {
				for (int j = 0; j < herApt.length; j++) {
					System.out.println(herApt[i][j]);
			}
				
		}
			//동적가변배열 : Outer의 크기는 생성시 초기화 하고 Inner 의 크기와 값은
			//동적으로 적용하는 배열입니다.
			
			char[] stars[] = new char[10][];
			for(int i = 0; i<stars.length; i++) {
				
				stars[i] = new char[i+1];
				for(int j = 0; j<stars[i].length; j ++) {
					stars[i][j] = '*';
					System.out.print(stars[i][j]);
				}
				System.out.println();
			}
			
			
			
			
			
	}

}

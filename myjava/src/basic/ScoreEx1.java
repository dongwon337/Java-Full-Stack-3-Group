package basic;
import javax.swing.JOptionPane;


public class ScoreEx1 {

	public static void main(String[] args) {

		// do ~ while 을 이용해서 아래의 조건처럼 구현되도록.
		// 클래스명은 ScoreEx1 으로 하시고
		// 학생의 성적을 입력받아 출력하는 프로그램입니다.
		// 1. 과목은 국,영,수 이고
		// 2. 각 과목의 점수는 0 ~ 100 사이여야 합니다.
		// 3. 만약 올바르지 않은 점수가 들어오면, 재입력 받도록 하세요 즉
		// 다음 과목의 점수를 입력받는 로직으로 넘어가면 됩니다.
		// 4. 모든 과목이 올바르게 입력되면 아래처럼 출력합니다.
		// 5. 총점 : 몇점, 평균 : 몇점, 학점 A,B,C orF
		// 6. 학점의 기준은 90 이상은 A, 80~89 까지 , B, 70~79 , C 60~69 나머진 F
		// 7. 참고로 위의 학점을 계산하려면 평점을 구해서 하는게 편합니다.
		// 8. 평점은 평균을 10으로 나눠계산

		int a;
		int b;
		int c;

		do {
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "국어점수를 입력하시오"));
		} while (a < 0 || a > 100);

		do {
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "영어점수를 입력하시오"));
		} while (b < 0 || b > 100);

		do {
			c = Integer.parseInt(JOptionPane.showInputDialog(null, "수학점수를 입력하시오"));
		} while (c < 0 || c > 100);

		int sum1 = a + b + c;
		int sum2 = sum1 / 3;
		char aa = 'A';
		char bb = 'B';
		char cc = 'C';
		char ff = 'F';

		if (sum2 > 90){
		JOptionPane.showMessageDialog(null, "총점 :" + sum1 + " 점\n평균 :" + sum2 + " 점\n학점 :" + aa + " 입니다.");
		}else if(sum2 > 80 && sum2 < 89){
			JOptionPane.showMessageDialog(null, "총점 :" + sum1 + " 점\n평균 :" + sum2 + " 점\n학점 :" + bb + " 입니다.");
		}else if(sum2 > 70 && sum2 < 79){
			JOptionPane.showMessageDialog(null, "총점 :" + sum1 + " 점\n평균 :" + sum2 + " 점\n학점 :" + cc + " 입니다.");
		}else if(sum2 < 69) {
			JOptionPane.showMessageDialog(null, "총점 :" + sum1 + " 점\n평균 :" + sum2 + " 점\n학점 :" + ff + " 입니다. 분발하세요");
		}
		System.exit(0);
		
//		int i = 0;
//		do {
//			//int i = 0; // 지역변수가 아니라 블록변수!
//			i++;
//			System.out.println(i);
//		}while(i < 5);
//		
	}
}

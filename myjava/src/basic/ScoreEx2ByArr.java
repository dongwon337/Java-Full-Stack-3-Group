package basic;
import javax.swing.JOptionPane;


/*
 * 오전에 작성한 Score.java 를 배열을 이용해서 구현하는 겁니다.
 * 국영수 새점수를 받는건 같고, 다른 점수시 해당 과목에 대한 입력이 반복 출력되야 합니다.
 * 모두 정상적이면, 출력 결과는 아까와 같게 하시면 됩니다.
 */

public class ScoreEx2ByArr {

	public static void main(String[] args) {
		int score[] = new int[4];// 이 배열에는 각 과목의 점수와 총점도 int 라
		int a = 0,b = 0,c = 0;
		score[0] = a;
		score[1] = b;
		score[2] = c;
		// 총점까지 넣도록 배열을 생성했습니다.
		//아래 배열은 메세지 출력시 과목명을 출력 토록 한겁니다.
		String theMsg[] = { "국어", "영어", "수학" };
		
		do{
			score[0] = Integer.parseInt(JOptionPane.showInputDialog(null, theMsg[0] + "점수를 입력하시오"));
		} while (score[0]< 0 || score[0] > 100);
		
		do {
			score[1] = Integer.parseInt(JOptionPane.showInputDialog(null, theMsg[1] + "점수를 입력하시오"));
		} while (score[1] < 0 || score[1] > 100);
		
		do {
			score[2] = Integer.parseInt(JOptionPane.showInputDialog(null, theMsg[2] + "점수를 입력하시오"));
		} while (score[2] < 0 || score[2] > 100);
		
		int sum = score[0] + score[1] + score[2];
		score[3] = sum;
		
		float avg = score[3]/3F;
		JOptionPane.showMessageDialog(null,"총점 : " + score[3] + ", 평균 : " + avg);
		
		
		
//		for(int i = 0; i<theMsg.length; i++){
//		do {
//			score[i] = Integer.parseInt
//					(JOptionPane.showInputDialog(theMsg[i] + "를 입력");
//		} Math.round(avg * 100) / 100.0)); 소수점 두자리까지 출력 공식
		
//		
		
		//위 두개의 배열을 이용해서 구현해보세요
	}

}

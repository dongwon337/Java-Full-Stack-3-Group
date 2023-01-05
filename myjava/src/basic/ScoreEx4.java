package basic;
import javax.swing.JOptionPane;

/*
 * 배열을 이용해서 3명의 성적관리 프로그램을 만듭니다.
 * 전체적인 조건은 다 같되, 한명당 모든 성적입력이 올바르지 않을 경우엔
 * 다음 사람의 성적이 입력되면 안됩니다.
 * 
 * 출력시 첫번째 사람은 철수, 다음은 영희, 다음은 순애로 지정하여
 * 예시처럼 출력 시킵니다. 철수님의 총점 : ? 평균 : ?
 * 영희님의 총점 : ? 평균 ; ?
 * 단 이름값은 입력받지 아니합니다.
 */

public class ScoreEx4 {

	public static void main(String[] args) {

		int[][] score = new int[3][3];
//		score[0][0] = "철수"; 
//		score[0][1] = 
//		score[1][0] = "영희";
//		score[1][1] = 
//		score[2][0] = "순애";
//		score[2][1] = 
		// 총점까지 넣도록 배열을 생성했습니다.
		// 아래 배열은 메세지 출력시 과목명을 출력 토록 한겁니다.
		String theMsg[] = { "국어", "영어", "수학" };
		String theName[] = { "철수님의", "영희님의", "순애님의" };

		do {
			score[0][0] = Integer.parseInt(JOptionPane.showInputDialog(null, theName[0] + theMsg[0] + "점수를 입력하시오"));
		} while (score[0][0] < 0 || score[0][0] > 100);
		do {
			score[0][1] = Integer.parseInt(JOptionPane.showInputDialog(null, theName[0] + theMsg[1] + "점수를 입력하시오"));
		} while (score[0][1] < 0 || score[0][1] > 100);
		do {
			score[0][2] = Integer.parseInt(JOptionPane.showInputDialog(null, theName[0] + theMsg[2] + "점수를 입력하시오"));
		} while (score[0][2] < 0 || score[0][2] > 100);
//철수 점수 입력
		
		
		
		do {
			score[1][0] = Integer.parseInt(JOptionPane.showInputDialog(null, theName[1] + theMsg[0] + "점수를 입력하시오"));
		} while (score[1][0] < 0 || score[1][0] > 100);
		do {
			score[1][1] = Integer.parseInt(JOptionPane.showInputDialog(null, theName[1] + theMsg[1] + "점수를 입력하시오"));
		} while (score[1][1] < 0 || score[1][1] > 100);
		do {
			score[1][2] = Integer.parseInt(JOptionPane.showInputDialog(null, theName[1] + theMsg[2] + "점수를 입력하시오"));
		} while (score[1][2] < 0 || score[1][2] > 100);
//영희 점수 입력
		
		
		
		do {
			score[2][0] = Integer.parseInt(JOptionPane.showInputDialog(null, theName[2] + theMsg[0] + "점수를 입력하시오"));
		} while (score[2][0] < 0 || score[2][0] > 100);
		do {
			score[2][1] = Integer.parseInt(JOptionPane.showInputDialog(null, theName[2] + theMsg[1] + "점수를 입력하시오"));
		} while (score[2][1] < 0 || score[2][1] > 100);
		do {
			score[2][2] = Integer.parseInt(JOptionPane.showInputDialog(null, theName[2] + theMsg[2] + "점수를 입력하시오"));
		} while (score[2][2] < 0 || score[2][2] > 100);
//순애 점수 입력
		
		
		
		int sum1 = score[0][0] + score[0][1] + score[0][2];
		int sum2 = score[1][0] + score[1][1] + score[1][2];
		int sum3 = score[2][0] + score[2][1] + score[2][2];

		float avg1 = sum1 / 3F;
		float avg2 = sum2 / 3F;
		float avg3 = sum3 / 3F;
		JOptionPane.showMessageDialog(null, theName[0] + "총점 : " + sum1 + ", 평균 : " + avg1 + 
				"\n" + theName[1] + "총점 : " + sum2 + ", 평균 : " + avg2 +
				"\n" + theName[2] + "총점 : " + sum3 + ", 평균 : " + avg3);

	}

}

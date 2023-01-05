package basic;
import javax.swing.JOptionPane;

/*
 * 다중배열을 이용해서 3명의 성적관리 프로그램을 만듭니다.
 * 전체적인 조건은 다 같되, 한명당 모든 성적입력이 올바르지 않을 경우엔
 * 다음사람의 성적이 입력되면 안됩니다.
 * 
 * 출력시 첫번째 사람은 철수, 다음은 영희, 다음은 순애로 지정하여
 * 예시처럼 출력 시킵니다. 철수님의 총점 : ? 평균 : ?
 * 영희님의 총점 : ? 평균 : ?.....
 * 단 이름값은 입력받지 아니합니다.
 */

public class ScoreEx3 {

	public static void main(String[] args) {

		String name[] = { "철수", "영희", "순애" };

		int score[][] = new int[3][4];// 이 배열에는 각 과목의 점수와 총점도 int 라
		// 총점 까지 넣도록 배열을 생성 했습니다.

		// 아래 배열은 메세지 출력시 과목명을 출력 토록 한겁니다.
		String theMsg[] = { "국어", "영어", "수학" };

		float avg[] = new float[score.length];

		for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length-1; j++) {
					do {
						score[i][j] = Integer
								.parseInt(JOptionPane.showInputDialog(name[j] + "의 " + theMsg[i] + " 를 입력하세요"));
					} while (score[j][i] < 0 || score[j][i] > 100);// do while End
					score[name.length-1][theMsg.length-1] += score[j][i];// 총점 누적 대입
				}
		}

		for (int j = 0; j < name.length; j++) {
			for (int i = 0; i < theMsg.length; i++) {
				avg[j] = (float)(score[j][i] / 3.0);
			}
		}
		
		for (int j = 0; j < name.length; j++) {
			System.out
					.println(name[j] + "의 총점 " + score[j][score.length - 1] + " 평균 : " + (Math.round(avg[j] * 100) / 100.0));
		}

	}

}

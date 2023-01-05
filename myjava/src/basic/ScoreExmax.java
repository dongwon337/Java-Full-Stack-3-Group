package basic;
import javax.swing.JOptionPane;

public class ScoreExmax {

	public static void main(String[] args) {

		int[][] scores = new int[3][4];
		float[] avgs = new float[scores.length];
		String stu_name[] = { "철수", "영희", "순애" };
		String sub_name[] = {"국어","영어","수학"};
		int isCorrect = -1;//입력오류시 alert 출력 flag..
		
		
		// 사용자의 점수를 입력받아서, 해당 점수를 검증하고, 문제가 있다면
		// 다시 점수입력 하도록 하고 싶습니다.
		// 만약 한 사용자의 점수가 모두 입력이 되어있다면 해당점수에대해
		// 총점 평균도 한번에 처리되도록 할 예정입니다.
		for (int i = 0; i < scores.length; i++) {
			// 이영역은 어떤 처리를 해야 하는 영역 일까요?
			for (int j = 0; j < scores[i].length - 1; j++) {
				//철수의 국어, 영어, 수학 점수를 입력받고, 검증도 할겁니다.
				do {
					if(isCorrect != -1) {
						JOptionPane.showMessageDialog(null,"틀렸습니다. 다시 입력하세요.");
					}
				scores[i][j] = Integer.parseInt(
						JOptionPane.showInputDialog(sub_name[j] + "점수 입력"));
				isCorrect++; //정수 입력후 여기로 오면 첫 점수 입력이 아니라는 의미.. 따라서 값 증가해줌,
				
			}while(scores[i][j] < 0 || scores[i][j] > 100);
				
				isCorrect = -1; //여기로 온다는 말은 한 과목에 대한 입력 검증이
				//끝났으므로 다음 과목을 받기 위해 값 초기화 해줌
				
			//i인 학생의 총점을 여기서 넣어줍니다.
			scores[i][scores.length] += scores[i][j];
		}//Inner for 가 끝났다는 의미는?? 한사람의 총점까지가 완료되었다는 말.
		avgs[i] = (float)(scores[i][scores.length] / 3.0);
	  }// 이 루프가 다 끝났다는 의미는 모든 학생의 점수 및 총점, 평균까지 완료되었다는뜻.
		
		//출력..
		for(int i = 0; i<scores.length; i ++) {
			System.out.println();
			JOptionPane.showMessageDialog(null, stu_name[i] + "님의 성적 총점:" + "" + scores[i][scores.length] + ",평균:" + avgs[i]);
		}
	}

}

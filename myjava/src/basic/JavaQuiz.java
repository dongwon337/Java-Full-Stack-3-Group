package basic;
import java.io.IOException;

import javax.swing.JOptionPane;

public class JavaQuiz {

	public static void main(String[] args) throws IOException {

		int kor, eng, math, result;
		String name1;
		double avg;// 평균변수

		name1 = JOptionPane.showInputDialog("이름 입력: ");
		kor = Integer.parseInt(JOptionPane.showInputDialog("수학점수 입력: "));
		eng = Integer.parseInt(JOptionPane.showInputDialog("영어점수 입력: "));
		math = Integer.parseInt(JOptionPane.showInputDialog("국어점수 입력: "));
		
		 
		result = kor + eng + math;
		avg = result / 3.0;

		JOptionPane.showMessageDialog(null, name1 + "님의 총점 : " + result + "\n 평균은 :" + avg);
	}

}

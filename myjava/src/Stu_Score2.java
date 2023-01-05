import javax.swing.JOptionPane;

public class Stu_Score2 {

	public static void main(String[] args) {
		int kor,eng,math,result;
		double avg;//평균변수
		
		kor = Integer.parseInt(JOptionPane.showInputDialog("국어점수 입력 : "));
		eng = Integer.parseInt(JOptionPane.showInputDialog("영어점수 입력 : "));
		math = Integer.parseInt(JOptionPane.showInputDialog("수학점수 입력 : "));
		
		result = kor + eng + math;
		avg = result / 3.0;
		
		JOptionPane.showInternalMessageDialog(null, "당신의 총점 : " + result + "\n 평균은 : " + avg);
		
		
	
	}

}
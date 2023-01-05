import javax.swing.JOptionPane;

public class Stu_Score1 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		
		String lan = JOptionPane.showInputDialog("국어점수 입력 하세요");
		int p_lan = Integer.parseInt(lan);
		
		String eng = JOptionPane.showInputDialog("영어점수 입력 하세요");
		int p_eng = Integer.parseInt(eng);
		
		String math = JOptionPane.showInputDialog("수학점수 입력 하세요");
		int p_math = Integer.parseInt(math);
		
		int sum = p_lan + p_eng + p_math;
		
		int ave = sum / 3;
		
		JOptionPane.showMessageDialog(null, name+"님, 당신의 성적은 다음과 같습니다. \n"+"총점 : "+ sum +"\n평균 : "+ ave);
	}

}

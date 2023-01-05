package basic;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthPasswordFieldUI;


public class SwitchExam2 {

	public static void main(String[] args) {
		
		/*
		 * 자바에서는 switch~case 구문의 조건값으로는 int 이하만 됩니다.
		 * 반드시 기억 하세요.
		 */

		/*
		 * 두수와 연산자를 입력해서 결과를 출력하도록 switch 문을 이용해서 구현하세요
		 * 첫수 1 연산자 * 두번째수 2 --> 결과 : 1 * 2 = 3
		 * 
		 * 출력문은 반드시 한번만 정의 하세요..
		 * 
		 * 계산기를 시작하면 아래의 메세지를 띄우세요
		 * 계산기를 실행 하시겠습니까? -- > 확인으 누를시에만 계산기가 작동합니다.
		 * 수를 입력 받기를 시작합니다. 만약 cancel, no 를 입력하면 좋은하루되세요!
		 * 출력후 프로그램 종료.
		 * 계산이 끝난후 사용자에게 더 계산할지 물어봅니다.(y or n)
		 * 만약 y 가 입력되면, 첫수를 다시 입력받도록 하고 즉 계산기가 실행되게 합니다.
		 * n입력시 좋은하루되세요! 메세지 출력후 종료
		 * 
		 * 
		 */
		int Ready = JOptionPane.showConfirmDialog(null, "계산을 시작 하시겠습니까?", "김동환의 계산기", JOptionPane.YES_NO_OPTION);
		if(Ready != JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "프로그램 종료\n좋은하루되세요!");
			System.exit(0);
		}
		while(true){
			
		int fir = Integer.parseInt(JOptionPane.showInputDialog("첫수입력"));
		char op = JOptionPane.showInputDialog("연산자입력").charAt(0);
		int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째수입력"));
		String msg="연산자를 잘못 입력하였습니다.";//사용자가 올바르지 않은 연산자를입력시 처리할 메세지 변수.
		double result = 0;//결과값 선언..
		
		switch (op){
		case '*':
			result = fir * sec;
			break;
		case '+':
			result = fir + sec;
			break;
		case '-':
			result = fir - sec;
			break;
		case '/':
			result = fir / sec;
			break;
		
		default:
			msg = "장난하지마";
			break;
		}
		
		int out = JOptionPane.showConfirmDialog(null, "결과 : "  + fir + op + sec + "=" + result + "입니다.\n 더 계산을 하시겠습니까?", "김동환의 계산기", JOptionPane.YES_NO_OPTION);
		if(out != JOptionPane.YES_OPTION){
		
		
		JOptionPane.showMessageDialog(null, "프로그램 종료\n좋은하루되세요!");
		System.exit(0);
			
		}
		}
		
}}		
		
		
		
		
		
		
		
		
		


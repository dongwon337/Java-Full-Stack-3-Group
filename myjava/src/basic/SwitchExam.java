package basic;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SwitchExam {

	public static void main(String[] args) {
		
		/*
		 * 자바에서는 switch~case 구문의 조건값으로는 int 이하만 됩니다.
		 * 반드시 기억하세요.
		 */
		
		/*
		 * 두수와 연산자를 입력해서 결과를 출력하도록 switch 문을 이용해서 구현하세요
		 * 첫수 1 연산자 * 두번째수 2 --> 결과 : 1 * 2 = 3
		 * 
		 * 출력문은 반드시 한번만 정의 하세요.
		 * 
		 * 계산기를 시작하면 아래의 메세지를 띄우세요.
		 * 계산기를 실행 하시겠습니까? --> 확인을 누를시에만 계산기가 작동한다.
		 * (즉 수를 입력 받기를 시작합니다. 만약 cancel, no를 입력하면 좋은 하루 되세요!
		 * 출력후 프로그램 종료)
		 * 계산이 끝난 후 사용자에게 더 계산할지 물어봅니다.(y or n)
		 * 만약 y가 입력되면, 첫수를 다시 입력받도록 하고, 즉 계산기가 재 실행되게 합니다.
		 * n 입력시 좋은 하루 되세요! 메시지 출력 후 종료.
		 */
		
//		boolean flag = false;
//		int a = 1;
//		Outer:while(a <= 5) {
//			a++;
//			System.out.println("현재 위 변수가 false 라 이건 실행 안됨.");
//			inner:while(true) { 
//				int y = JOptionPane.showConfirmDialog(null, "계속 돌리래");
//				if(y ==1 || y== 2) {
//					System.out.println("Label을 이용해서 Outer while을 끝냅니다.");
//					break Outer;
//				}
//			}
//		}
//		System.out.println("현재 a의 값 : " + a);
		
//		int start = JOptionPane.showConfirmDialog(null, "계산기를 실행 하시겠습니까?");
//		if(start ==1 || start== 2) {
//				System.out.println("좋은 하루 되세요!");
//				System.exit(start);
//		}
		
		int user_choice = JOptionPane.showConfirmDialog(null, "계산기 할래?");
		if(user_choice != 0) {
			System.out.println("좋은 하루 되세요.");
			System.exit(0);
		}
		while(true) {
			
		
		
		int fir = Integer.parseInt(JOptionPane.showInputDialog("첫번째 수 입력"));
		char cal = JOptionPane.showInputDialog("연산자 입력").charAt(0);
		int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째 수 입력"));
		String msg=null;//사용자가 올바르지 않은 연산자를 입력시 처리할 메세지 변수.
		double result = 0;//결과값 선언.
		
		switch (cal) {
		case '+':
			result = fir + sec;
			break;
		case '-':
			result = fir - sec;
			break;
		case '*':
			result = fir * sec;
			break;
		case '/':
			result = fir / sec;
			break;
		case '%':
			result = fir % sec;
			break;
		default:
			msg = "장난하지마";
			break;
		}
		
		if(!msg.equals("")) {
			JOptionPane.showMessageDialog(null, msg);
			System.exit(0);//자바프로그램을 명시적으로 완전종료 하는 API
			//return;
		}
		
		
		JOptionPane.showInternalMessageDialog(null, "결과 : " + fir + cal + sec + " = " + result);
		
		int isCon = JOptionPane.showConfirmDialog(null, "게임 더할래?");
		if(isCon != 0) {
			System.out.println("좋은 하루 되세요.");
			break;
		}
		
//		String a = new String("a");
//		char op = '+';
//		double d = 1;
//		
//		switch (op) {
//		case '=':
//			
//			break;
//
//		default:
//			break;
		}
	}
}

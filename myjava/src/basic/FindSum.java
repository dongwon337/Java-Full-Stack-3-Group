package basic;

import javax.swing.JOptionPane;


public class FindSum {

	public static void main(String[] args) {

		
		/*
		 * 두수를 입력을 받으세요 (값의 크기는 상관없음..100,4,4,100)
		 * 두수의 차이(100 , 4 를 받았을 경우, 차이는 96 입니다.
		 * 이 차이의 누적합을 구해서 출력하라.
		 */
		
	      
		int a = Integer.parseInt(JOptionPane.showInputDialog("첫번째 수를 입력하세요."));
		int b = Integer.parseInt(JOptionPane.showInputDialog("두번째 수를 입력하세요."));
		
		int temp;
		if(a >= b) {
			temp = a;
			a = b;
			b = temp;
		}
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		JOptionPane.showMessageDialog(null, a + "~" + b + "누적합 :" + sum);
		System.out.println(a + "~" + b + "누적합 :" + sum);
		
//		if(sum < 0) {
//			JOptionPane.showMessageDialog(null,"두 수 차이의 합은 " + '"'+ a  + sum + b  + '"' + " 입니다.");
//			System.exit(0);
//		}else{
//			JOptionPane.showMessageDialog(null, "두 수 차이의 합은 " + '"' + sum + '"' + " 입니다.");
//			System.exit(0);
		}
	}


package basic;
import javax.swing.JOptionPane;

public class QuizUseMethod {

	public static void main(String[] args) {

		/*
		 * 아래 정의된 내용대로 수행 되도록 메서드를 정의 하여
		 * 코드를 완성하세요
		 */
		
		int x = 0;
		
		while(true) {
			String choice = 
					JOptionPane.showInputDialog
					(null, "1.최대값 2.두개의 수 사이 누적합 3.수나열 4.종료");
					x = Integer.parseInt(choice);
			
			if(x == 1) {
				//결과를 return 해주는 메서드를 호출 하여 값 출력 할 수 있도록
				//아래의 매서드 정의 하세요.
				int res = max();
				JOptionPane.showMessageDialog(null, "두수중 최대수는 : " + res);
			}else if(x ==2) {
				sum2Value();//정의 하세요..
			}else if(x ==3) {
				
				int firstSu	= Integer.parseInt(
						JOptionPane.showInputDialog("첫수 입력"));
				int SecSu	= Integer.parseInt(
						JOptionPane.showInputDialog("두번째수 입력"));
				int thirdSu	= Integer.parseInt(
						JOptionPane.showInputDialog("세번쨰수 입력"));
				
				String str	= printNumSequence(firstSu, SecSu, thirdSu);
				JOptionPane.showConfirmDialog(null, "큰 순으로 나열은 \n"+str);
				
			}else if(x == 4) {
				break;
				
			}else {
				JOptionPane.showConfirmDialog(null, "잘못입력하셨습니다.");
				
			}
			System.out.println();
		}
	}


	private static String printNumSequence(int firstSu, int secSu, int thirdSu) {
		int temp;
		if(secSu >= firstSu && secSu >= thirdSu) {
			temp = firstSu;
			firstSu = secSu;
			secSu = temp;
		}else if(thirdSu >= firstSu && thirdSu >= secSu) {
			temp = firstSu;
			firstSu = thirdSu;
			thirdSu = temp;
		}
		if(thirdSu >= secSu) {
			temp = secSu;
			secSu = thirdSu;
			thirdSu = temp;
		}
		String str = firstSu + ">=" + secSu + ">=" + thirdSu;
		return str;
	}


	static void sum2Value() {
		int x = Integer.parseInt(
				JOptionPane.showInputDialog("첫수 입력"));
		int y = Integer.parseInt(
				JOptionPane.showInputDialog("두번째수 입력"));
		int temp;
		if(x >= y) {
			temp = x;
			x = y;
			y = temp;
		}
		int sum = 0;
		for(int i = x; i <= y; i++) {
			sum += i;}
		JOptionPane.showMessageDialog(null, x + "~" + y + "누적합 :" + sum);
	}


	static int max() {
		int x = Integer.parseInt(
				JOptionPane.showInputDialog("첫수 입력"));
		int y = Integer.parseInt(
				JOptionPane.showInputDialog("두번째수 입력"));
		if(x > y)
			return x;
		return y;
	}
}

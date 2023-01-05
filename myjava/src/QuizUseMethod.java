import javax.swing.JOptionPane;

public class QuizUseMethod {

	static int max() {
		int x = Integer.parseInt(JOptionPane.showInputDialog("첫번째수 입력"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("두번째수 입력"));		
		if(x > y)
			return x;
		return y;
	}
	
	static void sum2Values() {
		int x = Integer.parseInt(JOptionPane.showInputDialog("첫번째수 입력"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("두번째수 입력"));
		int temp;
		if(x >= y) {
			temp = x;
			x = y;
			y = temp;
		}
		int sum = 0;
		for(int i = x; i<=y; i++) {
			sum += i;
		}
		System.out.println(x + " ~ " + y + "누적합은 " + sum + "입니다.");
	}
	
	public static void main(String[] args) {
		/*
		 * 아래 정의된 내용대로 수행 되도록 메서드를 정의 하여
		 * 코드를 완성하세요.
		 */

		int x = 0;
		
		while(true) {
			String choice = JOptionPane.showInputDialog(null, "1.최대값 2.누적합 3.수나열 4.종료");
			x = Integer.parseInt(choice);
			
			if(x == 1) {
				//결과를 return 해주는 메서드를 호출 하여 값 출력 할 수 있도록
				//아래의 메서드 정의 하세요.
				int res = max();
				
				System.out.println("두 수중 최대수는 : " + res);
			}else if(x == 2) {
				sum2Values();//정의 하세요.
			}else if(x == 3) {
				int firstSu = Integer.parseInt(JOptionPane.showInputDialog("첫수 입력"));
				System.out.println("첫번째 수 = " + firstSu);
				int secSu = Integer.parseInt(JOptionPane.showInputDialog("두번째수 입력"));
				System.out.println("두번째 수 = " + secSu);
				int thirdSu = Integer.parseInt(JOptionPane.showInputDialog("세번째수 입력"));
				System.out.println("세번째 수 = " + thirdSu);
				
				String str = printNumSequence(firstSu, secSu, thirdSu);
				
				JOptionPane.showConfirmDialog(null, "큰 순으로 나열은 \n" + str);
				
			}else if(x == 4) {
				break;
			}else {
				JOptionPane.showConfirmDialog(null, "잘못입력 했습니다.");
			}
			System.out.println();
		}
	}

	private static String printNumSequence(int firstSu, int secSu, int thirdSu) {
		int temp;
		if(secSu>=firstSu && secSu>=thirdSu) {
			//무조건 b가 크다.
			//값을 치환한다.
			temp = firstSu;//a 값을 temp에 저장후 b에 넘긴다.
			firstSu = secSu;//그냥 이렇게 하면 a의 값은 날아가버림.
			secSu = temp;
			
		}else if(thirdSu>=firstSu && thirdSu>=secSu) {
			//무조건 c가 크다.
			temp = firstSu;
			firstSu = thirdSu;
			thirdSu = temp;
		}
		//3번째수가 2번보다 클경우..
		if(thirdSu >= secSu) {
			temp = secSu;
			secSu = thirdSu;
			thirdSu = temp;
		}
		
		String str = "" + firstSu + ">=" + secSu + ">=" + thirdSu;
		return str;
		
	}

}

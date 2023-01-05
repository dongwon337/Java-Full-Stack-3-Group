package basic;

import javax.swing.JOptionPane;


/*
 * 가위바위보게임을 만드세요.
 * 조건은 아래와 같습니다.
 * 
 * 1. 프로그램 시작하면 게임 하실래요(y/n)? 라고 묻고 y 입력시 게임 시작됩니다.
 * 2. 시작되면 사용자에게 값을 입력토록 하세요(가위, 바위, 보 중 하나)
 * 2.1 만약 위 값이 아닌 다른값이 들어오면 "틀린 값입니다" 출력후 프로그램 종료.
 * 3. 만약 올바른 값이 입력되면, Math.random() 을 이용해서 1 ~ 3 까지 생성하세요
 * 4. 생성된 값을 이용해서 사용자와 컴퓨터간의 게임을 진행후 아래처럼 출력시키세요
 * 5. 축 당신 승(컴 : 보, 당신 : 가위) or ㅠㅠ 컴 승(컴 : 주먹, 당신 : 가위)
 * 6. 위 메세지가 출력된후 프로그램을 종료 하세요.  
 */
public class GawiBawiBoGame2 {

	public static void main(String[] args) {
		
		
		int Ready = JOptionPane.showConfirmDialog(null, "게임을 시작 하시겠습니까?", "김동환의 가위바위보", JOptionPane.YES_NO_OPTION);
		
		if (Ready == JOptionPane.YES_OPTION) {
			String Me = JOptionPane.showInputDialog(null, "가위, 바위, 보 하나를 입력하세요", "가위 / 바위 / 보");
				if(Me.equals("가위")){
					String [] com = {"가위", "바위", "보"};
					String comValue = com[((int)(Math.random()*com.length))];
					JOptionPane.showMessageDialog(null, "당신은 가위를 입력했습니다.\n 컴퓨터는 " + comValue + "를 입력했습니다.");
				}else if(Me.equals("바위")){
					String [] com = {"가위", "바위", "보"};
					String comValue = com[((int)(Math.random()*com.length))];
					JOptionPane.showMessageDialog(null, "당신은 바위를 입력했습니다.\n 컴퓨터는 " + comValue + "를 입력했습니다.");
				}else if(Me.equals("보")){
					String [] com = {"가위", "바위", "보"};
					String comValue = com[((int)(Math.random()*com.length))];
					JOptionPane.showMessageDialog(null, "당신은 보를 입력했습니다.\n 컴퓨터는 " + comValue + "를 입력했습니다.");
				}
			
			
			
			} else {
			JOptionPane.showMessageDialog(null, "프로그램 종료\n다음에 도전하세요!");
			System.exit(0);
		}

	}

}

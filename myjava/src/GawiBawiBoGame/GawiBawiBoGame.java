package GawiBawiBoGame;
import javax.swing.JOptionPane;

import GawiBawiBoGame.SeeRecord;

/*
 * 가위바위보게임을 만드세요.
 * 조건은 아래와 같습니다.
 * 
 * 1. 프로그램 시작하면 게임 하실래요(y/n)? 라고 묻고 y 입력시 게임 시작됩니다.
 * 2. 시작되면 사용자에게 값을 입력토록 하세요(가위,바위,보 중 하나)
 * 2.1 만약 위 값이 아닌 다른값이 들어오면 "틀린 값입니다." 출력후 프로그램 종료.
 * 3. 만약 올바른 값이 입력되면, Math.random() 을 이용해서 1 ~ 3 까지 생성하세요
 * 4. 생성된 값을 이용해서 사용자와 컴퓨터간의 게임을 진행후 아래처럼 출력시키세요
 * 5. 축 당신 승(컴 : 보, 당신 : 가위) or ㅠㅠ 컴 승(컴 : 주먹, 당신 : 가위)
 * 6. 위 메세지가 출력된 후 프로그램을 종료 하세요.
 */
public class GawiBawiBoGame {
	
	static int playCount;
	static int win;
	static int loss;
	static int draw;
	static boolean isCorrect;
	
	public GawiBawiBoGame() {
	
		String[] option = {"1.뉴게임", "2.전적보기", "3.게임종료"};
		int choice = JOptionPane.showOptionDialog(null, "Hello!", "가위 바위 보", 0, 1, null, option, option[0]);
			
				if(choice == 0) {
					String input = JOptionPane.showInputDialog(null, "가위,바위,보 중에 입력하세요.");
					int ran = (int)(Math.random() * 3) + 1;
					
					if(input.equals("가위")) {
							if(ran == 1) {
								JOptionPane.showMessageDialog(null, "비겼습니다 (컴 : 가위, 당신 : 가위)");
								draw++; playCount++;
								showMenu();
							}else if(ran == 2) {
								JOptionPane.showMessageDialog(null, "ㅠㅠ 컴 승 (컴 : 바위, 당신 : 가위)");
								win++; playCount++;
								showMenu();
							}else {
								JOptionPane.showMessageDialog(null, "축 당신 승 (컴 : 보, 당신 : 가위)");
								loss++; playCount++;
								showMenu();
							}
						}else if(input.equals("바위")) {
							if(ran == 1) {
								JOptionPane.showMessageDialog(null, "축 당신 승 (컴 : 가위, 당신 : 바위)");
								win++; playCount++;
								showMenu();
							}else if(ran == 2) {
								JOptionPane.showMessageDialog(null, "비겼습니다 (컴 : 바위, 당신 : 바위)");
								draw++; playCount++;
								showMenu();
							}else {
								JOptionPane.showMessageDialog(null, "ㅠㅠ 컴 승 (컴 : 보, 당신 : 바위)");
								loss++; playCount++;
								showMenu();
							}
						}else if(input.equals("보")) {
							if(ran == 1) {
								JOptionPane.showMessageDialog(null, "ㅠㅠ 컴 승 (컴 : 가위, 당신 : 보)");
								loss++; playCount++;
								showMenu();
							}else if(ran == 2) {
								JOptionPane.showMessageDialog(null, "축 당신 승 (컴 : 바위, 당신 : 보)");
								win++; playCount++;
								showMenu();
							}else {
								JOptionPane.showMessageDialog(null, "비겼습니다 (컴 : 보, 당신 : 보)");
								draw++; playCount++;
								showMenu();
							}
						}else {
							JOptionPane.showMessageDialog(null, "틀린 값 입니다.");
							showMenu();
							}
					
					}else if(choice == 1) {
							new SeeRecord(this);
					}else {
						JOptionPane.showInternalMessageDialog(null, "Bye Bye");
					}
				}

	
	private static void showMenu() {
		while(!isCorrect) {
			new GawiBawiBoGame();
			isCorrect = true;
		}

	}

	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	public void setWin(int win) {
		this.win = win;
	}
	
	public void setDraw(int draw) {
		this.draw = draw;
	}
	
	public int getLoss() {
		return loss;
	}
	public int getWin() {
		return win;
	}
	public int getPlayCount() {
		return playCount;
	}
	public int getDraw() {
		return draw;
	}
	
}

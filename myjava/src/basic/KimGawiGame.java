package basic;
import javax.swing.JOptionPane;


public class KimGawiGame {
	
	JOptionPane thePane;
	String userinput;
	String com;
	int playCount;
	int win;
	int loss;
	String[] theMessage;
	boolean isCorrect;
	int Ready;

	
	public KimGawiGame() {
		
		
		theMessage = new String[] {null, "가위, 바위, 보 하나를 입력하세요", "가위 / 바위 / 보" };
		showMenu();
	}
	


	private void showMenu() {
		while(!isCorrect) {
			userinput = thePane.showInputDialog(theMessage[1],theMessage[2]);
			playGame();
			isCorrect = true;
		}

	}

	
	private void playGame() {
		String[] com = { "가위", "바위", "보" };
		String[] op = { "1.뉴게임" , "2.전적보기", "3.게임종료" };
		String comValue = com[((int) (Math.random() * com.length))];
	while(true){	
		if (userinput.equals(comValue)) {
			JOptionPane.showMessageDialog(null,
					"당신은 " + userinput + " 를 입력했습니다.\n컴퓨터는 " + comValue + " 를 입력했습니다.\n" + "\n비겼습니다!");
			playCount++;
			JOptionPane.showMessageDialog(null, "승 : " + getWin() + "\n 패 : " + getLoss() +  "\n 무승부 : " + getPlayCount());

		} else if (userinput.equals("가위") && comValue.equals("보")) {
			JOptionPane.showMessageDialog(null,
					"당신은 " + userinput + " 를 입력했습니다.\n컴퓨터는 " + comValue + " 를 입력했습니다.\n" + "\n당신이 이겼습니다!");
			win++; 
			JOptionPane.showMessageDialog(null, "승 : " + getWin() + "\n 패 : " + getLoss() +  "\n 무승부 : " + getPlayCount());
			
		} else if (userinput.equals("가위") && comValue.equals("바위")) {
			JOptionPane.showMessageDialog(null,
					"당신은 " + userinput + " 를 입력했습니다.\n컴퓨터는 " + comValue + " 를 입력했습니다.\n" + "\n당신이 졌습니다!");
			loss++; 
			JOptionPane.showMessageDialog(null, "승 : " + getWin() + "\n 패 : " + getLoss() +  "\n 무승부 : " + getPlayCount());
			
		} else if (userinput.equals("바위") && comValue.equals("가위")) {
			JOptionPane.showMessageDialog(null,
					"당신은 " + userinput + " 를 입력했습니다.\n컴퓨터는 " + comValue + " 를 입력했습니다.\n" + "\n당신이 이겼습니다!");
			win++; 
			JOptionPane.showMessageDialog(null, "승 : " + getWin() + "\n 패 : " + getLoss() +  "\n 무승부 : " + getPlayCount());
			
		} else if (userinput.equals("바위") && comValue.equals("보")) {
			JOptionPane.showMessageDialog(null,
					"당신은 " + userinput + " 를 입력했습니다.\n컴퓨터는 " + comValue + " 를 입력했습니다.\n" + "\n당신이 졌습니다!");
			loss++; 
			JOptionPane.showMessageDialog(null, "승 : " + getWin() + "\n 패 : " + getLoss() +  "\n 무승부 : " + getPlayCount());
			
		} else if (userinput.equals("보") && comValue.equals("바위")) {
			JOptionPane.showMessageDialog(null,
					"당신은 " + userinput + " 를 입력했습니다.\n컴퓨터는 " + comValue + " 를 입력했습니다.\n" + "\n당신이 이겼습니다!");
			win++; 
			JOptionPane.showMessageDialog(null, "승 : " + getWin() + "\n 패 : " + getLoss() +  "\n 무승부 : " + getPlayCount());
			
		} else if (userinput.equals("보") && comValue.equals("가위")) {
			JOptionPane.showMessageDialog(null,
					"당신은 " + userinput + " 를 입력했습니다.\n컴퓨터는 " + comValue + " 를 입력했습니다.\n" + "\n당신이 졌습니다!");
			loss++;
			JOptionPane.showMessageDialog(null, "승 : " + getWin() + "\n 패 : " + getLoss() +  "\n 무승부 : " + getPlayCount());
			
		} else {
			JOptionPane.showMessageDialog(null, "틀린값을 입력하셨습니다.\n프로그램 종료!");
			System.exit(0);
		}
		
		
		int i = JOptionPane.showOptionDialog(null, "게임이 끝났습니다! \n 다음 중 선택하세요!", "김동환의 가위바위보", loss, Ready, null, op, JOptionPane.PLAIN_MESSAGE);
		if(i == JOptionPane.NO_OPTION) {	
			
			break;
			
		}else if(i == JOptionPane.YES_OPTION){
			showMenu();
		}else {
			JOptionPane.showMessageDialog(null, "프로그램 종료!");
				System.exit(0);
				
	}break;
	
	}
	} 
//	else {
//		JOptionPane.showMessageDialog(null, "프로그램 종료\n다음에 도전하세요!");
//		System.exit(0);
//	}
	
	




	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	public void setWin(int win) {
		this.win = win;
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

}

package basic;

import javax.swing.JOptionPane;



public class KimScore extends KimGawiGame{

	public KimScore() {
		System.out.println("승 : " + getWin() + "\n 패 : " + getLoss() +  "\n 무승부 : " + getPlayCount());	
		JOptionPane.showMessageDialog(thePane,"!최종결과!" + "\n승 : " + getWin() + "\n 패 : " + getLoss() +  "\n 무승부 : " + getPlayCount());	
		JOptionPane.showMessageDialog(null, "수고 하셨습니다!\n 프로그램 종료!");
		
	}
}

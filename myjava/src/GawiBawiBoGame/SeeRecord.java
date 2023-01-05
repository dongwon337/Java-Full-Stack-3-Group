package GawiBawiBoGame;
import javax.swing.JOptionPane;

public class SeeRecord extends GawiBawiBoGame {
	
	GawiBawiBoGame game;
	
	public SeeRecord(GawiBawiBoGame game) {
		this.game = game;
		showSeeRecordMethod();
	}
	
	public void GawiBawiBoGame() {
		JOptionPane.showMessageDialog(null, "지금 까지 전적은 몇전 : " 
				+ playCount + "몇승 : " + win + "몇무 : " 
				+ draw + "몇패 : " + loss);
	}
	
	void showSeeRecordMethod(){
		game.getPlayCount();
		game.getLoss();
		game.getWin();
		game.getDraw();
		
		GawiBawiBoGame();
		}
	
}

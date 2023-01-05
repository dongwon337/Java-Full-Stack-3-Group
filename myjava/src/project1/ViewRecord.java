package project1;

import javax.swing.JOptionPane;

public class ViewRecord extends PlayerRecord{

	Game game;
	
	public ViewRecord(Game game) {
		this.game = game;
		showViewRecordMethod();
	}
	
	public void Game() {
		JOptionPane.showMessageDialog(null, "지금 까지 전적은 몇전 : "
				+ total + "몇승 : " + win + "몇무 : "
				+ draw + "몇패 : " + lose + "승률 : " + win_Rate);
	}
	
	void showViewRecordMethod() {
		game.getTotal();
		game.getWin();
		game.getLose();
		game.getDraw();
		
		Game();
		
		
	}
}

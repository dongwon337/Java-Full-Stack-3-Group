package project1;
//사용자의 게임 결과 정보를 유지하는 DTO
//박동원asdfasdf asdf
//김동환 gafsdsagdadsg

public class PlayerRecord {
	
	private int win;
	private int draw;
	private int lose;
	private int total;
	private double win_Rate;

	
	public void autoSet(int result) {
		if(result == 0) {//draw
			setDraw(1);
		}else if(result == 1) {//win
			setWin(1);
		}else if(result == 2) {//lose
			setLose(1);
		}
	}

	
	public int getWin() {
		return win;
	}


	public void setWin(int win) {
		this.win += win;
		setTotal();
	}


	public int getDraw() {
		return draw;
	}


	public void setDraw(int draw) {
		this.draw += draw;
		setTotal();
	}


	public int getLose() {
		return lose;
	}


	public void setLose(int lose) {
		this.lose += lose;
		setTotal();
	}


	public int getTotal() {
		return total;
	}


	public void setTotal() {
		this.total = this.win + this.lose + this.draw;
		setWin_Rate();
	}


	public String getWin_Rate() {//소숫점 2자리 까지 표시 위한 String 사용
		return String.format("%.2f", this.win_Rate);
	}


	public void setWin_Rate() {
		this.win_Rate = this.getWin() / (double)this.getTotal() * 100.0;
	}
}

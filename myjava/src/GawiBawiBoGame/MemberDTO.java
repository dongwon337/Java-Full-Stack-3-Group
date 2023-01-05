package GawiBawiBoGame;
import javax.swing.JOptionPane;

public class MemberDTO {

	private String mem_Email;
	JOptionPane input;
	
	public MemberDTO() {
		inputEmail();
	}
	
	//메서드 리턴을 void로 했는데, 예시 끝난후 로직상 변경해야 할겁니다.
	private void inputEmail() {
		this.mem_Email = input.showInputDialog("Email을 입력 바랍니다");
		getter();
	}
	
	private void getter() {
		JOptionPane.showMessageDialog(input, "입력한 Email은" + mem_Email + "입니다.");
		new GawiBawiBoGame();
	}

	public String getMem_Email() {
		return mem_Email;
		
	}
}

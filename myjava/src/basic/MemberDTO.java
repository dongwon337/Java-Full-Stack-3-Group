package basic;
import javax.swing.JOptionPane;

public class MemberDTO {

	private static String mem_Email;
	JOptionPane input;
	
	public MemberDTO() {
		inputEmail();
	}
	
	
	//메서드 리턴을 void 로 했는데, 예시 끝난후 로직상 변경해야 할겁니다.
	private void inputEmail() {
		this.mem_Email = input.showInputDialog("Email 을 입력 바랍니다.");
		if(true){
			JOptionPane.showMessageDialog(input,"당신의 아이디는 " + getMem_Email() + " 입니다.");
		}
	}



	public static String getMem_Email() {
		return mem_Email;
	}
}

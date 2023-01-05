package ioex;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class etcMenu2

{
	JFrame jFrame = new JFrame("기타 메뉴 보기 OPTION");
	JButton[] btn = new JButton[5];

	public etcMenu2() {
		// GridLayout 적용

		jFrame.setLayout(new GridLayout(5, 0));
		jFrame.setLocationRelativeTo(null);
		// 컨테이너 가져오기
		Container container = jFrame.getContentPane();

		btn[0] = new JButton("[1] 내 플레이 횟수 보기");
		btn[1] = new JButton("[2] 1위 플레이어 보기");
		btn[2] = new JButton("[3] 랭크 1위부터 보기");
		btn[3] = new JButton("[4] 랭크 꼴찌부터 보기");
		btn[4] = new JButton("[5] 프로그램 종료");

		// 컴포넌트 생성 및 추가하기
		for (int i = 0; i < btn.length; i++) {
			container.add(btn[i]);
		}

		btn[0].addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "1. 내 플레이 횟수 보기");
		});

		btn[1].addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "2. 1위 플레이어 보기");
		});

		btn[2].addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "3. 랭크 1위부터 보기");
		});

		btn[3].addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "4. 랭크 꼴찌부터 보기");
		});

		btn[4].addActionListener(event -> {
			int ex = JOptionPane.showConfirmDialog(null, "프로그램을 종료 하시겠습니까?", null, JOptionPane.YES_NO_OPTION);
			if (ex == JOptionPane.NO_OPTION){
			} else {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				System.exit(0);
			}
		});

		// 프레임 크기 지정하기
		jFrame.setSize(250, 250);

		// 프레임 보이기
		jFrame.setVisible(true);

		// 종료버튼에 대한 설정
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new etcMenu2();
	}

}
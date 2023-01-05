package ioex;
//	만약 사용자가 위 1_1 에서 기타 메뉴 보기를 선택하면 아래처럼 메뉴가 보입니다.
//* 
//* 1.총 플레이어수
//* 2.승률 1위 플레이어 : id의 끝 3자리는 *** 로 표시 및 승률 표시
//* 3.승률 꼴찌부터 보기 선택시 승률이 제일 아래인 사용자부터 전체 사용자를 출력해주고
//* 역시 ID의 끝 3자리는 *** 로 표기합니다.
//* 4.승률 1위 부터 보기는 반대로 보여주고, ID 끝 3자리는 *** 로 표기합니다.
//* 
//* 이상과 같이 구현 하시는데, 각 기능별 클래스를 최대한 상세히 분류 하시고(상속 안해도됨)
//* 업무별로 반드시 한사람이 한 업무(Business Logic) 을 맡아야 합니다.
//* 
//* 사용자의 모든 데이터는 반드시 DTO 를 이용해서 하시고, 파일에 저장할 때는 DAO 를 구현해서
//* 하세요.
//* 이때 DAO 는 공통의 기능처럼 최대한 다양한 목적에 사용되어야 합니다.

import javax.swing.JOptionPane;

public class etcMenu {
	
	public static void main(String[] args) {
		
		String[] etcArr = {"1", "2" , "3" , "4" , "프로그램 종료"};
		
		while(true){
		int etc = JOptionPane.showOptionDialog(null,"\n[1] 내 플레이 횟수 보기\n\n[2] 1위 플레이어 보기\n\n"
				+ "[3] 랭크 1위부터 보기\n\n[4] 랭크 꼴찌부터 보기\n"
		,"기타메뉴보기 option", 0, 3, null, etcArr, etcArr[4]);
		if(etc == 0) {
			JOptionPane.showMessageDialog(null, "1. 내 플레이 횟수 보기");
		}else if(etc == 1) {
			JOptionPane.showMessageDialog(null, "2. 1위 플레이어 보기");
		}else if(etc == 2) {
			JOptionPane.showMessageDialog(null, "3. 랭크 1위부터 보기");
		}else if(etc == 3) {
			JOptionPane.showMessageDialog(null, "4. 랭크 꼴찌부터 보기");
		}else{
			int ex = JOptionPane.showConfirmDialog(null, "프로그램을 종료 하시겠습니까?",null, JOptionPane.YES_NO_OPTION);
				if(ex == JOptionPane.NO_OPTION) {
					continue;
				}else {
					JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
					System.exit(0);
				}
			}
		}
	}
}

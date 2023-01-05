package oopEx1;

import oopEx1.TerranSteamPack.SteamPack;

/*
 * 인터페이스의 강의 파일입니다.
 */
public class StarCraft2 {

	public static void main(String[] args) {
		Terran marine = new Marine("Jason","이등병",40,60);
		Terran firebet = new FireBet("불추장", "상병", 60, 80);
		Terran medic = new Medic("간호사","하사",60,0);
	
		//모든 공격 유닛에게 공격 명령울 내립니다.
		((Attackable)marine).attack("저그");
		((Attackable)firebet).attack("저그");
		
		((Moveable)marine).move(100,100);
		
		TerranSteamPack.SteamPack steamPack = new SteamPack(marine);
		TerranSteamPack.SteamPack steamPack2 = new SteamPack(firebet);
		
		steamPack.steamPack();
		steamPack2.steamPack();
		
		
		
		
		Ghost ghost = new Ghost("유령", "대위", 30, 20);
		ghost.nuclearLaunch(550,350);
		//Ghost 유닛을 만든후.. 좌표 550,350 지점에 핵폭탄 유도해 보세요.
	}
}


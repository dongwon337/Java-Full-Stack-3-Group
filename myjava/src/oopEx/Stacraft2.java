package oopEx;

//import oopEx.TerranSteamPack.SteamPack;

/*
 * 인터페이스의 강의 파일입니다.
 */
public class Stacraft2 {

	public static void main(String[] args) {
		Terran marine = new Marine("Jason"," 이등병",40,60);
		Terran fireBet = new FireBet("불추장", " 상병",50,80);
		Terran medic = new Medic("간호사"," 하사",60,0);
		
		//모든 공격 유닛에게 공격 명령을 내립니다.
		((Attackable)marine).attack("저그");
		((Attackable)fireBet).attack("저그");
		
		((Moveable)marine).move(100,100);
		
//		TerranSteamPack.SteamPack steamPack = new SteamPack(marine);
//		TerranSteamPack.SteamPack steamPack2 = new SteamPack(fireBet);
		
//		steamPack.steamPack();
//		steamPack2.steamPack();
		
		//Ghost 유닛을 만든후, 좌표 550, 350 지점에 핵폭탄을 유도해 보세요
		Ghost ghost = new Ghost("유령", "대위", 30, 20);
		ghost.nuclearLaunch(550, 350);

	}

}

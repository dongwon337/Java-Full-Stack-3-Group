package oopEx;

public class Ghost extends Terran implements GhostAblility {
	
	private String name;//마린의 이름
	private String rank;//계급
	private int hp;//피통
	private int damage;

	
	public Ghost(String name, String rank, int hp, int damage) {
		super("고스트");
		this.name = name;
		this.rank = rank;
		this.hp = hp;
		this.damage = damage;
	}

	
	public String toString() {
		return super.toString() + " 이름은 " + this.name + " 계급은" + this.rank + " HP :" + this.hp
				+ " 공격력 : " + this.damage;
	}
	
	
	public void move(int x, int y) {
		System.out.println(this.name + " 이 " + "[" + x + "," + y +"]로 이동했습니다.");
	}
	
	
	public void getHealing(int hp) throws InterruptedException {
		while(true) {
			if(this.hp == 40) {
				return;
			}
			Thread.sleep(1000);
			this.hp += hp;
			System.out.println(this.name + this.rank + " 이 치료를 받고 있습니다.");
			System.out.println("+" + hp + " 증가");
		}
	}
	
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Theres no one here.");
	}

	public void attack(String target) {
		
	}


	@Override
	public void nuclearLaunch(int x, int y) {
		System.out.println("핵폭탄 발사됨..좌표는 [" + x + "," + y + "]");
		
	}

//	@Override
//	public void nuclearLaunch(int x, int y) {
//		System.out.println("핵폭탄 발사됨..좌표는 [" + x + "," + y + "]");
		
	}


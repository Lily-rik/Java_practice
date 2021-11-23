package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter12_Wizard extends Chapter12_Character {
	
	int mp;
	
	public void run() {
		System.out.println("魔法使いは魔法を使いながら逃げた！");
	}
	
	public void attack(Chapter08_Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
	
	public void fireball(Chapter08_Matango m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
}

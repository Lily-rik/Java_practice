package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter12_Thief extends Chapter12_Character {
	
	public void attack(Chapter12_Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に5ポイントのダメージ");
		m.hp -= 5;
	}


}

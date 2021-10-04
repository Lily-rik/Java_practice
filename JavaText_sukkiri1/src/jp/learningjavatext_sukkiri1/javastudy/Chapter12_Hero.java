package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter12_Hero extends Chapter12_Character {
	
	public void attack(Chapter12_Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージ");
		m.hp -= 10;
	}
	
	// 上記(従来)の書き方だと、ゴブリンやスライムなど、モンスターごとに記述が必要になる
	// 多態性を用いることで、モンスターとしてのキャラを一括りにし、一括で処理が可能になる
	public void attack(Chapter12_Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージを与えた！");
		m.hp -= 10;
	}
	

	

}

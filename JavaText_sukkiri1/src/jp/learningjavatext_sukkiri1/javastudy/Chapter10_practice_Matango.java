package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter10_practice_Matango {
	// フィールド
	int hp = 50;
	char suffix;
	
	// コンストラクタ
	public Chapter10_practice_Matango(char suffix) {
		this.suffix = suffix;
	}
	
	// 攻撃
	public void attack (Chapter10_practice_Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}

}

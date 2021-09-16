package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter10_practice_PoisonMatango extends Chapter10_practice_Matango {
	// フィールド
	int poisonCount = 5;	// 仕様書には初期値5のint型フィールドを持っていると書かれているため、
												// フィールドとして記載しなければならない
	
	// コンストラクタ
//	自分の回答
//	public Chapter10_practice_PoisonMatango() {
//		super(char suffix);
//	}
//	解答
	public Chapter10_practice_PoisonMatango(char suffix) {	// 引数はメソッドに渡されるためこの()内に受け取りの型と変数をかく
	super(suffix);	// 渡された変数をsuper(親クラス)のコンストラクタの引数として使用する
	}
	
	
	// 毒攻撃
//	自分の回答
//	public void poisonAttack(Chapter10_practice_Hero h) {
//		int count = 5;
//		super.attack(h);
//		while (count != 0) {
//			System.out.println("さらに毒の胞子をばらまいた！");
//			int damage = h.hp / 5;
//			h.hp -= damage;
//			System.out.println(damage + "ポイントのダメージ！");
//			count --;
//		}
//	}
//	解答
	public void attack(Chapter10_practice_Hero h) {		// 親クラスのattackメソッドに技を追加したいので、オーバーライドする
																										// そのため、メソッド名は親クラスと同じattackにする
		super.attack(h);
		while (this.poisonCount != 0) {		// クラス内のフィールドを使用する際は前にthisをつけ忘れないように注意！！
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ！");
			this.poisonCount --;
		}
	}

}

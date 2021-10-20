package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter09_Hero {
	
	String name;
	int hp;
	Chapter09_Sword sword;		// 勇者が装備している剣の情報
														// あるクラスが別のクラスをフィールドとして利用している関係をhas-aの関係という
														// Hero has-a Sword(勇者は剣を持っている)
	
	
	public void attack() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
	
	// コンストラクタ
	// コンストラクタはnewされた直後に自動で実行される処理
	// コンストラクタはJVMが呼び出すものであり、私たちは呼び出せない(h.Hero();はできない！)
		// コンストラクタの条件
		// ① メソッド名がクラス名と完全に等しい
		// ② メソッド宣言に戻り値が記述されていない(voidもダメ)
	public Chapter09_Hero(String name) {		// 引数として文字列を1つ受け取る
		this.hp = 100;		// hpフィールドを100で初期化
		this.name = name;
	}
	
	// コンストラクタもオーバーロードすることができる
//	public Chapter09_Hero() {
//		this.hp = 100;
//		this.name = "ダミー";
//	}
	
	// コンストラクタのオーバーロードに別のコンストラクタを使用する方法
	public Chapter09_Hero() {
		this("ダミー");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter10_Hero {
	
	String name = "ミナト";
	int hp = 100;
	
	// コンストラクタ
	public Chapter10_Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	
	// 戦う
	public void attack(Chapter08_Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	
	// 転ぶ
	public final void slip() {		// メソッドにfinalが付くと子クラスでオーバーライドできなくなる
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}

}

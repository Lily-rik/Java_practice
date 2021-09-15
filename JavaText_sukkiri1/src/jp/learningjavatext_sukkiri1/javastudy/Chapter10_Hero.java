package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter10_Hero {
	String name = "ミナト";
	int hp = 100;
	
	// 戦う
	public void attack (Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
		}
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	
	// 眠る
	public final void slip() {	// finalが付いているメソッドはオーバーライドできないため、子クラスで上書きできない！
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
			

}

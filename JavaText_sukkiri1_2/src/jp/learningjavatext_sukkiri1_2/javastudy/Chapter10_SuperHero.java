package jp.learningjavatext_sukkiri1_2.javastudy;

//	継承によるクラスの作成
public class Chapter10_SuperHero extends Chapter10_Hero {		// extendsを用いることでHeroクラスを継承することができる
																														// 基本的にはHeroと同じ
	
//	Heroクラスからコピペで引き継いだコード
//	問題①：追加・修正に時間がかかる→元のコードを修正した際、継承したコードも全て修正が必要になる
//	問題②：把握や管理が難しくなる→コードの大半が重複するためプログラム全体の見通しが悪くなる
	
//	String name = "ミナト";
//	int hp = 100;
//	boolean flying;
//	
//	// 戦う
//	public void attack(Matango m) {
//		System.out.println(this.name + "の攻撃！");
//		m.hp -= 5;
//		System.out.println("5ポイントのダメージをあたえた！");
//	}
//	
//	// 逃げる
//	public void run() {
//		System.out.println(this.name + "は逃げ出した！");
//	}
//	
//	// 飛ぶ
//	public void fly() {
//		this.flying = true;
//		System.out.println("飛び上がった！");
//	}
//	
//	// 着地する
//	public void land() {
//		this.flying = false;
//		System.out.println("着地した！");
//	}
	
	
//	継承してきたクラスから追加する部分だけを記述する
	boolean flying;
	
	// 飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	// 着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	
	// SuperHeroクラスにrun()を再定義する
	public void run() {		// 子クラスで上書きする = オーバーライド
		System.out.println(this.name + "は撤退した");
	}
	
	// attack()をオーバーライドしたSuperHero
	public void attack(Chapter08_Matango m) {
//		System.out.println(this.name + "の攻撃！");
//		System.out.println("5ポイントのダメージをあたえた！");
//		if (this.flying) {
//			System.out.println(this.name + "の攻撃！");
//			m.hp -= 5;
//			System.out.println("5ポイントのダメージをあたえた！");
//		}
		
//		上記の記述では、将来Heroクラスのattackメソッドに変更があった際適応できない
//		そのため、attackの基本的な二葉は変わらず、そこから追加・変更したい時の場合は、親クラスのメソッドを呼び出す
		super.attack(m);				// superとは、今より1つ内側のインスタンス部分を表す予約語である
		if (this.flying) {
			super.attack(m);
		}
	}
	
	public Chapter10_SuperHero() {
		super();		// 全てのコンストラクタは、その先頭で必ず内部インスタンス部分(親クラス)のコンストラクタを呼び出さ舐めればならない
								// 同じクラスの別コンストラクタを呼び出す場合はthis(引数)、親クラスのコンストラクタを呼び出す場合はsuper(引数)
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	
}

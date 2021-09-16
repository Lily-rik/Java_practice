package jp.learningjavatext_sukkiri1.javastudy;

// 継承を用いたクラスの定義
// フィールドはオーバーライドしない！
public class Chapter10_SuperHero extends Chapter10_Hero {		// HeroクラスをベースにしてSuperHeroクラスを定義するので、
	boolean flying;																						// Heroと同じメンバの定義は省略する(違いだけを記述する)
	
	
	// コンストラクタ
	public Chapter10_SuperHero () {
		// 全てのコンストラクタは、その先頭で必ず内部インスタンス部分(親)のコンストラクタを呼び出さなければならないというルールがある
		// super ();		// 子のコンストラクタで呼び出していない場合、自動で左のコードが挿入される(親のコンストラクタが呼び出される)
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	
	// 飛ぶ
	public void fly () {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	// 着地
	public void land () {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	//　逃げる(オーバーライド)
	public void run () {	// 親クラスにも定義してあるが、子クラスで再定義する(オーバーライド=上書き)
		System.out.println(this.name + "は撤退した！");
	}
	
	// 戦う(オーバーライド)
	public void attack (Chapter10_Matango m) {
		super.attack(m);		// superは１つ内側のインスタンス部分を表す予約語
		if (this.flying) {
			super.attack(m);
		}
	}

}

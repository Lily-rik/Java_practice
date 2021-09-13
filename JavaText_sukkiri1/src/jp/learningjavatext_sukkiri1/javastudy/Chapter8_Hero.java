package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter8_Hero {
	// フィールドとメソッドは総称してメンバ(member)と呼ばれている
	
	// 属性
	// クラスブロック内に宣言された変数を、Javaではフィールドという
	String name;	// 名前の宣言
	int hp;		// HPの宣言
	
	// 操作
	// 操作を定義するためにはメソッドを使用する
	
	// 眠る
	public void sleep() {		// オブジェクト指向に基づいて作成するメソッドには、通常はstaticはつけない(理由は14章で説明あり)
		this.hp = 100;	// thisは自分自身のインスタンスを意味する
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	// 座る
	public void sit(int sec) {	// 何秒座るか引数で受ける
		this.hp += sec;		// 座る秒数だけHPを増やす
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	
	// 転ぶ
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
	
	
	
	
	
	
	
}

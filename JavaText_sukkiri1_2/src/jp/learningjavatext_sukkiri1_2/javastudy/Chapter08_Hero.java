package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter08_Hero {
	/* 属性 */
	String name;		// クラスブロック内に宣言された変数をフィールドという
	int hp;
	
	/* 操作 */
	public void attack(){
		
	}
	// 眠るメソッド
	public void sleep() {
		this.hp += 100;		// 自分自身のインスタンスのhpフィールド
		System.out.println(this.name + "は、眠って回復した！");		// 自分自身のインスタンスのnameフィールド
	}
	// 座るメソッド
	public void sit(int sec) {		// 何秒座るか引数で受け取る
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	// 転ぶメソッド
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！"); 
		System.out.println("5のダメージ！");
	}
	// 逃げるメソッド
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
}

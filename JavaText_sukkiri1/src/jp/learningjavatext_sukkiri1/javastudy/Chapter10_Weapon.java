package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter10_Weapon extends Chapter10_Item {
	
	public Chapter10_Weapon() {
		super("ななしの剣", 300);	// 内部インスタンスの初期化を行うコンストラクタ(Item)に引数を与える必要がある場合は、
												// super()の呼び出しに明示的に引数を渡す必要がある(渡さないとエラーになる)
	}
	

}

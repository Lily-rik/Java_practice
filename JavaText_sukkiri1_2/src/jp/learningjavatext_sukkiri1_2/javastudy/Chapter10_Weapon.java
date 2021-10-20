package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter10_Weapon extends Chapter10_Item {
	
	public Chapter10_Weapon() {
		super("ななしの剣");		// 親コンストラクタに引数がある場合は、明示的に引数を渡さなければならない
													// 何も記述しないと、super();がデフォルトで呼び出されるが、引数がないためエラーとなる
	}

}

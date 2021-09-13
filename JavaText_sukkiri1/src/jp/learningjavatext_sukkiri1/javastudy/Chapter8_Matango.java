package jp.learningjavatext_sukkiri1.javastudy;

class Chapter8_Matango {
	// フィールド
	int hp;
	final int LEVEL = 10;		// フィールドの宣言と同時に初期値を設定することもできる
													// finalをつけると定数フィールドになり、値を書き換えられなくなる
													// 定数フィールドの名前は大文字で記述が推奨されている
	char suffix;
	
	// メソッド
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	

}

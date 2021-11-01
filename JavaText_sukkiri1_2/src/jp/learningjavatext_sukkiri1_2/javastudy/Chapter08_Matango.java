package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter08_Matango {
	
	String name;
	int hp;
	final int LEVEL = 10;		// フィールドの初期値を設定することもできる
													// finalをつけると定数フィールドとなり、値を書き換えることはできなくなる
													// 変数名は分かりやすいように大文字で記載する
	char suffix;
	
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}

}

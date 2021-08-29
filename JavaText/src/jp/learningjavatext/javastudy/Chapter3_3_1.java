package jp.learningjavatext.javastudy;

class Chapter3_3_1 {
	public static void main(String[] args) {
		// printメソッドは表示の際改行されなくなる
		System.out.print("Good morning.");
		System.out.print("Good afternoon.");
		System.out.print("Good evening.");
		
		// \n＝改行を表す
		System.out.print("Good morning.\n");
		System.out.print("Good afternoon.\n");
		System.out.print("Good evening.\n");
		
		// 特別の意味を持つ文字をエスケープシーケンスという
		System.out.print("Good\n morning.\n");
		System.out.print("Good\t afternoon.\n");
		System.out.print("Good\" evening.\n");		
		
	}
}

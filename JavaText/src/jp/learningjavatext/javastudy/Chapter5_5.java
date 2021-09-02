package jp.learningjavatext.javastudy;

class Chapter5_5 {
	public static void main (String[] args) {
		// 文字型変数
		// 文字を扱う変数は、charという型を指定して宣言する
		// 初期化を行う場合には文字を''で囲む必要がある
		
		char moji_H, moji_E, moji_L, moji_O;
		
		moji_H = 'H';
		moji_E = 'E';
		moji_L = 'L';
		moji_O = 'O';
		
		System.out.print(moji_H);
		System.out.print(moji_E);
		System.out.print(moji_L);
		System.out.print(moji_L);		
		System.out.println(moji_O);
		
		// Javaでは文字を扱う型はcharのみである
		// 文字列を扱う際はStringクラスを使用する
		
		// 型の格納は「変数」
		// クラスの格納は「オブジェクト」 = 変数がもっと便利になったもの
		
		String message1 = "Good ";  // クラスのオブジェクト宣言の際は、=で文字列を代入している点に注意！
		String message2 = "morning.";
		String message3 = "afternoon.";
		String message4 = "evening.";
		String message;
		
		System.out.println(message1 + message2);
		System.out.println(message1 + message3);
		System.out.println(message1 + message4);
		
		message = message1 + message2;
		System.out.print(message);
		System.out.println(message.length());  // lengthメソッドは文字の長さを調べることができる
																					 // 空白も一字として数えられる
		message = message1 + message3;  // 38行目で代入された値は上書きされる
		System.out.print(message);
		System.out.println(message.length());
		
		message = message1 + message4;
		System.out.print(message);
		System.out.println(message.length());
	}

}

package jp.learningjavatext.javastudy;

class Chapter5_1 {
	public static void main(String[] args) {
		System.out.println(1 + 2);
		System.out.println(1 + 2 + 3);
		System.out.println(1 + 2 + 3 + 4);
		System.out.println(1 + 2 + 3 + 4 + 5);
		
		int x;  // 変数宣言
		        // int = integer 予約語
		        // 「これから整数を扱うxという変数をプログラミング中で使います」と宣言している
		
		x = 1 + 2; // 代入　初めて変数に値を代入することを初期化と呼ぶ
		System.out.println(x);
		x = x + 3;
		System.out.println(x);
		x = x + 4;
		System.out.println(x);
		x = x + 5;
		System.out.println(x);
	}

}

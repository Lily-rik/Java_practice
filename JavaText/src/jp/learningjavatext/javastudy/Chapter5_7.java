package jp.learningjavatext.javastudy;

class Chapter5_7 {
	public static void main(String[] args) {
		// 型推論による変数宣言
		// 変数宣言と同時に初期化をすれば、初期化に用いる値がどんな型なのかを判断することができる
		// =　型推論という
		
		
		
		var x = 123;  // varを使用して変数を宣言すると、その変数は初期化する値に適した型で宣言したことと同じになる
		// int x = 123; として宣言したのと同じ意味になる
		var y = 4.56; // varは複数の変数を宣言することはできないため、同じ型であってもひとつひとつ宣言が必要になる
		var z = "Hello.";
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}

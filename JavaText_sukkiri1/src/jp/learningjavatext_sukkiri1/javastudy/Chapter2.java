package jp.learningjavatext_sukkiri1.javastudy;

class Chapter2 {
	public static void main (String[] args) {
		// 2.1
		int a;
		int b;
		
		a = 20;
		b = a + 5;  // a,b,5はオペランド、 +,=は演算子という
								// 5や"Hello World!"などの具体的な値をリテラルとよび、リテラルはデータ型を持っている 
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		
		// 2.2
		System.out.println("私の好きな記号は二重引用符（\"）です。");  // eclipseではエスケープシーケンス(¥)は使用できない、、？
		System.out.println();
		
		
		// 2.4
		int c;
		c = 100;
		c++;  // インクリメント演算子、数を1つ増やす c = c + 1やc += 1と同じ
					// １つしかオペランドを持たない演算子は単項演算子という
		System.out.println(c);
		
		int d = 10;
		int e = 10;
		//  ++や--の位置で計算結果が異なってくるため、使用時は要注意！
		System.out.println(++d + 50);  // 1増えてから50が足される = 61
		System.out.println(e++ + 50);  // 50が足された後に1増える = 60
		System.out.println();
		
		
		// 2.5
		// 代入時の自動型変換
		// Javaの数値型は大小関係が定められており、大に小は代入できる（型が自動的に変換される）
		float f = 3;  // float型の変数にintを代入 = 3はfloat型に自動変換されている
		double db = f;  // double型の変数にfloat型を代入 = f(3)はdouble型に自動変換されている
		// そのため結果はどちらも3.0で小数点になる
		System.out.println(f);
		System.out.println(db);
		System.out.println();
		
		// 強制的な型変換
		int age = (int)3.2;  // (int) = キャスト演算子　強制的な型変換を指示する
		System.out.println(age);
		System.out.println();
		
		// 演算時の自動型変換
		double dbl = 8.5 / 2;  // 2(int型)を、2.0(double型)に変換している
		long l = 5 + 2L;  // 5(int型)を、5L(long型)に変換している
		
		System.out.println(dbl);
		System.out.println(l);
		System.out.println();	
		
		// 文字列を含む演算時の型変換
		String msg = "私の年齢は" + 23;  // 23(int型)が、"23"(String型)に変換されて連結される
		System.out.println(msg);
		System.out.println();
		
		
		// 2.6
		// 命令実行の文（画面に文字を表示する）
		String name = "すがわら";
		String message;
		message = name + "さん、こんにちは";
		System.out.println(message);	// ()内には引数やパラメータを記述する			
		System.out.println();
		
	  // 改行なし画面出力の命令
		System.out.print("私の名前は");
		System.out.print(name);
		System.out.print("です");
		System.out.println();
		System.out.println();
		
		// 大きい方の数値を代入する命令
		int g = 5;
		int h = 3;
		int m = Math.max(g, h);
		
		System.out.println("比較実験：" + g + "と" + h + "とで大きいほうは・・・ " + m);
		System.out.println();
		
		// String型をint型に変換する命令
		String age2 = "31";
		int n = Integer.parseInt(age2);  // 整数として読むことができる文字列が入った変数orリテラルを指定するとint型に変換する
		System.out.println("あなたは来年"+ (n + 1) + "歳になりますね。");
		System.out.println();
		
		// ランダムな数を生成する命令
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		System.out.println();
		
		// キーボードから入力を受け付ける命令
		System.out.println("あなたの名前を入力してください。");
		String name2 = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age3 = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("ようこそ、"+ age3 + "歳の" + name2 + "さん");
		System.out.println();
		
	}

}
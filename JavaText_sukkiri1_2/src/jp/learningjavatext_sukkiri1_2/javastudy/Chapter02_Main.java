package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter02_Main {

	public static void main(String[] args) {
		
		// 変数宣言の文と計算の文
		int a;
		int b;
		a = 20;
		b = a + 5;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		
		// エスケープシーケンス
//		System.out.println("私の好きな記号は二重引用符(")です");		// この記述ではコンパイルエラーになる
		System.out.println("私の好きな記号は二重引用符(\")です");		// エスケープシーケンスを用いることで
																													// 画面に出す文字であることを機械に伝えることができる
		System.out.println();
		
		
		// インクリメント演算子
		int c;
		c = 100;
		c++;		// cの内容が1増える
		System.out.println(c);
		System.out.println();
		
		// インクリメント・デクリメント演算子の注意事項
		int d = 10;
		int e = 10;
		
		System.out.println(++d + 50);		// 変数dの値が1増える→それに50加えたものが表示される = {(10+1)+50}=61
		System.out.println(e++ + 50);		// 変数eに50加えたものが表示される→その後変数eの値が1増える = 10+50 = 60, その後e=11になる
		System.out.println();
		// 上記のように他の演算子と併用するとバグの原因となるため、これらはなるべく単独で使用するようにする
		
		
		// 値より大きな型の変数に代入
		float f = 3;		// float型の変数にint型を代入(int型3は自動的にfloat型3.0Fに変換される)
		double db = f;	// double型の変数にfloat型を代入
		System.out.println(f);
		System.out.println(db);
		System.out.println();
		
		// データより小さな型の変数に代入
//		int i = 3.2;		// 箱に入りきらない可能性があるためコンパイルエラーになる
		
		// 強制的な型変換
		int age = (int)3.2;		// キャスト演算子
		System.out.println(age);
		System.out.println();		// 結果は3、強制的に数値を入れるため精度は落ちる
		
		// 異なる型同士の算術演算
		double dbl = 8.5 / 2;		// 2(int型)を2.0(double型)に変換
		long l = 5 + 2L;		// 5(int型)を5L(long型)に変換
		System.out.println(dbl);
		System.out.println(l);
		System.out.println();
		
		// 文字列の連結
		String msg = "私の年齢は" + 23;		// 23(int型)が"23"(String型)に変換されて連結される
		System.out.println(msg);
		System.out.println();
		
		
		// 命令実行の文(画面に表示する)
		String name = "すがわら";
		String message;
		message = name + "さん、こんにちは";
		System.out.println(message);
		System.out.println();
		
		// 改行なし画面出力の命令
		String name2 = "すがわら";
		System.out.print("私の名前は");
		System.out.print(name2);
		System.out.println("です");
		System.out.println();
		
		// 大きい方の数値を代入する命令
		int g = 5;
		int h = 3;
		int m = Math.max(g, h);
		System.out.println("比較実験：" + g + "と" + h + "とで大きい方は・・・" + m);
		System.out.println();
		
		// String型をint型に変換する命令
		String age2 = "31";
		int n = Integer.parseInt(age2);		// 数字に変換できない文字列は代入するとコンパイルエラーになる
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
		System.out.println();
		
		// ランダムな数を生成する命令
		int r = new java.util.Random().nextInt(90);		// 0から指定した数までの数がランダムに表示される
																									// (この場合90は含まれず、0~89までの値がランダムに表示される)
		System.out.println("あなたはたぶん・・・" + r + "歳ですね？");		// 実行するたびに数字は変わる
		System.out.println();
		
		// キーボードから入力を受け付ける命令
		System.out.println("あなたの名前を入力してください。");
		String name3 = new java.util.Scanner(System.in).nextLine();		// nextLine()は文字列の入力
		System.out.println("あなたの年齢を入力してください。");
		int age3 = new java.util.Scanner(System.in).nextInt();				// nextInt()は数値の入力
		System.out.println("ようこそ、" + age3 + "歳の" + name3 + "さん");
		System.out.println();

	}

}

package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter03_Main {

	public static void main(String[] args) {
		
		// 天候による行動の変化をJavaで表す：if文
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");
		}
		System.out.println();
		
		// トイレの空きを待つ繰り返し処理：while文
		boolean doorClose = false;
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
		
		// 波カッコを省略した記述
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else 																// ブロック内が1行のみであれば{}は省略可能
			System.out.println("DVDを見ます");		// ただし、プログラミングのミスを防ぐため非推奨
		System.out.println();

		// 冗長でスッキリしないソースコード
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;
		if (fortune == 1) {
			System.out.println("大吉");
		} else if (fortune == 2) {
			System.out.println("中吉");
		} else if (fortune == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}
		System.out.println();
		
		// Switch文のサンプルコード
		switch(fortune) {
			case 1:
				System.out.println("大吉");
				break;
			case 2:
				System.out.println("中吉");
				break;
			case 3:
				System.out.println("吉");
				break;
			default:
				System.out.println("凶");
		}
		System.out.println();
		
		// break文を忘れると・・・
		switch(fortune) {
			case 1:
				System.out.println("大吉");		// 当てはまるcase以降全ての処理が実行される
			case 2:													// Switch文は条件に一致するcaseラベルまで処理をジャンプさせる命令であるため、
				System.out.println("中吉");		// それ以降の処理は順次に実行されてしまう
			case 3:													// そのためbreak文で明示的に処理を中断する必要があるため注意！
				System.out.println("吉");
			default:
				System.out.println("凶");
		}
		System.out.println();
		
		// あえてbreak文を書かない
		System.out.println("あなたの運勢を占います");
		int fortune2 = new java.util.Random().nextInt(5) + 1;
		switch (fortune2) {
			case 1:		// break文がない場合は順次に処理が進むため、
			case 2:		// この記述であれば、fortune2が1or2なら、、という条件式になる
				System.out.println("いいね！");
				break;
			case 3:
				System.out.println("普通です");
				break;
			case 4:
			case 5:
				System.out.println("う〜ん・・・");
		}
		System.out.println();
		
		// 基本的なfor文
		for (int i = 0; i < 10; i++) {
			System.out.println("こんにちは");
		}
		System.out.println();
		
		// for文のループ変数iの内容を表示する
		for (int i = 0; i < 3; i++) {
			System.out.print("現在" + (i + 1) + "周目→");		// ループ変数もブロック内では普通の変数として利用できる
		}
		System.out.println();
		System.out.println();
		
//		// 複雑なfor文
//		// ループ変数を1からスタートする
//		for (int i = 1; i < 10; i++) {
//		}
//		
//		// ループ変数を2ずつ増やす
//		for (int i = 0; i < 10; i += 2) {
//		}
//		
//		// ループ変数を10から1ずつ1まで減らしていく
//		for (int i = 10; i > 0; i--) {
//		}
//				
//		// ループ変数を初期化しない
//		int i = 0;
//		for (; i < 10; i++) {
//		}		
//		
//		// 繰り返し時の処理を行わない
//		for (int i = 0; i < 10;) {
//		}
	
		
		// for文のループを2重にして九九の表を出力する
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}

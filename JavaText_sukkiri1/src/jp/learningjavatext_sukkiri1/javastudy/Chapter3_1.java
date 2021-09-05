package jp.learningjavatext_sukkiri1.javastudy;

class Chapter3_1 {

	public static void main(String[] args) {
		// 3.1
		// if文：分岐
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");
		}
		System.out.println();
		
		// switch文：繰り返し
		boolean doorClose = false;
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
		System.out.println();
		

		// 3.4
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;  // 1~4の乱数が発生する
		if (fortune == 1) {
			System.out.println("大吉");
		} else if (fortune == 2) {
			System.out.println("中吉");
		} else if (fortune == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}
		
		// 上記のように同じ変数に対して繰り返し比較を行っている場合、
		// switch文に置き換えることでコードをスッキリさせることができる場合がある
		switch(fortune) {
			case 1:
				System.out.println("大吉");
				break;  											// breakを書き忘れないように注意！
			case 2:													// switch文は条件に一致するcaseラベルまで処理をジャンプさせる命令のため、
				System.out.println("中吉");		// breakで明示的に処理を中断しswitch文を抜けないと順次に処理が進んでしまう
				break;												// if文のように条件が合ったところだけのブロックが処理されるわけではないことに注意！
			case 3:													
				System.out.println("吉");
				break;
			default:
				System.out.println("凶");
		}
		System.out.println();
		
		// switch文のcaseラベルの特徴を活かしたプログラム
		System.out.println("あなたの運勢を占います");
		
		int fortune2 = new java.util.Random().nextInt(5) + 1;
		
		switch(fortune2) {
			case 1:  // breakまでは順次に処理が行われるため、case1のときもcase2の処理が行われる
			case 2:  // その結果fortuneが1or2なら、、という条件分岐ができる
				System.out.println("いいね！");
				break;
			case 3:  // fortuneが3なら、、
				System.out.println("普通です");
				break;
			case 4:  // fortuneが4or5なら、、
			case 5:
				System.out.println("う〜ん…");
		}
		System.out.println();
	}

}

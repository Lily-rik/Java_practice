package jp.learningjavatext.javastudy;

class Chapter5_2_4_5 {
	public static void main(String[] args) {
		int sum = 1 + 2;  // 変数宣言と同時に初期化を行うこともできる 
		
		// キャスト = 指定した型に値を変換する方法
		int x;
		
		x = (int)1.0 / (int)2.0;  // 整数に変換してから割り算している
		System.out.println(x);
		
		x = (int)(1.0 / 2.0);  // 実数で割り算してから整数に変換している
		System.out.println(+ x);
		
		// 整数から実数に変更しても精度が失われる可能性はないためキャストによる意思表示は不要
		// 精度が失われる変換を「ナローイング変換」、
		// 精度が失われない変換を「ワイドニング変換」という
		
		// また、関連のない型同士でキャストを行うことはできない
		// ex) int x;
		//     x = (int) "Hello!"
		// 上記は変換できない
		// 'A'は文字コードという数値を扱うため変換可能である
	}

}

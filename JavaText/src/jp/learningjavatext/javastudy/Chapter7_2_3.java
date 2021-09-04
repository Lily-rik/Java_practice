package jp.learningjavatext.javastudy;

class Chapter7_2_3 {

	public static void main(String[] args) {
		// インクリメント演算子
		
		int i;
		
		for(i = 0; i < 5; i = i + 1) {
			System.out.println("Hello!");
		}
		
		for(i = 0; i < 5; i++) {
			System.out.println("Hello!");
		}
		
		// 上記ふたつの記述は同じ結果になる
		// ++はインクリメント演算子と呼び、変数の値を1増加させる
		// i++は前置インクリメント、++iは後置インクリメントと呼ぶ
		
		// 前置インクリメントと後置インクリメントの違い
		int p, j;
		
		p = 0;
		System.out.println("p++ = " + p++);  // iを使用した後に1増やすため結果は0となる
		System.out.println("p = " + p);
		
		j = 0;
		System.out.println("++j = " + ++j);  // 1増やした後にiを使用するため結果は1となる
		System.out.println("j = " + j);
		
		
		// 変数の値を1減らす演算子も存在する　デクリメント演算子[--i, i--]
		// インクリメント・デクリメント演算子を使用したプログラム
		
		int q, r;
		
		q = 0;
		System.out.println("q++ = " + q++);
		System.out.println("q = " + q);
		System.out.println("q-- = " + q--);
		System.out.println("q = " + q);
		
		r = 0;
		System.out.println("++r = " + ++r);
		System.out.println("r = " + r);
		System.out.println("--r = " + --r);
		System.out.println("r = " + r);

	}

}

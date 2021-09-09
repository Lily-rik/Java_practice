package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter3_2 {

	public static void main(String[] args) {
		// 3.5
		// for文：回数指定の繰り返し処理
		for (int i = 0; i < 10; i++) {
			System.out.println("こんにちは");
		}
		System.out.println();
		
		for (int t = 0; t< 3; t++) {
			System.out.print("現在" + (t + 1) + "週目→");  // ブロック内であればforで定義した変数は使用できる
		}
		System.out.println();
		System.out.println();
		
		// ループ変数を1からスタートする
//		for (int a = 1; a < 10; a++) {
//		}
		
		// ループ変数を2ずつ増やす
//		for (int b = 0; b < 10; b += 2) {
//		}
		
		// ループ変数を10からひとつずつ1まで減らしていく
//		for (int c = 10; c > 0; c--) {
//		}
		
		// ループ処理を初期化しない
//		int d = 1;
//		for (; d < 10; d++) {
//		}
		
		// 繰り返し時の処理を行わない
//		for (int e = 0; e <10;) {
//		}
		
		
		// 3.6
		// 九九の表示
		for (int p = 1; p < 10; p++) {  // 入れ子で9回ループした後戻ってきて1プラスされる
			for (int q = 1; q < 10; q++) {
				System.out.print(p * q);  // p=1の時、pは1のまま、qは1~9まで繰り返され掛け算される
				System.out.print(" ");  // 空白を出力
			}
			System.out.println();  // 改行を出力
		}

		
		
		
		
		

	}

}

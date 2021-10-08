package jp.learningjavatext_sukkiri1.javastudy;

import java.io.IOException;

public class Chapter17_Practice_Main {

	public static void main(String[] args) throws IOException {			// 17.4
		
//	17.1
//		String s = null;
//		System.out.println(s.length());
		
		
//	17.2
//		try {
//			String s = null;
//			System.out.println(s.length());
//		} catch(Exception e) {
//			System.out.println("NullPointerException例外をcatchしました");
//			System.out.println("--スタックトレース(ここから)--");
//			e.printStackTrace();
//			System.out.println("--スタックトレース(ここまで)--");
//		}
		
		
//	17.3
//	自分の回答
//		public int parseInt(String num) {
//			int i = num;
//		}
		
//	解答
//		try {
//			int i = Integer.parseInt("三");		// Integer.parseIntは、文字列の引数を符号付き10進数の整数型として構文解析する
//		} catch(NumberFormatException e) {
//			System.out.println("NumberFormatException例外をcatchしました");		// 送出される例外
//		}
	
//	17.4
//	解答
//	①import宣言でIOException例外を使用できるようにする
//	②Mainメソッドが問題を解決できないようにする = 問題を先送りにする = mainメソッドに例外処理をスルーするように宣言
		System.out.println("プログラムが起動しました");
		throw new IOException();		// 例外処理を発生させる
		
	}

}

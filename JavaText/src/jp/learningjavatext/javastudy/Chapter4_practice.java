package jp.learningjavatext.javastudy;

class Chapter4_practice {
	// 1. ① 足し算、引き算よりも掛け算、割り算が優先され、さらに()が優先される
	
	// 2.
	//	public static void main(String[] args) {
	//		System.out.print("123 + 456 = ");
	//		System.out.println(123+456);
	//		
	//		System.out.print("789 - 123 + Goodmorning = ");
	//		System.out.println(789-123+"Goodmorning");
	//		
	//		System.out.print("123 * 456 + Good morning = ");
	//		System.out.println(123*456+"Good"+' '+"morning");　’’を間に入れることによって半角スペースを作り出している
	//	}
	
	// 3.
	//	public static void main(String[] args) {
	//		System.out.print("1 / 5 + 1 / 5 + 1 / 5 = ");
	//		System.out.println(1/5+1/5+1/5);　整数の計算
	//		
	//		System.out.print("1 / 5 + 1 / 5 + 1 / 5 = ");
	//		System.out.println(1./5+1./5+1./5);　実数の計算
	//	}
	
	// 4.
	//	public static void main(String[] args) {
	//		System.out.println("'B' + 1 = " + ('B'+1)); まず('B'+1)が計算され、数値で67(66+1)となる
	//		System.out.println("'B' + 1 = " + 'B' + 1); まず"'B' + 1 = " + 'B'が計算され、"B + 1 = + B"の文字列となる
	//	}
	
	// 5.
	//	public static void main(String[] args) {
	//		System.out.println(456 + "÷" + 123 + "=" + (456/123)); 割り算は/
	//		System.out.println(456 + "%" + 123 + "=" + (456%123)); 余りは%
	//	}	
	
	// 6.
	//	public static void main(String[] args) {
	//		System.out.println(456 + "÷" + 123 + "=" + (456/123)); 問題6は計算ではなく文字列の足し算となる
	//																													 よって文字'÷'ではなく文字列"÷"を使用し文字列の足し算にする
	//	}			
}

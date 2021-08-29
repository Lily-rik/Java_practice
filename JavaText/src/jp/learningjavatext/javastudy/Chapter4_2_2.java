package jp.learningjavatext.javastudy;

class Chapter4_2_2 {
	public static void main(String[] args) {
		// 四則演算の優先順位
		// 足し算や引き算よりも、掛け算、割り算の方が優先される
		// 足し算と引き算、掛け算と割り算の優先順位は同じで先に記述された方から計算される
		// ()で囲まれたものが最も優先順位が高くなる
		
		System.out.print("1 + 2 * 3 = ");
		System.out.println(1+2*3);
		
		System.out.print("1 + 2 * 3 + 4 = ");
		System.out.println(1+2*3+4);
		
		System.out.print("1 - 2 * 3 - 4 = ");
		System.out.println(1-2*3-4);
		
		System.out.print("(1 + 2) * 3 + 4 = ");
		System.out.println((1+2)*3+4);
		
		System.out.print("1 + 2 * (3 + 4) = ");
		System.out.println(1+2*(3+4));
	}

}

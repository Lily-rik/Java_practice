package jp.learningjavatext.javastudy;

class Chapter5_2_1_2_3 {
	public static void main(String[] args) {
		int x, y;  // 変数名は一度に複数宣言することもできる
		x = 1;
		y = 2;
		System.out.println("x = " + x);
		System.out.println("Y = " + y);
		
		int sum;
		sum = x + y;
		System.out.println("sum = " + sum);
		
		
		// 変数名は英字以外の文字でも使用できる
		int えっくす, わい;
		えっくす = 1;
		わい = 2;
		System.out.println("x = " + えっくす);
		System.out.println("Y = " + わい);
		
		int さむ;
		さむ = えっくす + わい;
		System.out.println("sum = " + さむ);
		
		
	}
}

package jp.learningjavatext.javastudy;

class Chapter5_2_6 {
	public static void main(String[] args) {
		// 値の入れ替え
		
		int a, b;
		
		a = 123;
		b = 456;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);		
		
		
		a = 123;
		b = 456;
		
		a = b;  // aは456の値に上書きされる 
		b = a;  // bには上書きされたa=456が代入されるため、結果はは123ではなく456となる
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		
		a = 123;
		b = 456;
		
		int tmp;  // 一時的にaの値を預かる変数を設定する
		tmp = a;
		
		a = b;
		b = tmp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);		
		
	}

}

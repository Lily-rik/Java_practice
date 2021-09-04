package jp.learningjavatext.javastudy;

class Chapter7_practice {

	public static void main(String[] args) {
//		1. 
//		int sum = 0;
//		for(int i = 1; i <= 10; i = i + 2) {
//			sum = sum + i;
//		}
//		System.out.println("1から10までの範囲での奇数の合計は" + sum + "です。");
		
//		2.
//		char m = '*';
//		for(int i = 0; i < 10; i++) {
//			System.out.print(m);
//		}
//		System.out.println();
		
//		2.　正答
//		int i;
//		String s = "";
//		for(i = 0; i < 10; i++) {
//			s = s + "*";
//			System.out.println(s);
//		}
		
//		3.
//		int i, sum;
//		i = 1;
//		sum = 0;
//		
//		while (i <= 10) {
//			sum = sum + i;
//			System.out.println("累計" + sum);
//			i++;
//		}
//		
//		System.out.println("合計" + sum);
		
//		4.
//		String n = "";
//		String m = "";
//		
//		for(int p = 0; p < 10; p++) {
//			for(int q = 0; q < 10; q++) {
//				m = m + "*";
//				System.out.println(m);
//			}
//			n = n + "$";
//			System.out.println(n);
//		}
		
//		4. 正答
//		for(int i = 0; i < 10; i++) {
//			String s = "";  // 宣言はループの中に書かないと、2巡目以降前回の値(**********)などが残ってしまう
//			for (int j = 0; j < 10; j++) {
//				if (i <= j) {
//					s = s +  "*";  // i=0の時はj=0~9までこちらで繰り返し処理が行われるため*が10個並ぶ
//				} else {
//					s = s + "$";  // i=1のtきはj=0の時だけこちらの処理になりs=$となる。その後は上の処理となり$1つ、*9つになる
//				}
//			}
//			System.out.println(s);
//		}
		
	}
	
}

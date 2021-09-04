package jp.learningjavatext.javastudy;

class Chapter7_2_2 {

	public static void main(String[] args) {
		
		System.out.println(1 + 2);
		System.out.println(1 + 2 + 3);
		System.out.println(1 + 2 + 3 + 4);
		System.out.println(1 + 2 + 3 + 4 +5);

		int i;
		
		for(i = 0; i <= 5; i = i + 1) {
			System.out.println("i = " + i);
		}
		
		// 1から5までの足し算プログラム
		int sum = 0;
		
		for(i = 0; i <= 5; i = i + 1) {
			sum = sum + i;
			System.out.println("sum = " + sum);
		}
		
		System.out.println("1+2+3+4+5=" + sum);
		
	}

}

package jp.learningjavatext.javastudy;

class Chapter7_2_1 {

	public static void main(String[] args) {
		// forの書式　処理を繰り返す回数が決まっている際に使用
		
		int i;
		
		for(i = 0; i < 5; i = i + 1) {
			System.out.println("Hello!");
		}
		
		// i = 0; :初期設定
		// i < 5; :繰り返すための条件（回数）、ここがfalseになれば（条件を満たさなくなれば）、処理が終了する
		// i = i + 1; :繰り返す処理が終わった時に実行する式
		
		for(i = 0; i <= 5; i = i + 1) {  // iは0から始まっているため、i <= 5の条件では繰り返し処理は6回繰り返されることに注意！
			System.out.println("Hello!");
		}

	}

}

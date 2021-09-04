package jp.learningjavatext.javastudy;

class Chapter7_3 {

	public static void main(String[] args) {
		// 条件指定の繰り返し　while
		int i = 0;
		
		while (i < 5) {
			System.out.println("Hello!");
			i++;
		}
		
		// 後判断　do while
		// 処理を実行した後に判定されるため、最初の1回はtrue,false関係なく実行される
		int j = 0;
		
		do  {
			System.out.println("Hello!");
			j++;
		} while (j < 5);
		
		
		// 多重ループ　九九のプログラミング
		for(int p = 1; p < 10; p++) {  // 式の中に変数宣言を含めることも可能
			for(int q = 1; q < 10; q++) {  // この中での処理が行われている間はpの値は変化しない
				System.out.print(p*q);       // 両方のループで同じ変数を使用してしまうと内側のループによる変数の増加が外側にも影響してしまうため注意！
			System.out.print(" ");         // そのため変数は2つ使用する
			}
			System.out.println();  // 中の処理が終わった時点（一段分の計算が終わった段階）で改行している
		}
		
		
		
	}
}
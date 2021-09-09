package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter4_2 {

	public static void main(String[] args) {
		// 4.5
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);	// 実行結果は1ではなく100になる
																// これは配列変数には、配列の先頭要素のアドレスが代入されており、
																		// arrayAのアドレスをarrayBに代入したことで、
																		// この2つの配列変数は同じメモリを共有したことになる
																		// そのため、arrayBの要素を変更すると、arrayAにも反映される
		System.out.println();
	
	
		// 4.6
		// ガベージコレクション
		boolean judge = true;
		if (judge == true) {
			int[] array = {1, 2, 3};	// この配列変数arrayは、23行目以降ではメモリから消滅するが、
		}														// newで確保された3つの要素は普通のヘンスではないため消滅しない
																// その結果、配列だけが残ってしまい、参照できる配列変数だけ存在しなくなてしまう
																// このメモリ内のゴミを、Javaではガベージコレクションによって自動的に片付けてくれるという仕組みがある
		
		int[] array = {1, 2, 3};
		array = null;	 // nullは「何もない」という意味、参照型変数に代入すると、その変数は何も参照しなくなる = 参照を切る
		// array[0] = 10; // int型などの基本変数系には代入することができない
											// 実行するとException(例外)エラーが出る
		
		// 4.7
		// 多次元の配列
		int[][] scores = new int[2][3];	 // [行数][列数]
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		
		System.out.println(scores[1][1]);
		System.out.println();
		
		// 多次元配列は実際には配列の中に配列が入っている
		int[][] scores2 = {{40, 50, 60}, {80, 60, 70}};
		System.out.print(scores2.length + " ");		// 親の配列の要素数は2のため2が出力される
		System.out.println(scores2[0].length);		// 子の配列の要素数は3のため3が出力される
		System.out.println();
		
		
		
	
	}	
	
	

}

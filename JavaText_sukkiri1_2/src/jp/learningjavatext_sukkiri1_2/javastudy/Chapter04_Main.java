package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter04_Main {

	public static void main(String[] args) {
		// 点数管理プログラム
		int sansu = 20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int syakai  = 80;
		
		int sum = sansu + kokugo + rika + eigo + syakai;
		int avg = sum / 5;
		
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
		System.out.println();
		
		// 配列の作成手順
		int[] scores;		// int型の要素を代入できる配列変数scoresを用意([]が必要)
		scores = new int[5];		// int型の要素を5つ作成してscoresに代入し、配列scoresの完成
		
		// 上記のコードは1行にまとめることもできる
		int[] scores2 = new int[5];
		
		// 配列の長さを調べる
		int[] scores3 = new int[5];
		int num = scores3.length;
		System.out.println("要素の数：" + num);
		System.out.println();
		
		// 配列の要素に値を代入
		int[] scores4;
		scores4 = new int[5];
		scores4[1] = 30;		// 配列のinedxは0から始まるため、scores[1]は2つ目の要素になる
		System.out.println(scores4[1]);
		System.out.println();
		
		// 初期化されていない変数を利用
//		int x;
//		System.out.println(x);		// 変数は初期化せずに代入するとコンパイルエラーになる
		
		// 配列は自動的に初期化される
		int[] scores5 = new int[5];
		System.out.println(scores5[0]);		// 値を代入していなくてもエラーにならない(0が出力される)
		System.out.println();
		
		// 省略記法
		int[] scores6 = new int[] {20, 30, 40, 50, 80};
		int[] scores7 = {20, 30, 40, 50, 80};
		
		// 配列を用いた点数管理プログラム
//		int scores8[] = {20, 30, 40, 50, 80};
//		int sum2 = scores8[1] + scores8[2] + scores8[3] + scores[4] + scores8[5];		// 6番目のindexは存在しない
//		int avg2 = sum / scores8.length;																						// よってこのコードはエラーとなる
//		System.out.println("合計点：" + sum2);																				// ArrayIndexOutOfBoundsException(例外)
//		System.out.println("平均点：" + avg2);																				// OutOfBoundsは「範囲外」という意味
//		System.out.println();
		
		// 上記のコードを正しく書き換えると、、、
		int scores8[] = {20, 30, 40, 50, 80};
		int sum2 = scores8[0] + scores8[1] + scores8[2] + scores8[3] + scores8[4];		// [5]の配列のindexは0~4番
		int avg2 = sum2 / scores8.length;
		System.out.println("合計点：" + sum2);
		System.out.println("平均点：" + avg2);
		System.out.println();
		
		// for文を使って配列を扱う
		int[] scores9 = {20, 30, 40, 50, 80};
		for (int i = 0; i < scores9.length; i++) {		// 0〜4の間でループする(indexの番号と同じになる)
			System.out.print(scores9[i] + " ");		// ループのたびにiの値が0〜4で変化する
		}
		System.out.println();
		System.out.println();
		
		// 点数管理プログラム(for文の利用)
		int[] scores10 = {20, 30, 40, 50, 80};
		int sum3 = 0;		// 集計結果を入れるための変数を初期化して準備(合計点は最初は0)
		for (int i = 0; i < scores10.length; i++) {
			sum3 += scores10[i];		// 一科目ずつ変数sumに合算する
		}
		int avg3 = sum3 / scores10.length;
		System.out.println("合計点：" + sum3);
		System.out.println("平均点：" + avg3);
		System.out.println();
		
		// 50点以上の科目の数を調べる
		int[] scores11 = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < scores11.length; i++) {
			if (scores11[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は：" + count);
		System.out.println();
		
		// DNAの記号をランダムに表示する
		int[] seq = new int[10];
		
		// 塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}

		// 生成した塩基配列の記号を表示
		for (int i = 0; i < seq.length; i++) {
			switch (seq[i]) {
				case 0:
					System.out.print("A ");
					break;
				case 1:
					System.out.print("T ");
					break;
				case 2:
					System.out.print("G ");
					break;
				case 3:
					System.out.print("C ");
					break;
			}
		}
		System.out.println();
		
		// よりスッキリしたコードの書き方
		char[] base = {'A', 'T', 'G', 'C'};
		for (int i = 0; i < seq.length; i++) {
			System.out.print(base[seq[i]] + " ");		// base[x]のxに変数seq[y](中にはそれぞれ0~3のランダムな数字が格納されている)が代入され、
		}																					// baseのindexに沿った要素が取り出される
		System.out.println();
		System.out.println();
		
		// 拡張for文
		// for (要素の型 任意の変数名 : 配列変数名) {…}
		int[] scores12 = {20, 30, 40, 50, 80};
		for (int value : scores12) {
			System.out.print(value + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// 実行結果は？
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		System.out.println();
		
		// ガベージコレクション
		boolean judge = true;
		if (judge == true) {
			int[] array = {1, 2, 3};
		}		// 宣言されたブロックが終了した時点で配列arrayはメモリから消失する
				// しかし、newされた3つの要素は残り、事実上メモリ内のゴミとなる
				// Javaではこのように不要になったメモリを自動的に探し片付けてくれる仕組みがある
				// = ガベージコレクション
		
		// null
//		int[] array2 = {1, 2, 3};
//		array2 = null;		// nullが代入されると、参照型の変数はどこも参照していない状態になる
//		array2[0] = 10; 	// このことを「参照を切る」という
//		System.out.println(array2[0]);		// 実行するとNullPointerExceptionの例外エラーが出る
		
		
		// 2次元配列の利用
		int[][] test = new int[2][3];		// [行の添え字][列の添え字]
		test[0][0] = 40;
		test[0][1] = 50;
		test[0][2] = 60;
		test[1][0] = 80;
		test[1][1] = 60;
		test[1][2] = 70;
		System.out.println(test[1][1]);
		System.out.println();
		
		// 親配列と子配列の要素数を表示
		int[][] test2 = {{40, 50, 60}, {80, 60, 70}};
		System.out.print(test2.length + " ");
		System.out.println(test2[0].length);
		System.out.println();

	}

}

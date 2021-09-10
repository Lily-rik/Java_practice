                                                   package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter4_1 {

	public static void main(String[] args) {
		// 4.1
		int sansu = 20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int syakai = 60;
		
		int sum = sansu + kokugo + rika + eigo + syakai;
		int avg = sum / 5;
		
		System.out.println("合計点"+ sum);
		System.out.println("平均点" + avg);
		System.out.println();
		
		
		// 4.2
		// 配列の作成手順
		int[] scores;	// 配列変数の宣言：int型の要素を代入できる配列変数、scoresを用意する
		scores = new int[5];	// 要素の作成と代入：int型の要素を5つ作成し、scoresに代入することで配列scoresの完成
					// new演算子：指定された型の要素を[]内に指定された数だけ作成する
		
		// 配列変数の宣言と、要素の作成、代入を同時に行うこともできる
		int[] scores2 = new int[5];
		int num = scores2.length;	// lengthは要素の数を取得するメソッド
		System.out.println("要素の数：" + num);
		System.out.println();
		
		scores[1] = 30;		// 配列は[0]から始まるため、[1]は2つ目の要素となる
		System.out.println(scores[1]);
		System.out.println();
		
		// 配列の初期化
		System.out.println(scores[0]);	// [0]は初期化していないが、int型の要素を持つ配列を用意した場合、
		System.out.println();						// 5つの要素は全て0で初期化されるため、左記の出力は0となる
																		// 変数の値は初期化しないとコンパイルエラーになる
		// 初期化は要素の型によって決まっている
		// int,doubleなどの数値の型：0
		// boolean型：false
		// String型：null
		
		int[] scores3 = new int[] {20, 30, 40, 50, 80};		// 省略記法①
		int[] scores4 = {20, 30, 40 ,50, 80};		// 省略記法②

		
		// 4.3
		// 配列を用いた点数管理プログラム
		int[] scores5 = {20, 30, 40, 50, 80};
		int sum2 = scores5[0] + scores5[1] + scores5[2] + scores5[3] + scores[4];		// 配列のindexは0からであることに注意！
		int avg2 = sum2 / scores5.length;
		
		System.out.println("合計点" + sum2);
		System.out.println("平均点" + avg2);
		System.out.println();
		
		
		// 4.4
		// for文を使用して配列を扱う
		for (int i = 0; i < scores5.length; i++) {
			System.out.print(scores5[i] + " ");	// 添え字にはループ変数を指定しているため、ループのたびに1ずつ増え、
		}																	// 結果として配列の先頭から最後までを順にアクセスすることになる
		System.out.println();							// このことを「配列を回す」ともいう
		System.out.println();
		
		// 点数管理プログラム(for文を使用)
		int[] scores6 = {20, 30, 40, 50, 80};
		int sum3 = 0;		// 集計結果を入れるための変数を初期化して準備、初期値は0
		
		for (int j = 0; j < scores6.length; j++) {
			sum += scores6[j];	// 一科目ずつ変数sumに合算する
		}
		
		int avg3 = sum3 / scores6.length;
		System.out.println("合計点" + sum2);
		System.out.println("平均点" + avg2);
		System.out.println();
		
		// 条件と一致する要素の数を調べる
		int count = 0;
		
		for (int i = 0; i < scores6.length; i++) {
			if (scores6[i] >= 50) {
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
		System.out.println();
		
		// 上記のswitch文はやや冗長なため、下記のように配列を用いて角変えることもできる
		char[] base = {'A', 'T', 'G', 'C'};
		for (int i = 0; i < seq.length; i++) {
			System.out.print(base[seq[i]] + " ");
		}
		System.out.println();
		System.out.println();
		
		// 拡張for文
		for (int value : scores6) {					// 要素の型 任意の変数名 : 配列変数名
			System.out.print(value + " ");		// この書き方で配列を回すことができる
		}
		System.out.println();
		System.out.println();

	}

}

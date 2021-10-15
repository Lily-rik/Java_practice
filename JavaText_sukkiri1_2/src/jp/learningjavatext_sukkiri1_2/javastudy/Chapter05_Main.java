package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter05_Main {
	// メソッドの書き順は関係ない、実行時には必ずmainメソッドが呼び出され、処理内容順に呼び出される
	public static void main(String[] args) {
	// シンプルなメソッドの定義
		System.out.println("メソッドを呼び出します");
		hello();
		System.out.println("メソッドの呼び出しが終わりました");
		System.out.println();
		
	// mainメソッド以外からメソッドを呼び出す
		methodA();
		System.out.println();
		
	// 引数の例(取り出す値が1つの場合)
		System.out.println("メソッドを呼び出します");
		hello2("湊");
		hello2("朝香");
		hello2("菅原");
		System.out.println();
		
	// 複数の値を受け取るaddメソッド
		add(100, 20);
		add(200, 50);
		System.out.println();
		
	// 引数を使わずに値を渡せないのか、、、？
//		int x = 100;	// 変数x,yはadd2()メソッド内のスコープの範囲外であるため、結果はエラーになる
//		int y = 10;		// mainメソッドで宣言した変数はmainメソッド内のブロックでしか使用できない！
//		add2();				// メソッド内で宣言した変数をローカル変数という
		 
	// 戻り値の例
		int ans = add3(100, 10);
		System.out.println("100+10=" + ans);
		System.out.println();
		
	// 戻り値をそのまま使う
		System.out.println(add3(add3(10, 20), add3(30, 40)));
													// add3(10, 20)の戻り値は30、add3(30, 40)の戻り値は70
													// つまりadd3(30, 70)となり、
													// 最終的な戻り値は100となり出力される
		System.out.println();
		
	// オーバーロード(引き数の型が異なる場合)
		// 仮引数の型が異なれば同じ名前のメソッドを複数定義することができる
		System.out.println(calc(10, 20));								// 1つ目のcalcメソッドが呼び出される
		System.out.println(calc(3.5, 2.7));							// 2つ目のcalcメソッドが呼び出される
		System.out.println(calc("Hello ", "World"));		// 3つ目のcalcメソッドが呼び出される
		System.out.println();
		
	// オーバーロード(引数が異なる場合)
		// JVMは引数の型と個数を比較して一致する方のメソッドを呼び出してくれる
		System.out.println("10+20=" + calc2(10, 20));						// 1つ目のcalc2メソッドが呼び出される
		System.out.println("10+20+30=" + calc2(10, 20, 30));		// 2つ目のcalc2メソッドが呼び出される
		System.out.println();
		
	// 引数に配列を受け取るメソッドの利用
		int[] array = {1, 2, 3};
		printArray(array);		// 引数arrayが渡しているのは配列まるごとではなく、アドレス情報のみであることに注意！
		System.out.println();
		System.out.println();
		
	// 同じ配列を参照していることを確認する
		int[] array2 = {1, 2, 3};
		incArray(array2);
		for (int i : array2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
	// 戻り値が配列の場合
		int[] array3 = makeArray(3);
		for (int i : array3) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	// シンプルなメソッドの定義
	public static void hello() {
		System.out.println("湊さん、こんにちは");
	}
	
	// mainメソッド以外からメソッドを呼び出す
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	
	// 引数の例(取り出す値が1つの場合)
	public static void hello2(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	
	// 複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
	
	// 引数を使わずに値を渡せないのか、、、？
//	public static void add2() {
//		ans = x + y;
//		System.out.println(x + "+" + y + "=" + ans);
//	}
	
	// 戻り値の例
	public static int add3(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	// return文の後に処理は書けない
//	public static int sample() {
//		return 1;			// returnは値を返すだけでなく、メソッドを終了する役割もある
//		int x =10;		// この文が実行されることはないためエラーになる
//	}
	
	// オーバーロード(引き数の型が異なる場合)
	// 1つ目のcalcメソッド
	public static int calc(int x, int y) {
		return x + y;
	}
	
	// 2つ目のcalcメソッド
	public static double calc(double x, double y) {
		return x + y;
	}
	
	// 3つ目のcalcメソッド
	public static String calc(String x, String y) {
		return x + y;
	}
	
	
	// オーバーロード(引数が異なる場合)
	// 1つ目のcalc2メソッド
	public static int calc2(int x, int y) {
		return x + y;
	}
	
	// 2つ目のcalc2メソッド
	public static int calc2(int x, int y, int z) {
		return x + y + z;
	}
	
	
	// 引数に配列を受け取るメソッドの利用
	// int型配列を受け取り、全ての要素を表示するメソッド
	public static void printArray(int[] array) {
		for (int element : array) {		// element = 要素
			System.out.print(element + " ");
		}
	}
	
	// 同じ配列を参照していることを確認する
	// int型配列を受け取り、配列何の全ての要素に1を加えるメソッド
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	// 戻り値が配列の場合
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	
	
	
	
	
	
	
	
	
}

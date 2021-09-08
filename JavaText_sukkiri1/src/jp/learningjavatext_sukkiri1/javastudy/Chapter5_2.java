package jp.learningjavatext_sukkiri1.javastudy;

class Chapter5_2 {

	public static void main(String[] args) {
		// 仮引数の型が異なっていれば、実引数を見て、その引数の型に一致するメソッドを呼び出してくれる
		System.out.println(add(10, 20));	// 1つ目のaddメソッドが呼び出される
		System.out.println(add(3.5, 2.7));	// 2つ目のaddメソッドが呼び出される
		System.out.println(add("Hello ", "World"));	// 3つ目のaddメソッドが呼び出される
		System.out.println();
		
	// 仮引数の個数が異なっても、実引数を見て、その引数の個数に一致するメソッドを呼び出してくれる
		System.out.println("10+20=" + add2(10, 20));	// 1つ目のad2dメソッドが呼び出される
		System.out.println("10+20+30=" + add2(10, 20, 30));	// 2つ目のadd2メソッドが呼び出される
		System.out.println();
		
		
		int[] array = {1, 2, 3};
		printArray(array);	// printArrayメソッドに配列arrayを引数として渡している
		System.out.println();
		System.out.println();	
		
		int[] array2 = {1, 2, 3};
		incArray(array2);	// incArrayメソッドに配列array2を引数として渡している
		for (int i : array2) {				// 変数の場合は戻り値を持ってこないとここの出力はmainメソッド内の変数の値になるが、
			System.out.print(i + " ");	// 配列の場合は参照渡しといい、呼び出し元で加えた変更が呼び出し元にも影響するため、
		}															// ここでの出力は(2,3,4)となる
		System.out.println();
		System.out.println();
		
		
		int[] array3 = makeArray(3);		// makeArrayメソッドに3を引数として渡している
		for (int i : array3) {					// また、戻り値で返ってきた先頭要素のアドレを自身で宣言した配列変数array3に代入している
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

	}	
	
	
	
	// 5.4
	// オーバーロード
	// Javaでは、仮引数が異なれば同じ名前のメソッドを複数定義することが許可されている	
	public static int add(int x, int y) {		// 1つ目のaddメソッド
		return x + y;
	}
	public static double add(double x, double y) {		// 2つ目のaddメソッド
		return x + y;
	}
	public static String add(String x, String y) {		// 3つ目のaddメソッド
		return x + y;
	}
	
	// 型だけではなく、個数が異なる場合もオーバーロード可能である
	public static int add2(int x, int y) {	// 1つ目のadd2メソッド
		return x + y;
	}
	public static int add2(int x, int y, int z) {		// 2つ目のadd2メソッド
		return x + y + z;
	}
	
	
	// 5.5
	//引数に配列を受け取るメソッドの利用
	public static void printArray(int[] array) {	// 引数に配列型int[]を指定、今回戻り値はないのでvoidを使用
		for(int element : array) {
			System.out.print(element + " ");
		}
	}
	
	// 参照渡し
	public static void incArray(int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			array2[i]++;		// 配列内の要素全てに1を加える
		}
	}
	
	// 戻り値が配列の場合
	public static int[] makeArray(int size) {		// int型配列を作成して戻すメソッド、配列を戻す際は、型名に[]をつける
																							// mainメソッドから呼び出しとともに3を引数でもらっているので、size変数の値は3
		int[] newArray = new int[size];		// size変数= 3なので、インデックス0~2の配列変数newArrayが作成された
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;	// インデックスの中にそれぞれ0~2の値が代入された
		}
		return newArray;	// 配列の先頭要素のアドレスがmainメソッドに戻される
	}	
	
}

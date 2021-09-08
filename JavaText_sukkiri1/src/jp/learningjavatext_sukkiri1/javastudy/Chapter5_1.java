package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter5_1 {
	
	public static void main (String[] args) {		// メソッドをどのような順序で記述しても、必ずmainメソッドから読み込まれる
		System.out.println("メソッドを呼び出します");
		hello();  // メソッドの呼び出し
		System.out.println("メソッドの呼び出しが終わりました");
		System.out.println();
		
		
		methodA();
		System.out.println();
		
		
		System.out.println("メソッドを呼び出します");
		hello2("湊");	// hello2メソッドの呼び出しをおこない、引数に「湊」を渡している
		hello2("朝香");
		hello2("菅原");
		System.out.println("メソッドの呼び出しが終わりました");
		System.out.println();
		
		
		add(100, 20);		// 100と200の2つの引数を渡してaddメソッドを呼び出している
		add(200, 50);		// 渡す値 = 実引数
		System.out.println();
		
		
		int ans2 = add2(100, 10);										// add2メソッドの呼び出しで100,10の値も一緒に渡している
		System.out.println("100 + 10 = " + ans2);		// その後add2メソッド内で処理され、returnが戻り値として返ってきている
		System.out.println();
		
		
		System.out.println(add3(add3(10, 20), add3(30, 40)));		//(add3(30, 70))となってadd3メソッドが再び呼び出され、
														// 返り値：30			返り値：70					返り値：100となり画面では100と出力される
		System.out.println();
		
	}
	
	
	
	// 5.1
	public static void hello() {	// helloがメソッド名、{}で囲まれた部分がメソッドブロック
		System.out.println("湊さん、こんにちは！");
	}

	// mainメソッド以外からの呼び出し
	// メソッドの順序には意味や制約はない、同列の存在である
	public static void methodA() {			// 引数がない場合でも、「何も渡さない」ということを定義するために
		System.out.println("methodA");		// 必ずメソッド名の後には()をつける
		methodB();
	}
	
	public static void methodB() {
		System.out.println("methodB");
	}
	
	
	//5.2
	public static void hello2(String name) {	// 引数として受け取った値を文字列変数のnameに格納している
		System.out.println(name + "さん、こんにちは");		// 変数nameに格納された値を使用している
	}
	
	// 複数の引数を渡す
	// 引数として渡される値と、メソッド側で宣言する変数の型と順番を泡褪せておく必要があることに注意！
	public static void add(int x, int y) {	// 2つのメソッドを受け取る整数型変数を用意　受け取る変数 = 仮引数
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
	
	
	// 5.3
	// 戻り値
	public static int add2(int p, int q) {	// voidは「何もない」という意味、戻り値がある時はその型を書く
		int ans2 = p + q;
		return ans2;	// 戻り値はひとつしか用意できない
	}
	
	// 戻り値をそのまま使用する
	public static int add3(int m, int n) {
		int ans3 = m + n;
		return ans3;	// return値はメソッドの終了も行うため、その後に処理を書かないように注意！
	}

}
	
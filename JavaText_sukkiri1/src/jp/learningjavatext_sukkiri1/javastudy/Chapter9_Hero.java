package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter9_Hero {
	String name;
	int hp;
	Chapter9_Sword sword;	// あるクラスが別のクラスをフィールドとして利用している関係をhas-aの関係という
												// Hero (has-a) Sword = 勇者は剣を持っている
	
	public Chapter9_Hero (String name) {		// 通常のメソッドは「誰かから呼ばれないと動かない」ものであるが、
																					// クラス名のメソッドだけは、「このクラスが生成された直後に自動的に実行される」
																					// という特別な性質を持っている
																					// このようなメソッドをコンストラクタという
																					// また、引数として値を受け取り、受け取った値を初期化することもできる
		this.hp = 100;			// hpフィールドを100で初期化
		this.name = name;		// 引数の値でnameフィールドを初期化
												// このように引数の変数と名前が同じ場合があるため、このクラス内で使用する変数には、変数の前にthisをつける
	}	
	
	// コンストラクタを作成したことによって、インスタンスを生成する時には必ず名前を指定する必要が生じたため、
	// 引数なしで実行しようとするとエラーになってしまう
	// そのため、「引数を受け取らないコンストラクタ」も同時に定義することで解決できる
	
//	public Chapter9_Hero () {		// オーバーロードはコンストラクタにおいても使用できるため、
//		this.hp = 100;						// 引数が何もない時はJVMはこちらのメソッドを使用してコンストラクタを行ってくれる
//		this.name = "ダミー";
//	}
	
	// 上記の記述であると、メソッドごとに重複が多くなったり、変更の際全てを書き換えなくてはならない
	// そのため、下記のように同一クラスの別のコンストラクタ呼び出す記述を行う
	public Chapter9_Hero () {
		this("ダミー");			// 「this(引数)」は、同一クラスの別コンストラクタを呼ぶ出す記述
											// コンストラクタを呼び出せるのはJVMのみであるため、
											// this.Chapter9_Hero("ダミー")の記述で開発者が直接呼び出すことは不可である
	}
	
	public void attack() {
		System.out.println(this.name + "は、" + this.sword.name + "攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}

}

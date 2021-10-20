package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter09_Practice_Thief {
	
// 9-1
	String name;
	int hp;
	int mp;
	
	public Chapter09_Practice_Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Chapter09_Practice_Thief(String name, int hp) {
		this(name, hp, 5);
	}
	
	public Chapter09_Practice_Thief(String name) {
//		this(name, 40, 5);		// 自分の回答
		this(name, 40);					// 解答
														// 引数を2つにすると2番目のコンストラクタが呼び出され、mpは初期値5がすでに入っている造替になるため
	}

}

// 9-2
// 	実行結果		// 自分の回答
//	25:25
//	35:35

//	実行結果		// 解答
//	25:25			// healメソッドには戻り値がないため、int型のbaseHpを渡しても呼び出し元の値は変化しないため値は25
//	25:35			// しかし、Thief型はThiefインスタンスのアドレスを参照しているため、メソッドの引数としてt.baseHpの値(アドレス)が代入されると。
							// t.thiefとt.hpは同じアドレスを指し、同じhpを共有することになる
							// そのため、戻り値がなくてもメソッド内での変化が呼び出し元の値にも影響するため

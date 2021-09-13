package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter9_Main {

	public static void main(String[] args) {
		// 剣インスタンスの生成
		Chapter9_Sword s = new Chapter9_Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		// 勇者インスタンスの生成
		Chapter9_Hero h1 = new Chapter9_Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		h1.sword = s;

		Chapter9_Hero h2 = new Chapter9_Hero();		// 引数を渡さずインスタンスを生成した場合、
//		h2.name = "アサカ";												// オーバーロードによってnameには"ダミー"が代入される
		h2.hp = 100;
		System.out.println(h2.name);
		System.out.println();
		
		Chapter9_Hero h3 = new Chapter9_Hero("スガワラ");		// コンストラクタとしてhp=100を定義しているため、
		System.out.println(h3.hp);												// h3のhpに値を何も代入しなくても、hp=100(初期値)が表示される
		System.out.println(h3.name);											// コンストラクタはインスタンス生成と同時にJVMによって呼び出されるものであるため、
		System.out.println();														 	// 開発者がプログラムで直接呼び出すことはできない
																											// また、Heroクラスで仮引数の定義をすることで、
																											// こちらで実引数を渡すとその値をインスタンスの生成と同時に初期化することができる
		
		// 魔法使いインスタンスの生成
		Chapter9_Wizard w = new Chapter9_Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		// 剣で攻撃する
		System.out.println("現在の武器は、" + h1.sword.name);
		h1.attack();
		System.out.println();
		
		// 魔法で勇者を回復する
		w.heal(h1);		// 引数にミナトのインスタンス(の参照番地)を渡している
		w.heal(h2);		// 引数にアサカのインスタンス(の参照番地)を渡している
		w.heal(h2);
		System.out.println();
		
	}

}

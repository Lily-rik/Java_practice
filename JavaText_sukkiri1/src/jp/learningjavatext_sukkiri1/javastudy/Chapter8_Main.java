package jp.learningjavatext_sukkiri1.javastudy;

// 指示を送るメインメソッドを持つメインクラスを作成する
public class Chapter8_Main {
	public static void main (String[] args) {
		// （以下の内容をJavaで記述していく）
		// 勇者よ、この仮想世界に生まれよ！
		// お化けキノコよ、この仮想世界に生まれよ！
		// 勇者よ、戦え！
		// お化けキノコよ、逃げろ！
		
		// 1.勇者を生成
		Chapter8_Hero h = new Chapter8_Hero();	// Heroクラスからインスタンスを生成し、変数hに入れる
		// 2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		// 勇者のメソッドを呼び出していく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		System.out.println();
		
		// お化けキノコを2匹生成する
		Chapter8_Matango m1 = new Chapter8_Matango();		// 1匹目生成
		m1.hp = 50;
		m1.suffix = 'A';
		
		Chapter8_Matango m2 = new Chapter8_Matango();		// 2匹目生成
		m2.hp = 48;
		m2.suffix = 'B';
		
		
		// 冒険の始まり
		h.slip();
		m1.run();
		m2.run();
		h.run();
		
		
		
	}

}

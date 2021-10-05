package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter14_Main {
	public static void main(String[] args) {
		Chapter14_Empty e = new Chapter14_Empty();
		String s = e.toString();
		System.out.println(s);
		System.out.println();
		
		// Object型の変数にはどんなインスタンスでも代入できる
		Object o1 = new Chapter14_Empty();
		Object o2 = new Chapter14_Hero();
		Object o3 = "こんにちは";
		
		Chapter14_Hero h = new Chapter14_Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println(h.toString());
		// HeroクラスにはtoString()が宣言されていないため、
		// 動作するのはObjectクラスで宣言され継承されたtoString()
		// そのため結果は「型名@英数字」となる
		// 表示を帰るにはクラス内でのオーバーライドが必要となる
		
		Chapter14_Hero h1 = new Chapter14_Hero();
		h1.name = "ミナト";
		h1.hp = 150;
		Chapter14_Hero h2 = new Chapter14_Hero();
		h2.name = "ミナト";
		h2.hp = 150;
		System.out.println();
		
		// 文字列には==ではなくequals()を用いる
		// 等値：同一の存在であること(同じアドレスを指している)
		// 等価：同じ内容であること(同じアドレスをさしていなくてもよい)
		// String型は参照型であるため、equals()での判定が必要である
		if (h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
		System.out.println();
		
		
		// 静的フィールド = クラス変数と言われることもある
		// 1.フィールド変数の実態がクラスに準備される
		// 2.全インスタンスに箱の分身が準備される
		// 3.インスタンスを1つも生み出さなくても共有の箱が利用可能になる
		Chapter14_Hero.money = 100;
		System.out.println(h1.hp);	// インスタンスh1の箱hpを表示
		System.out.println(Chapter14_Hero.money);		// クラスHeroの箱moneyを表示
		System.out.println(h1.money);
		h1.money = 300;
		System.out.println(h2.money);
		System.out.println();
		
		// 1人も勇者を生み出していない状況でも静的フィールドは利用することができる
		Chapter14_Hero.money = 100;
		System.out.println(Chapter14_Hero.money);
		System.out.println();
		
		
		Chapter14_Hero.setRandomMoney();	// クラス名.メソッド名で呼び出し可能
		System.out.println(Chapter14_Hero.money);		// ランダムな金額を表示
		Chapter14_Hero h3 = new Chapter14_Hero();
		System.out.println(h3.money);		// 同じ額を表示(クラス単位で共有しているため)
		System.out.println();
		
		
	}
	
	// Object型の実数は、あらゆる参照型のインスタンスを格納できる 
	public void PrintAnything(Object o) {
		// 何型でもいいから、引数をひとつ受け取り画面に表示する
		System.out.println(o.toString());
	}	

}






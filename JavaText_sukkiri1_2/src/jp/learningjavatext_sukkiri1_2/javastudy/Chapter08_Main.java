package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter08_Main {

	public static void main(String[] args) {
		// 1.勇者インスタンスを生成
		Chapter08_Hero h = new Chapter08_Hero();		// インスタンスをnewで生成し、それをHero型の変数hに=で代入している
		
		// 2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		// 3.勇者メソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		System.out.println("");
		
		
		Chapter08_Matango m1 = new Chapter08_Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Chapter08_Matango m2 = new Chapter08_Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		
		// 冒険の始まり
		h.slip();
		m1.run();
		m2.run();
		h.run();
		
	}

}
